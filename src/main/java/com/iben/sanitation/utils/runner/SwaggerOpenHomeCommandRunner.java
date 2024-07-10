package com.iben.sanitation.utils.runner;

import com.iben.sanitation.utils.SpringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * spring boot 容器加载后自动监听
 * 运行条件 开发环境 开启 swagger
 * 根据系统环境 确定执行 自动加载指定的页面
 */
@Slf4j
@Component
public class SwaggerOpenHomeCommandRunner implements CommandLineRunner {

    @Value("${springdoc.enable-print-url}")
    private Boolean enablePrintUrl;

    @Override
    public void run(String... args) {
        if (enablePrintUrl && SpringUtil.doesDev()) {
            try {

                Environment env = SpringUtil.getApplicationContext().getEnvironment();
                // String ip = InetAddress.getLocalHost().getHostAddress();
                String ip = "http://localhost";
                String port = env.getProperty("server.port");
                String uriPrefix = env.getProperty("server.servlet.context-path");
                if (StringUtils.isEmpty(uriPrefix)) {
                    uriPrefix = "/";
                }
                String uriKnife4jSuffix = "/doc.html";
                String uriSwaggerSuffix = "/swagger-ui/index.html";
                String finalUrl = ip + ":" + port + uriPrefix;

                log.info(new Date() + "\n -- \n----------------------------------------------------------\n\t" +
                        "Application  is running! Access URLs:\n\t" +
                        "Knife4j 访问网址: \t\t" + finalUrl + uriKnife4jSuffix + "\n\t" +
                        "swagger 访问网址: \t\t" + finalUrl + uriSwaggerSuffix + "\n\t" +
                        "----------------------------------------------------------");

                String lowerCase = System.getProperty("os.name").toLowerCase();
                Boolean doesLinuxServer = lowerCase.contains("linux");
                if (doesLinuxServer) {
                    log.warn(new Date() + " -- Running on Linux Server");
                    return;
                }
                Boolean doesWindowsServer = lowerCase.contains("windows");

//                if (doesWindowsServer) {
//                    log.warn(new Date() + " -- Running on Windows Server");
//                    Runtime.getRuntime().exec("cmd /c start " + finalUrl);
//                }

            } catch (Exception ex) {
                ex.printStackTrace();
                log.warn(new Date() + " -- SwaggerOpenHomeCommandRunner  Exception class: " + ex.getClass());
            }
        }
    }

}
