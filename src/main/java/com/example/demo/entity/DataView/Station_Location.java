package com.example.demo.entity.DataView;

import lombok.Data;

@Data
public class Station_Location extends com.example.demo.entity.StationLocation {
    private String theName;
    public void setTheName(String theName) {
        this.theName = theName.trim();
    }
}
