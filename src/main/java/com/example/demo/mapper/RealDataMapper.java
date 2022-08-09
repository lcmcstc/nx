package com.example.demo.mapper;

import com.example.demo.entity.DataView.RealData_Left_List;
import com.example.demo.entity.RealData;
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
public interface RealDataMapper extends BaseMapper<RealData> {
    @Select("select * from realData where station=#{stationId}")
    RealData getByStation(int stationId);

    @Select("select b2.theName,b1.f,b1.t,b1.p from realData b1 left join stationInfo b2 on b1.station=b2.sNo")
    List<RealData_Left_List> RealData_left_list_all();
}
