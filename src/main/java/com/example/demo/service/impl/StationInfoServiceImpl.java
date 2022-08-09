package com.example.demo.service.impl;

import com.example.demo.entity.DataView.StationInfo_draw_list;
import com.example.demo.entity.StationInfo;
import com.example.demo.mapper.StationInfoMapper;
import com.example.demo.service.StationInfoService;
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
public class StationInfoServiceImpl extends ServiceImpl<StationInfoMapper, StationInfo> implements StationInfoService {

    @Override
    public List<StationInfo_draw_list> StationInfo_draw_list() {
        return baseMapper.StationInfo_draw_list();
    }
}
