package com.example.demo.service.impl;

import com.example.demo.entity.DataView.RealData_Left_List;
import com.example.demo.entity.RealData;
import com.example.demo.mapper.RealDataMapper;
import com.example.demo.service.RealDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ken
 * @since 2022-08-09
 */
@Service
public class RealDataServiceImpl extends ServiceImpl<RealDataMapper, RealData> implements RealDataService {

    @Override
    public RealData getByStation(int stationId) {
        return baseMapper.getByStation(stationId);
    }

    @Override
    public List<RealData_Left_List> RealData_left_list_all() {
        return baseMapper.RealData_left_list_all();
    }
}
