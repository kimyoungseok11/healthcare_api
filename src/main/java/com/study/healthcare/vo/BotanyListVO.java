package com.study.healthcare.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BotanyListVO {
	private int id;
    private String botanyNm;
    private String plantEngNm;
    private String plantKorNm;
    private String circulationNm;

    private String fmlCodeNm;
    private String placeOrignInfp;
    private String smellCode;
    private String toxicityCode;
    private String managelevelCode;
    private String grwtveCode;
    private String winterLweTpCode;
    private String hdCode;
    private String frtlzrInfo;
    private String soilAcid;
    private String soilShp;

    private String soilInfo;
    private String watercycleSprngCode;
    private String watercycleSummerCode;
    private String watecycleAutumnCode;
    private String watercycleWinterCode;
    private String managedemanddoCode;
    private String clCodeNm;
    
    // form data mapping
    private List<String> grwhstleCodeNmArr;
    private String grwhstleCodeNm;
    private List<String> plantTypeArr;
    private String plantType;
    private List<String> removalMaterialArr;
    private String removalMaterial;
    
    private String postngplaceCode;
    
    private String dlthtsCodeNm;
    private Integer formaldehydeRemoval;
    private Integer tolueneRemoval;
    private Integer xyleneRemoval;
    private Integer carbonMonoxideRemoval;
    private Integer co2Reduction;
    private Integer negativeIonGeneration;
    private Integer relativeHumidityIncrease;

    private String limoninContent;
    private List<String> recommendedPlaceArr;

    private String recommendedPlace;
    
    private String priceFlowerpotB;
    private String priceFlowerpotM;
    private String priceFlowerpotS;

    private Float coordX;
    private Float coordY;
    private int color;
    private int brightness;
    private int temperature;
    private int particulateRemovalPlant;
    private int gasRemovalPlant;
    private String lefColrCodeNM;
    private String lightTdeManDdoCodeNm;
    private String lefColrCode;
    
    private Integer pagePerRow;
    private Integer currentPage;
    private List<Integer> IntegerIdList;
    private String keyword;

    private int regNumAnswer;

    public int getRegNumAnswer() {
        return regNumAnswer;
    }

    public void setRegNumAnswer(int regNumAnswer) {
        this.regNumAnswer = regNumAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBotanyNm() {
        return botanyNm;
    }

    public void setBotanyNm(String botanyNm) {
        this.botanyNm = botanyNm;
    }

    public String getPlantEngNm() {
        return plantEngNm;
    }

    public void setPlantEngNm(String plantEngNm) {
        this.plantEngNm = plantEngNm;
    }

    public String getPlantKorNm() {
        return plantKorNm;
    }

    public void setPlantKorNm(String plantKorNm) {
        this.plantKorNm = plantKorNm;
    }

    public String getCirculationNm() {
        return circulationNm;
    }

    public void setCirculationNm(String circulationNm) {
        this.circulationNm = circulationNm;
    }

    public String getFmlCodeNm() {
        return fmlCodeNm;
    }

    public void setFmlCodeNm(String fmlCodeNm) {
        this.fmlCodeNm = fmlCodeNm;
    }

    public String getPlaceOrignInfp() {
        return placeOrignInfp;
    }

    public void setPlaceOrignInfp(String placeOrignInfp) {
        this.placeOrignInfp = placeOrignInfp;
    }

    public String getSmellCode() {
        return smellCode;
    }

    public void setSmellCode(String smellCode) {
        this.smellCode = smellCode;
    }

    public String getToxicityCode() {
        return toxicityCode;
    }

    public void setToxicityCode(String toxicityCode) {
        this.toxicityCode = toxicityCode;
    }

    public String getManagelevelCode() {
        return managelevelCode;
    }

    public void setManagelevelCode(String managelevelCode) {
        this.managelevelCode = managelevelCode;
    }

    public String getGrwtveCode() {
        return grwtveCode;
    }

    public void setGrwtveCode(String grwtveCode) {
        this.grwtveCode = grwtveCode;
    }

    public String getWinterLweTpCode() {
        return winterLweTpCode;
    }

    public void setWinterLweTpCode(String winterLweTpCode) {
        this.winterLweTpCode = winterLweTpCode;
    }

    public String getHdCode() {
        return hdCode;
    }

    public void setHdCode(String hdCode) {
        this.hdCode = hdCode;
    }

    public String getFrtlzrInfo() {
        return frtlzrInfo;
    }

    public void setFrtlzrInfo(String frtlzrInfo) {
        this.frtlzrInfo = frtlzrInfo;
    }

    public String getSoilAcid() {
        return soilAcid;
    }

    public void setSoilAcid(String soilAcid) {
        this.soilAcid = soilAcid;
    }

    public String getSoilShp() {
        return soilShp;
    }

    public void setSoilShp(String soilShp) {
        this.soilShp = soilShp;
    }

    public String getSoilInfo() {
        return soilInfo;
    }

    public void setSoilInfo(String soilInfo) {
        this.soilInfo = soilInfo;
    }

    public String getWatercycleSprngCode() {
        return watercycleSprngCode;
    }

    public void setWatercycleSprngCode(String watercycleSprngCode) {
        this.watercycleSprngCode = watercycleSprngCode;
    }

    public String getWatercycleSummerCode() {
        return watercycleSummerCode;
    }

    public void setWatercycleSummerCode(String watercycleSummerCode) {
        this.watercycleSummerCode = watercycleSummerCode;
    }

    public String getWatecycleAutumnCode() {
        return watecycleAutumnCode;
    }

    public void setWatecycleAutumnCode(String watecycleAutumnCode) {
        this.watecycleAutumnCode = watecycleAutumnCode;
    }

    public String getWatercycleWinterCode() {
        return watercycleWinterCode;
    }

    public void setWatercycleWinterCode(String watercycleWinterCode) {
        this.watercycleWinterCode = watercycleWinterCode;
    }

    public String getManagedemanddoCode() {
        return managedemanddoCode;
    }

    public void setManagedemanddoCode(String managedemanddoCode) {
        this.managedemanddoCode = managedemanddoCode;
    }

    public String getClCodeNm() {
        return clCodeNm;
    }

    public void setClCodeNm(String clCodeNm) {
        this.clCodeNm = clCodeNm;
    }

    public List<String> getGrwhstleCodeNmArr() {
        return grwhstleCodeNmArr;
    }

    public void setGrwhstleCodeNmArr(List<String> grwhstleCodeNmArr) {
        this.grwhstleCodeNmArr = grwhstleCodeNmArr;
    }

    public String getGrwhstleCodeNm() {
        return grwhstleCodeNm;
    }

    public void setGrwhstleCodeNm(String grwhstleCodeNm) {
        this.grwhstleCodeNm = grwhstleCodeNm;
    }

    public List<String> getPlantTypeArr() {
        return plantTypeArr;
    }

    public void setPlantTypeArr(List<String> plantTypeArr) {
        this.plantTypeArr = plantTypeArr;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public List<String> getRemovalMaterialArr() {
        return removalMaterialArr;
    }

    public void setRemovalMaterialArr(List<String> removalMaterialArr) {
        this.removalMaterialArr = removalMaterialArr;
    }

    public String getRemovalMaterial() {
        return removalMaterial;
    }

    public void setRemovalMaterial(String removalMaterial) {
        this.removalMaterial = removalMaterial;
    }

    public String getPostngplaceCode() {
        return postngplaceCode;
    }

    public void setPostngplaceCode(String postngplaceCode) {
        this.postngplaceCode = postngplaceCode;
    }

    public String getDlthtsCodeNm() {
        return dlthtsCodeNm;
    }

    public void setDlthtsCodeNm(String dlthtsCodeNm) {
        this.dlthtsCodeNm = dlthtsCodeNm;
    }

    public Integer getFormaldehydeRemoval() {
        return formaldehydeRemoval;
    }

    public void setFormaldehydeRemoval(Integer formaldehydeRemoval) {
        this.formaldehydeRemoval = formaldehydeRemoval;
    }

    public Integer getTolueneRemoval() {
        return tolueneRemoval;
    }

    public void setTolueneRemoval(Integer tolueneRemoval) {
        this.tolueneRemoval = tolueneRemoval;
    }

    public Integer getXyleneRemoval() {
        return xyleneRemoval;
    }

    public void setXyleneRemoval(Integer xyleneRemoval) {
        this.xyleneRemoval = xyleneRemoval;
    }

    public Integer getCarbonMonoxideRemoval() {
        return carbonMonoxideRemoval;
    }

    public void setCarbonMonoxideRemoval(Integer carbonMonoxideRemoval) {
        this.carbonMonoxideRemoval = carbonMonoxideRemoval;
    }

    public Integer getCo2Reduction() {
        return co2Reduction;
    }

    public void setCo2Reduction(Integer co2Reduction) {
        this.co2Reduction = co2Reduction;
    }

    public Integer getNegativeIonGeneration() {
        return negativeIonGeneration;
    }

    public void setNegativeIonGeneration(Integer negativeIonGeneration) {
        this.negativeIonGeneration = negativeIonGeneration;
    }

    public Integer getRelativeHumidityIncrease() {
        return relativeHumidityIncrease;
    }

    public void setRelativeHumidityIncrease(Integer relativeHumidityIncrease) {
        this.relativeHumidityIncrease = relativeHumidityIncrease;
    }

    public String getLimoninContent() {
        return limoninContent;
    }

    public void setLimoninContent(String limoninContent) {
        this.limoninContent = limoninContent;
    }

    public List<String> getRecommendedPlaceArr() {
        return recommendedPlaceArr;
    }

    public void setRecommendedPlaceArr(List<String> recommendedPlaceArr) {
        this.recommendedPlaceArr = recommendedPlaceArr;
    }

    public String getRecommendedPlace() {
        return recommendedPlace;
    }

    public void setRecommendedPlace(String recommendedPlace) {
        this.recommendedPlace = recommendedPlace;
    }

    public String getPriceFlowerpotB() {
        return priceFlowerpotB;
    }

    public void setPriceFlowerpotB(String priceFlowerpotB) {
        this.priceFlowerpotB = priceFlowerpotB;
    }

    public String getPriceFlowerpotM() {
        return priceFlowerpotM;
    }

    public void setPriceFlowerpotM(String priceFlowerpotM) {
        this.priceFlowerpotM = priceFlowerpotM;
    }

    public String getPriceFlowerpotS() {
        return priceFlowerpotS;
    }

    public void setPriceFlowerpotS(String priceFlowerpotS) {
        this.priceFlowerpotS = priceFlowerpotS;
    }

    public Float getCoordX() {
        return coordX;
    }

    public void setCoordX(Float coordX) {
        this.coordX = coordX;
    }

    public Float getCoordY() {
        return coordY;
    }

    public void setCoordY(Float coordY) {
        this.coordY = coordY;
    }

    public int getColor() {
        return color;
    }

    public int getBrightness() {
        return brightness;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getParticulateRemovalPlant() {
        return particulateRemovalPlant;
    }

    public int getGasRemovalPlant() {
        return gasRemovalPlant;
    }

    public String getLefColrCodeNM() {
        return lefColrCodeNM;
    }

    public String getLightTdeManDdoCodeNm() {
        return lightTdeManDdoCodeNm;
    }

    public String getLefColrCode() {
        return lefColrCode;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setParticulateRemovalPlant(int particulateRemovalPlant) {
        this.particulateRemovalPlant = particulateRemovalPlant;
    }

    public void setGasRemovalPlant(int gasRemovalPlant) {
        this.gasRemovalPlant = gasRemovalPlant;
    }

    public void setLefColrCodeNM(String lefColrCodeNM) {
        this.lefColrCodeNM = lefColrCodeNM;
    }

    public void setLightTdeManDdoCodeNm(String lightTdeManDdoCodeNm) {
        this.lightTdeManDdoCodeNm = lightTdeManDdoCodeNm;
    }

    public void setLefColrCode(String lefColrCode) {
        this.lefColrCode = lefColrCode;
    }

    public Integer getPagePerRow() {
        return pagePerRow;
    }

    public void setPagePerRow(Integer pagePerRow) {
        this.pagePerRow = pagePerRow;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public List<Integer> getIntegerIdList() {
        return IntegerIdList;
    }

    public void setIntegerIdList(List<Integer> integerIdList) {
        IntegerIdList = integerIdList;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "BotanyListVO{" +
                "id=" + id +
                ", botanyNm='" + botanyNm + '\'' +
                ", plantEngNm='" + plantEngNm + '\'' +
                ", plantKorNm='" + plantKorNm + '\'' +
                ", circulationNm='" + circulationNm + '\'' +
                ", fmlCodeNm='" + fmlCodeNm + '\'' +
                ", placeOrignInfp='" + placeOrignInfp + '\'' +
                ", smellCode='" + smellCode + '\'' +
                ", toxicityCode='" + toxicityCode + '\'' +
                ", managelevelCode='" + managelevelCode + '\'' +
                ", grwtveCode='" + grwtveCode + '\'' +
                ", winterLweTpCode='" + winterLweTpCode + '\'' +
                ", hdCode='" + hdCode + '\'' +
                ", frtlzrInfo='" + frtlzrInfo + '\'' +
                ", soilAcid='" + soilAcid + '\'' +
                ", soilShp='" + soilShp + '\'' +
                ", soilInfo='" + soilInfo + '\'' +
                ", watercycleSprngCode='" + watercycleSprngCode + '\'' +
                ", watercycleSummerCode='" + watercycleSummerCode + '\'' +
                ", watecycleAutumnCode='" + watecycleAutumnCode + '\'' +
                ", watercycleWinterCode='" + watercycleWinterCode + '\'' +
                ", managedemanddoCode='" + managedemanddoCode + '\'' +
                ", clCodeNm='" + clCodeNm + '\'' +
                ", grwhstleCodeNmArr=" + grwhstleCodeNmArr +
                ", grwhstleCodeNm='" + grwhstleCodeNm + '\'' +
                ", plantTypeArr=" + plantTypeArr +
                ", plantType='" + plantType + '\'' +
                ", removalMaterialArr=" + removalMaterialArr +
                ", removalMaterial='" + removalMaterial + '\'' +
                ", postngplaceCode='" + postngplaceCode + '\'' +
                ", dlthtsCodeNm='" + dlthtsCodeNm + '\'' +
                ", formaldehydeRemoval=" + formaldehydeRemoval +
                ", tolueneRemoval=" + tolueneRemoval +
                ", xyleneRemoval=" + xyleneRemoval +
                ", carbonMonoxideRemoval=" + carbonMonoxideRemoval +
                ", co2Reduction=" + co2Reduction +
                ", negativeIonGeneration=" + negativeIonGeneration +
                ", relativeHumidityIncrease=" + relativeHumidityIncrease +
                ", limoninContent='" + limoninContent + '\'' +
                ", recommendedPlaceArr=" + recommendedPlaceArr +
                ", recommendedPlace='" + recommendedPlace + '\'' +
                ", priceFlowerpotB='" + priceFlowerpotB + '\'' +
                ", priceFlowerpotM='" + priceFlowerpotM + '\'' +
                ", priceFlowerpotS='" + priceFlowerpotS + '\'' +
                ", coordX=" + coordX +
                ", coordY=" + coordY +
                ", color=" + color +
                ", brightness=" + brightness +
                ", temperature=" + temperature +
                ", particulateRemovalPlant=" + particulateRemovalPlant +
                ", gasRemovalPlant=" + gasRemovalPlant +
                ", lefColrCodeNM='" + lefColrCodeNM + '\'' +
                ", lightTdeManDdoCodeNm='" + lightTdeManDdoCodeNm + '\'' +
                ", lefColrCode='" + lefColrCode + '\'' +
                ", pagePerRow=" + pagePerRow +
                ", currentPage=" + currentPage +
                ", IntegerIdList=" + IntegerIdList +
                ", keyword='" + keyword + '\'' +
                ", regNumAnswer=" + regNumAnswer +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "BotanyListVO{" +
//                "id=" + id +
//                ", botanyNm='" + botanyNm + '\'' +
//                ", plantEngNm='" + plantEngNm + '\'' +
//                ", plantKorNm='" + plantKorNm + '\'' +
//                ", circulationNm='" + circulationNm + '\'' +
//                ", fmlCodeNm='" + fmlCodeNm + '\'' +
//                ", placeOrignInfp='" + placeOrignInfp + '\'' +
//                ", smellCode='" + smellCode + '\'' +
//                ", toxicityCode='" + toxicityCode + '\'' +
//                ", managelevelCode='" + managelevelCode + '\'' +
//                ", grwtveCode='" + grwtveCode + '\'' +
//                ", winterLweTpCode='" + winterLweTpCode + '\'' +
//                ", hdCode='" + hdCode + '\'' +
//                ", frtlzrInfo='" + frtlzrInfo + '\'' +
//                ", soilAcid='" + soilAcid + '\'' +
//                ", soilShp='" + soilShp + '\'' +
//                ", soilInfo='" + soilInfo + '\'' +
//                ", watercycleSprngCode='" + watercycleSprngCode + '\'' +
//                ", watercycleSummerCode='" + watercycleSummerCode + '\'' +
//                ", watecycleAutumnCode='" + watecycleAutumnCode + '\'' +
//                ", watercycleWinterCode='" + watercycleWinterCode + '\'' +
//                ", managedemanddoCode='" + managedemanddoCode + '\'' +
//                ", clCodeNm='" + clCodeNm + '\'' +
//                ", grwhstleCodeNmArr=" + grwhstleCodeNmArr +
//                ", grwhstleCodeNm='" + grwhstleCodeNm + '\'' +
//                ", plantTypeArr=" + plantTypeArr +
//                ", plantType='" + plantType + '\'' +
//                ", removalMaterialArr=" + removalMaterialArr +
//                ", removalMaterial='" + removalMaterial + '\'' +
//                ", postngplaceCode='" + postngplaceCode + '\'' +
//                ", dlthtsCodeNm='" + dlthtsCodeNm + '\'' +
//                ", formaldehydeRemoval=" + formaldehydeRemoval +
//                ", tolueneRemoval=" + tolueneRemoval +
//                ", xyleneRemoval=" + xyleneRemoval +
//                ", carbonMonoxideRemoval=" + carbonMonoxideRemoval +
//                ", co2Reduction=" + co2Reduction +
//                ", negativeIonGeneration=" + negativeIonGeneration +
//                ", relativeHumidityIncrease=" + relativeHumidityIncrease +
//                ", limoninContent='" + limoninContent + '\'' +
//                ", recommendedPlaceArr=" + recommendedPlaceArr +
//                ", recommendedPlace='" + recommendedPlace + '\'' +
//                ", priceFlowerpotB='" + priceFlowerpotB + '\'' +
//                ", priceFlowerpotM='" + priceFlowerpotM + '\'' +
//                ", priceFlowerpotS='" + priceFlowerpotS + '\'' +
//                ", coordX=" + coordX +
//                ", coordY=" + coordY +
//                ", pagePerRow=" + pagePerRow +
//                ", currentPage=" + currentPage +
//                ", IntegerIdList=" + IntegerIdList +
//                '}';
//    }

}