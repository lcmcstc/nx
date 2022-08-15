package com.example.demo.service.impl;

import com.example.demo.entity.DataView.Station_Location;
import com.example.demo.mapper.StationLocationMapper;
import com.example.demo.service.StationLocationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ken
 * @since 2022-08-15
 */
@Service
public class StationLocationServiceImpl extends ServiceImpl<StationLocationMapper, com.example.demo.entity.StationLocation> implements StationLocationService {

    @Override
    public List<Station_Location> getDto() {
        return baseMapper.getDto();
    }
}
