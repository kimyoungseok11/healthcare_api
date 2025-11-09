package com.study.healthcare.personal.service.impl;

import com.study.healthcare.personal.mapper.PersonalMapper;
import com.study.healthcare.personal.service.PersonalService;
import com.study.healthcare.vo.BotanyListVO;
import com.study.healthcare.vo.ResponseVO;
import com.study.healthcare.vo.SurveyNewVO;
import com.study.healthcare.vo.SurveyQuestionVO;
import com.study.healthcare.vo.SurveySubQuestionVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service("personalService")
public class PersonalServiceImpl implements PersonalService {

    @Resource(name = "personalMapper")
    private PersonalMapper personalMapper;

    public void surveyAnswer(SurveyNewVO vo) throws Exception{
        personalMapper.surveyAnswer(vo);
    }

    @Override
    public SurveyNewVO getRecommendStr(SurveyNewVO vo) throws Exception {
        return personalMapper.getRecommendStr(vo);
    }

    @Override
    public List<BotanyListVO> surveyResult(BotanyListVO vo) throws Exception {
        return personalMapper.surveyResult(vo);
    }

    @Override
    public int surveyResultCnt(BotanyListVO vo) throws Exception {
        return personalMapper.surveyResultCnt(vo);
    }

    @Override
    public BotanyListVO getDetail(BotanyListVO vo) throws Exception {
        return personalMapper.getDetail(vo);
    }

    @Override
    public List<BotanyListVO> getSimilarList(BotanyListVO vo) throws Exception {
        return personalMapper.getSimilarList(vo);
    }

    @Override
    public int surveyCount() throws Exception {
        return personalMapper.surveyCount();
    }

    @Override
    public List<SurveyQuestionVO> getSurveyList() throws Exception {
        return personalMapper.getSurveyList();
    }

    @Override
    public List<SurveySubQuestionVO> getSurveySubList() throws Exception {
        return personalMapper.getSurveySubList();
    }

    @Override
    public void responseAnswer(ResponseVO vo) throws Exception {
        personalMapper.responseAnswer(vo);
    }

    @Override
    public void satisfiedAnswer(HashMap<String, Object> satisfiedMap) throws Exception {
        personalMapper.satisfiedAnswer(satisfiedMap);
    }
}
