package com.example.demo.service;

import com.example.demo.entity.DataView.RealData_Left_List;
import com.example.demo.entity.RealData;
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
public interface RealDataService extends IService<RealData> {
    RealData getByStation(int stationId);

    List<RealData_Left_List> RealData_left_list_all();
}
