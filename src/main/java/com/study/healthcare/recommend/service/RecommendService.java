package com.study.healthcare.recommend.service;

import com.study.healthcare.vo.BotanyListVO;

import java.util.List;
import java.util.Map;

public interface RecommendService {
    public List<Map<String, Object>> search(BotanyListVO blVO) throws Exception;

    public int searchCnt(BotanyListVO blVO) throws Exception;

    public Map<String, Object> detailSearch(BotanyListVO blVO) throws Exception;

    public List<Map<String, Object>> selectSimilarPlant(int id) throws Exception;
}
