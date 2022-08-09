package com.example.demo.entity.DataView;

import lombok.Data;

@Data
public class StationInfo_draw_list {

    private Integer sNo;

    private String theName;

    public void setTheName(String theName) {
        this.theName = theName.trim();
    }
}
