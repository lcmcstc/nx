package com.example.demo.mapper;

import com.example.demo.entity.DataView.Station_Location;
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
 * @since 2022-08-15
 */
@Mapper
public interface StationLocationMapper extends BaseMapper<com.example.demo.entity.StationLocation> {
    @Select("select b1.*,b2.theName from stationLocation b1 left join stationInfo b2 on b1.sno=b2.sno")
    List<Station_Location> getDto();
}
