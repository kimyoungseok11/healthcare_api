package com.study.healthcare.personal.service;

import com.study.healthcare.vo.BotanyListVO;
import com.study.healthcare.vo.ResponseVO;
import com.study.healthcare.vo.SurveyNewVO;
import com.study.healthcare.vo.SurveyQuestionVO;
import com.study.healthcare.vo.SurveySubQuestionVO;
import java.util.HashMap;
import java.util.List;

public interface PersonalService {

    public void surveyAnswer(SurveyNewVO nvo) throws Exception;

    public SurveyNewVO getRecommendStr(SurveyNewVO vo) throws Exception;

    public List<BotanyListVO> surveyResult(BotanyListVO vo) throws Exception;

    public int surveyResultCnt(BotanyListVO vo) throws Exception;

    public BotanyListVO getDetail(BotanyListVO vo) throws Exception;

    public List<BotanyListVO> getSimilarList(BotanyListVO vo) throws Exception;

    public int surveyCount() throws Exception;

    public List<SurveyQuestionVO> getSurveyList() throws Exception;

    public List<SurveySubQuestionVO> getSurveySubList() throws Exception;

    public void responseAnswer(ResponseVO rvo) throws Exception;

    public void satisfiedAnswer(HashMap<String, Object> satisfiedMap) throws Exception;
}
