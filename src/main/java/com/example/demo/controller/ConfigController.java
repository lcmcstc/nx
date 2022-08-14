package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.DataView.StationInfo_draw_list;
import com.example.demo.service.StationInfoService;
import org.springframework.beans.factory.annotation.Value;
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
 * @since 2022-08-09
 */
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Value("${initdata.textile_pollution}")
    int textile_pollution;
}
