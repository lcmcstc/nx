package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@TableName("realData")
public class RealData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 站号
     */
    private Integer station;

    /**
     * 流量
     */
    private Float f;

    /**
     * 频率/压差
     */
    private Float pl;

    /**
     * 温度
     */
    private Float t;

    /**
     * 压力
     */
    private Float p;

    /**
     * 密度
     */
    private Float md;

    /**
     * 总量
     */
    private Float tot;

    /**
     * 余额
     */
    private Float ye;

    /**
     * 通讯状态
     */
    @TableField("comState")
    private Boolean comState;

    /**
     * 时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    private Date thetime;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    @TableField("recTime")
    private Date recTime;

    /**
     * 阀门状态
     */
    @TableField("valveDI")
    private Boolean valveDI;

    @TableField("isOnLine")
    private Boolean isOnLine;

    /**
     * 门开关
     */
    @TableField("doorOpen")
    private Boolean doorOpen;

    /**
     * 交/直流电工作情况
     */
    @TableField("isDc")
    private Boolean isDc;

    /**
     * 电池电压
     */
    private Float voltage;

    @TableField("outPowerNum")
    private Integer outPowerNum;

    /**
     * 流量报警
     */
    @TableField("fAlarm")
    private Integer fAlarm;

    /**
     * 频率/压差报警
     */
    @TableField("plAlarm")
    private Integer plAlarm;

    /**
     * 温度报警
     */
    @TableField("tAlarm")
    private Integer tAlarm;

    /**
     * 压力报警
     */
    @TableField("pAlarm")
    private Integer pAlarm;

    @TableField("vAlarm")
    private Boolean vAlarm;

    @TableField("fPrice")
    private Float fPrice;

    @TableField("isAuto")
    private Boolean isAuto;


}
