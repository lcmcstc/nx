package com.example.demo.controller;


import com.example.demo.entity.DataView.RealData_Left_List;
import com.example.demo.entity.DataView.RealData_right_mid;
import com.example.demo.entity.RealData;
import com.example.demo.service.RealDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import javax.annotation.Resource;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ken
 * @since 2022-08-09
 */
@RestController
@RequestMapping("/realData")
public class RealDataController {
    @Value("${initdata.textile_pollution}")
    int textile_pollution;
    @Value("${initdata.sewage_treatment}")
    int sewage_treatment;
    @Value("${initdata.chemical_pharmaceutical}")
    int chemical_pharmaceutical;


    @Resource
    RealDataService realDataService;

    @GetMapping("/all")
    public List<RealData> all(){
        return realDataService.list();
    }


    @GetMapping("/getByStation")
    public RealData getByStation(Integer stationId){
        return realDataService.getByStation(stationId);
    }

    @GetMapping("/RealData_Left_List")
    public List<RealData_Left_List> RealData_Left_List(){
        return realDataService.RealData_left_list_all();
    }

    @GetMapping("/RealData_right_mid")
    public RealData_right_mid getRealData_right_mid(){
        RealData_right_mid r=new RealData_right_mid();
        r.setSewageTreatment(sewage_treatment);
        r.setTextilePollution(textile_pollution);
        r.setChemicalPharmaceutical(chemical_pharmaceutical);
        r.setTotalUserNum(realDataService.count());
        return r;
    }

    @GetMapping("/setUserType")
    public boolean setUserType(Integer textilePollution,Integer sewageTreatment,Integer chemicalPharmaceutical){

        if(chemicalPharmaceutical!=null) {
            this.chemical_pharmaceutical = chemicalPharmaceutical;
        }
        if(sewageTreatment!=null) {
            this.sewage_treatment = sewageTreatment;
        }
        if(textilePollution!=null) {
            this.textile_pollution = textilePollution;
        }
        return true;
    }
}
