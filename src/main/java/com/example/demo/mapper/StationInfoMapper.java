package com.example.demo.mapper;

import com.example.demo.entity.DataView.StationInfo_draw_list;
import com.example.demo.entity.StationInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;
/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ken
 * @since 2022-08-09
 */
@Mapper
public interface StationInfoMapper extends BaseMapper<StationInfo> {
    @Select("select sno,theName from stationInfo;")
    List<StationInfo_draw_list> StationInfo_draw_list();
}
