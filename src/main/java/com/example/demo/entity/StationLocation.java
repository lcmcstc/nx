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
 * @since 2022-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("stationLocation")
public class StationLocation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("sNo")
    private Integer sNo;

    private Float lng;

    private Float lat;


}
