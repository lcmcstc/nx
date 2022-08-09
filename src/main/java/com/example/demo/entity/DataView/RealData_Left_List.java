package com.example.demo.entity.DataView;

import lombok.Data;


@Data
public class RealData_Left_List {

    /**
     * 站名
     */
    private String theName;

    public void setTheName(String theName) {
        this.theName = theName.trim();
    }

    /**
     * 流量
     */
    private Float f;


    /**
     * 温度
     */
    private Float t;

    /**
     * 压力
     */
    private Float p;

}
