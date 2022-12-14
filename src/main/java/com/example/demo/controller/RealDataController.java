package com.example.demo.controller;


import com.example.demo.entity.DataView.RealData_Left_List;
import com.example.demo.entity.DataView.RealData_right_mid;
import com.example.demo.entity.RealData;
import com.example.demo.service.RealDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
    @Value("${initdata.totalUserNum}")
    int totalUserNum;


    @Resource
    RealDataService realDataService;

    @GetMapping("/all")
    public List<RealData> all(){
        return realDataService.list();
    }


    @GetMapping("/getByStation")
    public RealData getByStation(Integer stationId){
        //return JSONObject.parseObject("{\"station\":10,\"f\":0.0,\"pl\":0.0,\"t\":0.0,\"p\":0.0,\"md\":0.0,\"tot\":0.0,\"ye\":0.0,\"comState\":false,\"thetime\":\"2022-04-24 08:58:02.000\",\"recTime\":\"2022-04-24 08:57:34.000\",\"valveDI\":false,\"isOnLine\":false,\"doorOpen\":false,\"isDc\":false,\"voltage\":0.0,\"outPowerNum\":0,\"plAlarm\":0,\"isAuto\":false,\"talarm\":0,\"fprice\":0.0,\"falarm\":0,\"palarm\":0,\"valarm\":false}",RealData.class);
        return realDataService.getByStation(stationId);
    }

    @GetMapping("/RealData_Left_List")
    public List<RealData_Left_List> RealData_Left_List(Integer page,Integer pageSize){
        if(page==null){
            page=0;
        }
        if(pageSize==null){
            pageSize=11;
        }
        //return JSONObject.parseArray("[{\"theName\":\"制革厂\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"联鑫纸制品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"万泽食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"妙乐多食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"梦家园\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"金辉电镀\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"晟发电镀\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"泰康生物科技\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"博润食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"制革厂(表二）\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"洲扬实业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"三源汇能\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"华凯纸业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"东华纸箱\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"顺利新材料\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"巨香面条\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"富通包装\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"东越实业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"娃哈哈\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"申洲针织\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"五洲纸业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"嘉恒饲料\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"天力\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"五洲纸业表二\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"顺络电子\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"夏王\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"新南线出口\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"凯王表二\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"煤机厂\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"东线用户\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"新东线出口\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"制革厂支线\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"南三路支线\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"驰星支线\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"南北贯通点\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"明旺表二\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"都邦药业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"绿盟纸制品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"启越纸制品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"果源康品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"仙鹤股份金达厂区\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"兴圣保温材料\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"出口流量北线\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"广兴包装材料\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"强顺\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"明旺小表\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"永立\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户56\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户57\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"坚字标准件\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"望湖纸业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"森拉特\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"岳泰铝业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"南孔中药\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"亿通衬布\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"均瑶食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"佳华水洗\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"云合炭业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"鑫源纸业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"夏王表二\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户69\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"金厦管业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"海力\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"展飞包装\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"天盛化学品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户78\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"民心食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"飞虎绝缘\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"东大纸业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"升浩工程塑料\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"好梦来家纺\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"市政建设\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"大朝木业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"衢程饲料\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"杰瑞泡沫\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"仙鹤股份永鑫纸业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"巨泰药业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"霸龙机动车部件\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"艾科科技\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"总表\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"富尔康家具\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"鑫丰表二\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"雁杰模板\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"港洋化纤\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"坚字标准件\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"桂财橡胶\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"冠威科技\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"东方家友家政\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表181\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表182\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表183\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表184\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表185\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表186\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表187\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表188\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表189\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表190\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表191\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表192\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"出口南线1\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"三悦食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"峰仔食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"阿尔诺维根斯\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"锦旺新材料\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"源泰新材料\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"五星纸业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"明旺\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表193\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表194\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表195\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表196\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表197\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表198\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表199\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"驰星包装\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"试机\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表202\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表203\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表204\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表205\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表206\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表207\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表208\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表209\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表210\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表211\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表212\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表213\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表214\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表215\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表216\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表217\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表218\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表219\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表220\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表221\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表222\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表223\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表224\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表225\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表226\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表227\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表228\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表229\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表230\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表231\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表232\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表233\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表234\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表235\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表236\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表237\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表238\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表239\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表240\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表241\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表242\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表243\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表244\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表245\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表246\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表247\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表248\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表249\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表250\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表251\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表252\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表253\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"试验\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"分表255\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户256\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户257\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户258\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户259\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户260\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户261\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户262\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户263\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户264\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户265\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户266\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户267\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户268\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户269\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户270\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户271\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户272\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户273\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户274\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户275\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户276\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户277\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户278\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户279\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户280\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户281\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户282\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户283\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户284\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户285\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户286\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户287\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户288\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户289\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户290\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户291\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户292\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户293\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户294\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户295\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户296\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户297\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户298\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户299\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户300\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"凯乐\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"制革厂表三\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"晶鑫新厂\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"莱勒克\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"顶津饮品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"天圣植物\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"程丰新材料\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"虹华印染表一\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"豪德盛\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"华鑫拉链\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"伊林食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"佳人豆制品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"凯鑫食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"三童\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"尤尼威机械\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户108\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"东方农产品配送\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"国丰油脂\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"乳旺食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"艾科赛仑纸业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"菇旺家庭农场\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"峰仔食品表二\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"潘氏家具\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"誉悦工场\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"美卓矿机\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"天河水泥制品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"圣元新型材料\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"嘉富昶\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"用户121\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"吕百味食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"仙鹤大表\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"煌盛铂业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"原点食品新表\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"天盛表二\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"华意拉链\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"222222\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"中堂实业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"仙鹤小表\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"金峰电镀\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"广源电镀\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"川特电子科技\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"弘森电镀\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"祥光橡塑\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"排放口\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"海洋新材料\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"顺浩保洁\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"开山橡塑\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"振纪建材\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"力鼎建材\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"浙开电镀\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"新汇彩印\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"华堃建筑构件\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"和润电子\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"大地油脂\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"新丰印纸业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"东宇电子\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"虹华印染表二\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"正锐农业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"富鸿农业开发\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"金人广告\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"翔龙农业\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"华氟新材料\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"天旺包装\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"益元素食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"小神仙食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"康源食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"硕丰生物科技\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"仙鹤股份仙鹿厂区\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"开山能源装备\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"仙鹤股份表三\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"仙鹤股份山花厂\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"普信新材料\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"初元食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"富宏食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"创豪新材料\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"增原汽配\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"玛凯泡塑\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"康哥食品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"长青健身器材\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"宝红建筑构件\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"金瑞泓科技\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"华颐达包装\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"方元美居家居用品\",\"f\":0.0,\"t\":0.0,\"p\":0.0},{\"theName\":\"富龙科技\",\"f\":0.0,\"t\":0.0,\"p\":0.0}]",RealData_Left_List.class);
        List<RealData_Left_List> allList=realDataService.RealData_left_list_all();
        List<RealData_Left_List> ret=new ArrayList<>(pageSize);
        //一共的数量
        int count=allList.size();
        int totalPage=count/pageSize+1;
        if(page>=totalPage){
            page=page%totalPage;
        }
        int i=0;
        for(RealData_Left_List realData_left_list : allList){
            if(i>=page*pageSize&&i<(page+1)*pageSize){
                ret.add(realData_left_list);
            }
            i++;
        }


        return ret;
    }

    @GetMapping("/RealData_right_mid")
    public RealData_right_mid getRealData_right_mid(){
        RealData_right_mid r=new RealData_right_mid();
        r.setSewageTreatment(sewage_treatment);
        r.setTextilePollution(textile_pollution);
        r.setChemicalPharmaceutical(chemical_pharmaceutical);
        //r.setTotalUserNum(realDataService.count());
        r.setTotalUserNum(totalUserNum);
        return r;
    }

    @GetMapping("/setUserType")
    public boolean setUserType(Integer textilePollution,Integer sewageTreatment,
                               Integer chemicalPharmaceutical,Integer totalUserNum){

        if(chemicalPharmaceutical!=null) {
            this.chemical_pharmaceutical = chemicalPharmaceutical;
        }
        if(sewageTreatment!=null) {
            this.sewage_treatment = sewageTreatment;
        }
        if(textilePollution!=null) {
            this.textile_pollution = textilePollution;
        }
        if(totalUserNum!=null){
            this.totalUserNum=totalUserNum;
        }
        return true;
    }
}
