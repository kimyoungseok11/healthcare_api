package com.study.healthcare.vo;

import org.apache.ibatis.type.Alias;

@Alias("responseVO")
public class ResponseVO {
    private int regNumAnswer;
    private int gender;
    private int age;

    public int getRegNumAnswer() {
        return regNumAnswer;
    }

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setRegNumAnswer(int regNumAnswer) {
        this.regNumAnswer = regNumAnswer;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ResponseVO{" +
                "regNumAnswer=" + regNumAnswer +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
