package com.study.healthcare.vo;

import org.apache.ibatis.type.Alias;

@Alias("surveySubQuestionVO")
public class SurveySubQuestionVO {
    private int questionId;
    private String questionTitle;
    private int questionTagValue;
    private String questionTagId;
    private String questionTagName;
    private String questionNumber;
    private int questionPreNumber;

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public int getQuestionTagValue() {
        return questionTagValue;
    }

    public String getQuestionTagId() {
        return questionTagId;
    }

    public String getQuestionTagName() {
        return questionTagName;
    }

    public String getQuestionNumber() {
        return questionNumber;
    }

    public int getQuestionPreNumber() {
        return questionPreNumber;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public void setQuestionTagValue(int questionTagValue) {
        this.questionTagValue = questionTagValue;
    }

    public void setQuestionTagId(String questionTagId) {
        this.questionTagId = questionTagId;
    }

    public void setQuestionTagName(String questionTagName) {
        this.questionTagName = questionTagName;
    }

    public void setQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
    }

    public void setQuestionPreNumber(int questionPreNumber) {
        this.questionPreNumber = questionPreNumber;
    }

    @Override
    public String toString() {
        return "SurveySubQuestionVO{" +
                "questionId=" + questionId +
                ", questionTitle='" + questionTitle + '\'' +
                ", questionTagValue=" + questionTagValue +
                ", questionTagId='" + questionTagId + '\'' +
                ", questionTagName='" + questionTagName + '\'' +
                ", questionNumber='" + questionNumber + '\'' +
                ", questionPreNumber=" + questionPreNumber +
                '}';
    }
}
