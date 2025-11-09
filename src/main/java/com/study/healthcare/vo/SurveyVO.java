package com.study.healthcare.vo;

import org.apache.ibatis.type.Alias;

@Alias("surveyVO")
public class SurveyVO {
    private int regNumAnswer;
    private String regId;
    private int houseSyndrome;
    private int psychological;
    private String plantExperience;
    private String smell;
    private String difficulty;
    private String light;
    private String pollination;
    private String form;
    private String place;
    private String recommend;
    private String effect;
    private String smellIntensity;
    private String blight;
    private String repot;
    private String fertilize;
    private String price;
    private String size;
    private String shape;

    public int getRegNumAnswer() {
        return regNumAnswer;
    }

    public void setRegNumAnswer(int regNumAnswer) {
        this.regNumAnswer = regNumAnswer;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public int getHouseSyndrome() {
        return houseSyndrome;
    }

    public void setHouseSyndrome(int houseSyndrome) {
        this.houseSyndrome = houseSyndrome;
    }

    public int getPsychological() {
        return psychological;
    }

    public void setPsychological(int psychological) {
        this.psychological = psychological;
    }

    public String getPlantExperience() {
        return plantExperience;
    }

    public void setPlantExperience(String plantExperience) {
        this.plantExperience = plantExperience;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getPollination() {
        return pollination;
    }

    public void setPollination(String pollination) {
        this.pollination = pollination;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getSmellIntensity() {
        return smellIntensity;
    }

    public String getBlight() {
        return blight;
    }

    public String getRepot() {
        return repot;
    }

    public String getFertilize() {
        return fertilize;
    }

    public String getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getShape() {
        return shape;
    }

    public void setSmellIntensity(String smellIntensity) {
        this.smellIntensity = smellIntensity;
    }

    public void setBlight(String blight) {
        this.blight = blight;
    }

    public void setRepot(String repot) {
        this.repot = repot;
    }

    public void setFertilize(String fertilize) {
        this.fertilize = fertilize;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "SurveyVO{" +
                "regNumAnswer=" + regNumAnswer +
                ", regId='" + regId + '\'' +
                ", houseSyndrome=" + houseSyndrome +
                ", psychological=" + psychological +
                ", plantExperience='" + plantExperience + '\'' +
                ", smell='" + smell + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", light='" + light + '\'' +
                ", pollination='" + pollination + '\'' +
                ", form='" + form + '\'' +
                ", place='" + place + '\'' +
                ", recommend='" + recommend + '\'' +
                ", effect='" + effect + '\'' +
                ", smellIntensity='" + smellIntensity + '\'' +
                ", blight='" + blight + '\'' +
                ", repot='" + repot + '\'' +
                ", fertilize='" + fertilize + '\'' +
                ", price='" + price + '\'' +
                ", size='" + size + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "SurveyVO{" +
//                "regNumAnswer=" + regNumAnswer +
//                ", regId='" + regId + '\'' +
//                ", houseSyndrome=" + houseSyndrome +
//                ", psychological=" + psychological +
//                ", plantExperience='" + plantExperience + '\'' +
//                ", smell='" + smell + '\'' +
//                ", difficulty='" + difficulty + '\'' +
//                ", light='" + light + '\'' +
//                ", pollination='" + pollination + '\'' +
//                ", form='" + form + '\'' +
//                ", place='" + place + '\'' +
//                ", recommend='" + recommend + '\'' +
//                ", effect='" + effect + '\'' +
//                '}';
//    }
}
