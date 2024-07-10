//package com.iben.sanitation.mbg;
//
//import java.sql.Types;
//import java.util.Collections;
//
///**
// * @author qquan
// * @date 2024-07-10 16:27
// */
//public class MPCodeGenerator {
//
//
//    public static void main(String[] args) {
//        FastAutoGenerator.create("url", "username", "password")
//                .globalConfig(builder -> {
//                    builder.author("baomidou") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
//                            .outputDir("D://"); // 指定输出目录
//                })
//                .dataSourceConfig(builder ->
//                        builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
//                            int typeCode = metaInfo.getJdbcType().TYPE_CODE;
//                            if (typeCode == Types.SMALLINT) {
//                                // 自定义类型转换
//                                return DbColumnType.INTEGER;
//                            }
//                            return typeRegistry.getColumnType(metaInfo);
//                        })
//                )
//                .packageConfig(builder ->
//                        builder.parent("com.baomidou.mybatisplus.samples.generator") // 设置父包名
//                                .moduleName("system") // 设置父包模块名
//                                .pathInfo(Collections.singletonMap(OutputFile.xml, "D://")) // 设置mapperXml生成路径
//                )
//                .strategyConfig(builder ->
//                        builder.addInclude("t_simple") // 设置需要生成的表名
//                                .addTablePrefix("t_", "c_") // 设置过滤表前缀
//                )
//                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
//                .execute();
//    }
//
//}
