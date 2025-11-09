package com.study.healthcare.recommend.controller;

import com.study.healthcare.recommend.service.RecommendService;
import com.study.healthcare.vo.BotanyListVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
public class RecommendController {
    @Resource(name="recommendService")
    private RecommendService recommendService;

    @ResponseBody
    @RequestMapping(value = "/recommend/search.do")
    public Map<String,Object> search(HttpServletRequest req,@RequestBody BotanyListVO blVO) throws Exception {
        System.out.println(req);
        Map<String,Object> result = new HashMap<String, Object>();

        int total = recommendService.searchCnt(blVO);
        List<Map<String, Object>> list = recommendService.search(blVO);
        List<Map<String,Object>> similarPlantList = new ArrayList<Map<String,Object>>();
        if(list.size() > 0) {
            int id = Integer.parseInt(list.get(0).get("id").toString());
            similarPlantList = recommendService.selectSimilarPlant(id);
            result.put("similarPlantList", similarPlantList);
        }

        result.put("list", list);
        result.put("total", total);

        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/recommend/detailSearch.do")
    public Map<String,Object> detailSearch(HttpServletRequest req, @RequestBody BotanyListVO blVO) throws Exception {
        Map<String,Object> result = new HashMap<String, Object>();
        result.put("detailPlant", recommendService.detailSearch(blVO));

        int id = blVO.getId();
        result.put("similarPlantList",recommendService.selectSimilarPlant(id));

        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/recommend/similarDetailSearch.do")
    public Map<String,Object> similarDetailSearch(HttpServletRequest req,@RequestBody BotanyListVO blVO) throws Exception {
        Map<String,Object> result = new HashMap<String, Object>();
        result.put("detailPlant", recommendService.detailSearch(blVO));

        int id = blVO.getId();
        result.put("similarPlantList",recommendService.selectSimilarPlant(id));

        return result;
    }
}
