package com.iben.sanitation.kafka.data;

import lombok.Data;

import java.sql.Timestamp;

/**
 * kafka 里传输过来的车辆实时位置信息
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/10 20:24
 */
@Data
public class RealVehiclePointData {
  /**
   * 车辆ID
   */
  private Integer vehicleId;
  /**
   * 车牌号码
   */
  private String plateNo;
  /**
   * 接收时间
   */
  private Timestamp sendTime;
  /**
   * 速度
   */
  private String speed;
  /**
   * 方位
   */
  private String dirStr;

  /**
   * 经度
   */
  private Double longitude;
  /**
   * 纬度
   */
  private Double latitude;
  /**
   * 有效/无效
   */
  private Integer valid;
  /**
   * 里程数
   */
  private Double mileage;
  /**
   * 地址
   */
  private String address;


}
