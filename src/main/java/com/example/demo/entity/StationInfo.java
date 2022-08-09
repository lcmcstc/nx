package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ken
 * @since 2022-08-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("stationInfo")
public class StationInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("sNo")
    private Integer sNo;

    @TableField("theName")
    private String theName;

    @TableField("isUse")
    private Boolean isUse;

    @TableField("chargeType")
    private Integer chargeType;

    @TableField("lineNum")
    private Integer lineNum;

    @TableField("userType")
    private Integer userType;

    @TableField("ybType")
    private Integer ybType;

    private Integer addr;

    @TableField("dtuID")
    private String dtuID;

    @TableField("comType")
    private Integer comType;

    private Float frange;

    private Float trange;

    private Float prange;

    private Float fupa;

    private Float fdowna;

    private Float tupa;

    private Float tdowna;

    private Float pupa;

    private Float pdowna;

    @TableField("telNo")
    private String telNo;

    @TableField("yeAlarmNum")
    private Float yeAlarmNum;

    @TableField("cutValveNum")
    private Float cutValveNum;

    @TableField("ICCardNum")
    private String ICCardNum;

    @TableField("useIC")
    private Boolean useIC;

    @TableField("fHour")
    private Integer fHour;

    @TableField("eHour")
    private Integer eHour;

    @TableField("adcUse")
    private Boolean adcUse;

    @TableField("gfKey")
    private Integer gfKey;

    private Float plrange;

    private Float pldowna;

    private Float plupa;


}
