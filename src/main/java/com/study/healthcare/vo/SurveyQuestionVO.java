package com.study.healthcare.vo;

import org.apache.ibatis.type.Alias;

@Alias("surveyQuestionVO")
public class SurveyQuestionVO {
    private int questionId;
    private String questionTitle;
    private String questionSubTitle;
    private int questionNumber;

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public String getQuestionSubTitle() {
        return questionSubTitle;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public void setQuestionSubTitle(String questionSubTitle) {
        this.questionSubTitle = questionSubTitle;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    @Override
    public String toString() {
        return "SurveyQuestionVO{" +
                "questionId=" + questionId +
                ", questionTitle='" + questionTitle + '\'' +
                ", questionSubTitle='" + questionSubTitle + '\'' +
                ", questionNumber=" + questionNumber +
                '}';
    }
}
