package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.DataView.MapDTO;
import com.example.demo.entity.DataView.StationInfo_draw_list;
import com.example.demo.entity.StationLocation;
import com.example.demo.service.StationInfoService;
import com.example.demo.service.StationLocationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ken
 * @since 2022-08-15
 */
@RestController
@RequestMapping("/stationLocation")
public class StationLocationController {
    @Resource
    StationLocationService stationLocationService;

    @GetMapping("/init")
    public void all(){
//        String r="[{\"sNo\":21,\"lng\":106.6835616967468,\"lat\":38.04434434716473},{\"sNo\":22,\"lng\":106.67866934750364,\"lat\":38.0535505578301},{\"sNo\":23,\"lng\":106.68348659489439,\"lat\":38.0508132701006},{\"sNo\":24,\"lng\":106.67935599301146,\"lat\":38.057740775303834},{\"sNo\":25,\"lng\":106.68270338986204,\"lat\":38.05767319305451},{\"sNo\":26,\"lng\":106.6871665856628,\"lat\":38.05777319305451},{\"sNo\":27,\"lng\":106.68716658566282,\"lat\":38.059430311253514},{\"sNo\":28,\"lng\":106.682875051239,\"lat\":38.059430311253514},{\"sNo\":29,\"lng\":106.67969931576536,\"lat\":38.06226864383672},{\"sNo\":10,\"lng\":106.68390501950071,\"lat\":38.060579173419},{\"sNo\":11,\"lng\":106.68802489254759,\"lat\":38.06105222906801},{\"sNo\":12,\"lng\":106.6803001305847,\"lat\":38.066525936281735},{\"sNo\":13,\"lng\":106.6869090935974,\"lat\":38.06659351035505},{\"sNo\":14,\"lng\":106.68390501950071,\"lat\":38.071255970679616},{\"sNo\":15,\"lng\":106.69231642697142,\"lat\":38.06841798674172},{\"sNo\":16,\"lng\":106.69051398251341,\"lat\":38.0715938185767},{\"sNo\":17,\"lng\":106.6890548608093,\"lat\":38.074026277369015},{\"sNo\":18,\"lng\":106.68768156979368,\"lat\":38.075783002854166},{\"sNo\":19,\"lng\":106.68253172848509,\"lat\":38.07355330560625},{\"sNo\":20,\"lng\":106.69360388729856,\"lat\":38.05625395140377}]";
//        stationLocationService.saveBatch(JSONObject.parseArray(r, StationLocation.class));
    }

    @GetMapping("/getLocation")
    public MapDTO getAll(){
        return JSONObject.parseObject("{\"station_locations\":[{\"lng\":106.68391,\"lat\":38.060577,\"theName\":\"联鑫纸制品\",\"sno\":10},{\"lng\":106.68803,\"lat\":38.06105,\"theName\":\"万泽食品\",\"sno\":11},{\"lng\":106.6803,\"lat\":38.066525,\"theName\":\"妙乐多食品\",\"sno\":12},{\"lng\":106.68691,\"lat\":38.066593,\"theName\":\"梦家园\",\"sno\":13},{\"lng\":106.68391,\"lat\":38.071255,\"theName\":\"金辉电镀\",\"sno\":14},{\"lng\":106.692314,\"lat\":38.068417,\"theName\":\"晟发电镀\",\"sno\":15},{\"lng\":106.69051,\"lat\":38.071594,\"theName\":\"泰康生物科技\",\"sno\":16},{\"lng\":106.68906,\"lat\":38.074028,\"theName\":\"博润食品\",\"sno\":17},{\"lng\":106.68768,\"lat\":38.075783,\"theName\":\"制革厂(表二）\",\"sno\":18},{\"lng\":106.68253,\"lat\":38.073555,\"theName\":\"洲扬实业\",\"sno\":19},{\"lng\":106.6936,\"lat\":38.056255,\"theName\":\"三源汇能\",\"sno\":20},{\"lng\":106.68356,\"lat\":38.044346,\"theName\":\"华凯纸业\",\"sno\":21},{\"lng\":106.67867,\"lat\":38.05355,\"theName\":\"东华纸箱\",\"sno\":22},{\"lng\":106.68349,\"lat\":38.05081,\"theName\":\"顺利新材料\",\"sno\":23},{\"lng\":106.67936,\"lat\":38.05774,\"theName\":\"巨香面条\",\"sno\":24},{\"lng\":106.6827,\"lat\":38.057674,\"theName\":\"富通包装\",\"sno\":25},{\"lng\":106.687164,\"lat\":38.057774,\"theName\":\"东越实业\",\"sno\":26},{\"lng\":106.687164,\"lat\":38.05943,\"theName\":\"娃哈哈\",\"sno\":27},{\"lng\":106.68288,\"lat\":38.05943,\"theName\":\"申洲针织\",\"sno\":28},{\"lng\":106.6797,\"lat\":38.062267,\"theName\":\"五洲纸业\",\"sno\":29}],\"centre\":{\"lng\":106.68391,\"lat\":38.060577,\"sno\":10}}",MapDTO.class);
//        MapDTO ret=new MapDTO();
//        ret.setStation_locations(stationLocationService.getDto());
//        QueryWrapper<StationLocation> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("sNo", 10);
//        ret.setCentre(stationLocationService.getOne(queryWrapper));
//        return ret;
    }
}
