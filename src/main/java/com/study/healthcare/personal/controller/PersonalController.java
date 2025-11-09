package com.study.healthcare.personal.controller;


import com.study.healthcare.personal.service.PersonalService;
import com.study.healthcare.vo.BotanyListVO;
import com.study.healthcare.vo.ResponseVO;
import com.study.healthcare.vo.SurveyNewVO;
import lombok.extern.log4j.Log4j;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
public class PersonalController {

    @Resource(name = "personalService")
    private PersonalService personalService;

    @RequestMapping(value = "/personal.do")
    public String main() throws Exception {
        return "/personal/personal";
    }

    @ResponseBody
    @RequestMapping(value = "/personal/newSubmit.do", method = RequestMethod.POST)
    public JSONObject newSubmit(@RequestBody SurveyNewVO nvo) throws Exception {

        System.out.println(nvo);
        personalService.surveyAnswer(nvo); //DB insert;
        String argStr=String.valueOf(nvo.getRegNumAnswer());
        JSONObject regNumAnswer = new JSONObject();
        int argInt = Integer.parseInt(argStr);
        regNumAnswer.put("regNumAnswer",argInt);

        return regNumAnswer;
    }

    @ResponseBody
    @RequestMapping(value = "/personal/result.do", method = RequestMethod.POST)
    public Map<String,Object> result(@RequestBody BotanyListVO bvo, SurveyNewVO svo) throws Exception {
        Map<String,Object> result = new HashMap<String, Object>(); //결과
        List<BotanyListVO> recommendPlant=new ArrayList<BotanyListVO>(); //추천식물 목록
        int total=0; //추천식물 총 개수
        String recommendStr=""; //surveyVO recommend
        List<Integer> recommendList=new ArrayList<Integer>(); //botanyListVO IntegerIdList
        svo.setRegNumAnswer(bvo.getRegNumAnswer());

        try{

            recommendList.add(0);
            recommendList.add(1);
            recommendList.add(2);
            recommendList.add(3);
            recommendList.add(4);
            recommendList.add(5);
            recommendList.add(6);
            recommendList.add(7);

            bvo.setIntegerIdList(recommendList);
            recommendPlant=personalService.surveyResult(bvo);
            total=personalService.surveyResultCnt(bvo);
        }catch (NullPointerException npe) {
            System.out.println("추천 식물 정보 없음");
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            result.put("total", total);
            result.put("list",recommendPlant);
        }
        System.out.println(result);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/personal/detail.do")
    public Map<String,Object> detailSearch(@RequestBody BotanyListVO bvo) throws Exception {
        Map<String,Object> result = new HashMap<String, Object>();

        result.put("detailPlant", personalService.getDetail(bvo));
        result.put("similarPlantList", personalService.getSimilarList(bvo));

        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/personal/surveyCount.do")
    public int surveyCount() throws Exception {
        int count = personalService.surveyCount();
        return count;
    }

    @ResponseBody
    @RequestMapping(value = "/personal/surveyList.do")
    public Map<String,Object> getSurveyList() throws Exception {
        Map<String,Object> result = new HashMap<String, Object>();

        result.put("surveyList", personalService.getSurveyList());
        result.put("surveySubList", personalService.getSurveySubList());

        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/personal/satisfied.do", method = RequestMethod.POST)
    public void setSatisfied(@RequestBody HashMap<String, Object> satisfiedMap) throws Exception {
        personalService.satisfiedAnswer(satisfiedMap);
    }

    @ResponseBody
    @RequestMapping(value = "/personal/userInfo.do")
    public void userInfo(@RequestBody ResponseVO rvo) throws Exception {
        System.out.println(rvo);
        personalService.responseAnswer(rvo);
    }
}
