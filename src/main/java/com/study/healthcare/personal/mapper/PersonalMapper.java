package com.study.healthcare.personal.mapper;


import com.study.healthcare.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

@Mapper
@Repository("personalMapper")
public interface PersonalMapper {

    // 사용자의 설문 답변을 DB에 Insert
    public void surveyAnswer(SurveyNewVO vo) throws SQLException;

    // 설문 결과에 따른 추천 식물 문자열
    public SurveyNewVO getRecommendStr(SurveyNewVO vo) throws SQLException;

    // 설문 답변에 대한 결과를 반환
    public List<BotanyListVO> surveyResult(BotanyListVO vo) throws SQLException;

    // 결과의 row 개수
    public int surveyResultCnt(BotanyListVO vo) throws SQLException;

    // 특정 식물의 상세조회
    public BotanyListVO getDetail(BotanyListVO vo) throws SQLException;

    // 특정 식물과 유사한 식물 목록
    public List<BotanyListVO> getSimilarList(BotanyListVO vo) throws SQLException;

    // 설문 이용자 수 count
    public int surveyCount() throws SQLException;

    // 메인 설문 문항 조회
    public List<SurveyQuestionVO> getSurveyList() throws SQLException;

    // 서브 설문 문항 조회
    public List<SurveySubQuestionVO> getSurveySubList() throws SQLException;

    // 응답자 조사 문항 DB에 Insert
    public void responseAnswer(ResponseVO vo) throws SQLException;

    // 만족도 데이터 설문 데이터에 insert
    public void satisfiedAnswer(HashMap<String, Object> satisfiedMap) throws SQLException;
}