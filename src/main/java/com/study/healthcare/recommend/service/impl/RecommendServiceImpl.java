package com.study.healthcare.recommend.service.impl;

import com.study.healthcare.recommend.mapper.RecommendMapper;
import com.study.healthcare.recommend.service.RecommendService;

import com.study.healthcare.vo.BotanyListVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("recommendService")
public class RecommendServiceImpl implements RecommendService {
	
	@Resource(name = "recommendMapper")
	private RecommendMapper recommendMapper;
	
	
	@Override
	public List<Map<String, Object>> search(BotanyListVO blVO) throws Exception {
		
		List<String> grwhstleCodeNmArr = blVO.getGrwhstleCodeNmArr();
		List<String> recommendedPlaceArr = blVO.getRecommendedPlaceArr();
		List<String> plantTypeArr = blVO.getPlantTypeArr();
		List<String> removalMaterialArr = blVO.getRemovalMaterialArr();
		
		String grwhstleCodeNm = "";
		String recommendedPlace = "";
		String plantType = "";
		String removalMaterialCheck = "";
		
		for(int i = 0; i < grwhstleCodeNmArr.size(); i++) {
			if(i == grwhstleCodeNmArr.size() -1 ) {
				grwhstleCodeNm += grwhstleCodeNmArr.get(i);
			} else {
				grwhstleCodeNm += (grwhstleCodeNmArr.get(i)+",");
			}
		}
		
		for(int i = 0; i < recommendedPlaceArr.size(); i++) {
			if(i == recommendedPlaceArr.size() -1 ) {
				recommendedPlace += recommendedPlaceArr.get(i);
			} else {
				recommendedPlace += (recommendedPlaceArr.get(i)+",");
			}
			if(recommendedPlace.contains("전체")) {
				recommendedPlace = "모든장소,거실,침실,주방,화장실,공부방,베란다,발코니,창가,새집증후군";
			}
		}
		
		for(int i = 0; i < plantTypeArr.size(); i++) {
			if(i == plantTypeArr.size() -1 ) {
				plantType += plantTypeArr.get(i);
			} else {
				plantType += (plantTypeArr.get(i)+",");
			}
			if(plantType.contains("전체")) {
				plantType = "잎&꽃보기식물,열매보기식물";
			}
		}
		
		for(int i = 0; i < removalMaterialArr.size(); i++) {
			if(i == removalMaterialArr.size() -1 ) {
				removalMaterialCheck += removalMaterialArr.get(i);
			} else {
				removalMaterialCheck += (removalMaterialArr.get(i)+",");
			}
			
			if(removalMaterialCheck.contains("전체")) {
				blVO.setTolueneRemoval(1);
				blVO.setFormaldehydeRemoval(1);
				blVO.setXyleneRemoval(1);
				blVO.setCarbonMonoxideRemoval(1);
			} else {
				if(removalMaterialCheck.contains("톨루엔제거")) {
					blVO.setTolueneRemoval(1);
				}
				if(removalMaterialCheck.contains("포름알데히드제거")) {
					blVO.setFormaldehydeRemoval(1);
				}
				if(removalMaterialCheck.contains("자일렌제거")) {
					blVO.setXyleneRemoval(1);
				}
				if(removalMaterialCheck.contains("일산화탄소제거")) {
					blVO.setCarbonMonoxideRemoval(1);
				}
			}
		}
		
		blVO.setGrwhstleCodeNm(grwhstleCodeNm);
		blVO.setRecommendedPlace(recommendedPlace);
		blVO.setPlantType(plantType);
		
		return recommendMapper.search(blVO);
	}
	
	@Override
	public int searchCnt(BotanyListVO blVO) throws Exception {
		
		List<String> grwhstleCodeNmArr = blVO.getGrwhstleCodeNmArr();
		List<String> recommendedPlaceArr = blVO.getRecommendedPlaceArr();
		List<String> plantTypeArr = blVO.getPlantTypeArr();
		List<String> removalMaterialArr = blVO.getRemovalMaterialArr();
		
		String grwhstleCodeNm = "";
		String recommendedPlace = "";
		String plantType = "";
		String removalMaterialCheck = "";
		
		for(int i = 0; i < grwhstleCodeNmArr.size(); i++) {
			if(i == grwhstleCodeNmArr.size() -1 ) {
				grwhstleCodeNm += grwhstleCodeNmArr.get(i);
			} else {
				grwhstleCodeNm += (grwhstleCodeNmArr.get(i)+",");
			}
		}
		
		for(int i = 0; i < recommendedPlaceArr.size(); i++) {
			if(i == recommendedPlaceArr.size() -1 ) {
				recommendedPlace += recommendedPlaceArr.get(i);
			} else {
				recommendedPlace += (recommendedPlaceArr.get(i)+",");
			}
			if(recommendedPlace.contains("전체")) {
				recommendedPlace = "모든장소,거실,침실,주방,화장실,공부방,베란다,발코니,창가,새집증후군";
			}
		}
		
		for(int i = 0; i < plantTypeArr.size(); i++) {
			if(i == plantTypeArr.size() -1 ) {
				plantType += plantTypeArr.get(i);
			} else {
				plantType += (plantTypeArr.get(i)+",");
			}
			if(plantType.contains("전체")) {
				plantType = "잎&꽃보기식물,열매보기식물";
			}
		}
		
		for(int i = 0; i < removalMaterialArr.size(); i++) {
			if(i == removalMaterialArr.size() -1 ) {
				removalMaterialCheck += removalMaterialArr.get(i);
			} else {
				removalMaterialCheck += (removalMaterialArr.get(i)+",");
			}
			
			if(removalMaterialCheck.contains("전체")) {
				blVO.setTolueneRemoval(1);
				blVO.setFormaldehydeRemoval(1);
				blVO.setXyleneRemoval(1);
				blVO.setCarbonMonoxideRemoval(1);
			} else {
				if(removalMaterialCheck.contains("톨루엔제거")) {
					blVO.setTolueneRemoval(1);
				}
				if(removalMaterialCheck.contains("포름알데히드제거")) {
					blVO.setFormaldehydeRemoval(1);
				}
				if(removalMaterialCheck.contains("자일렌제거")) {
					blVO.setXyleneRemoval(1);
				}
				if(removalMaterialCheck.contains("일산화탄소제거")) {
					blVO.setCarbonMonoxideRemoval(1);
				}
			}
		}
		
		blVO.setGrwhstleCodeNm(grwhstleCodeNm);
		blVO.setRecommendedPlace(recommendedPlace);
		blVO.setPlantType(plantType);
		
		return recommendMapper.searchCnt(blVO);
	}
	
	public Map<String, Object> detailSearch(BotanyListVO blVO) throws Exception {
		return recommendMapper.detailSearch(blVO);
	}
	
	public List<Map<String, Object>> selectSimilarPlant(int id) throws Exception {
		return recommendMapper.selectSimilarPlant(id);
	}
}
