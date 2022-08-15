package com.example.demo.service;

import com.example.demo.entity.DataView.Station_Location;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ken
 * @since 2022-08-15
 */
public interface StationLocationService extends IService<com.example.demo.entity.StationLocation> {
    List<Station_Location> getDto();
}
