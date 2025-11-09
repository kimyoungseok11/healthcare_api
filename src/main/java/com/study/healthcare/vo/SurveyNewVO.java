package com.study.healthcare.vo;

import org.apache.ibatis.type.Alias;

@Alias("surveyNewVO")
public class SurveyNewVO {
    private int regNumAnswer;
    private String regId;
    private int sentimentOne;
    private int sentimentTwo;
    private int effect;
    private int shape;
    private int leafColor;
    private int clCode;
    private int light;
    private int water;
    private int difficulty;
    private String recommend;
    private int satisfied;
    private int age;
    private int gender;

    public void setRegNumAnswer(int regNumAnswer) {
        this.regNumAnswer = regNumAnswer;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public void setSentimentOne(int sentimentOne) {
        this.sentimentOne = sentimentOne;
    }

    public void setSentimentTwo(int sentimentTwo) {
        this.sentimentTwo = sentimentTwo;
    }

    public void setEffect(int effect) {
        this.effect = effect;
    }

    public void setShape(int shape) {
        this.shape = shape;
    }

    public void setLeafColor(int leafColor) {
        this.leafColor = leafColor;
    }

    public void setClCode(int clCode) {
        this.clCode = clCode;
    }

    public void setLight(int light) {
        this.light = light;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setSatisfied(int satisfied) {
        this.satisfied = satisfied;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public int getRegNumAnswer() {
        return regNumAnswer;
    }

    public String getRegId() {
        return regId;
    }

    public int getSentimentOne() {
        return sentimentOne;
    }

    public int getSentimentTwo() {
        return sentimentTwo;
    }

    public int getEffect() {
        return effect;
    }

    public int getShape() {
        return shape;
    }

    public int getLeafColor() {
        return leafColor;
    }

    public int getClCode() {
        return clCode;
    }

    public int getLight() {
        return light;
    }

    public int getWater() {
        return water;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public String getRecommend() {
        return recommend;
    }

    public int getSatisfied() {
        return satisfied;
    }

    public int getAge() { return age; }

    public int getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "SurveyNewVO{" +
                "regNumAnswer=" + regNumAnswer +
                ", regId='" + regId + '\'' +
                ", sentimentOne=" + sentimentOne +
                ", sentimentTwo=" + sentimentTwo +
                ", effect=" + effect +
                ", shape=" + shape +
                ", leafColor=" + leafColor +
                ", clCode=" + clCode +
                ", light=" + light +
                ", water=" + water +
                ", difficulty=" + difficulty +
                ", recommend='" + recommend + '\'' +
                ", satisfied=" + satisfied +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
