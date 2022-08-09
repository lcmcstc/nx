package com.example.demo.service;

import com.example.demo.entity.DataView.StationInfo_draw_list;
import com.example.demo.entity.StationInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ken
 * @since 2022-08-09
 */
public interface StationInfoService extends IService<StationInfo> {
    List<StationInfo_draw_list> StationInfo_draw_list();
}
