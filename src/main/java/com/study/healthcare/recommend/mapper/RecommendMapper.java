package com.study.healthcare.recommend.mapper;

import com.study.healthcare.vo.BotanyListVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
@Repository("recommendMapper")
public interface RecommendMapper {
    public List<Map<String, Object>> search(BotanyListVO blVO) throws SQLException;

    public int searchCnt(BotanyListVO blVO) throws SQLException;

    public Map<String, Object> detailSearch(BotanyListVO blVO) throws SQLException ;

    public List<Map<String, Object>> selectSimilarPlant(int id) throws SQLException;
}
