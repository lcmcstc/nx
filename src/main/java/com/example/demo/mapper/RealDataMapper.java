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

    @Select("select b2.theName,b1.f,b1.t,b1.p from stationInfo b2 left join realData b1 on b1.station=b2.sNo where b2.isUse=1 order by b2.sNo asc")
    List<RealData_Left_List> RealData_left_list_all();
}
