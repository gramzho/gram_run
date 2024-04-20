package com.gram.gram_daliy_study.annotaion_usage.Vo;

import com.alibaba.fastjson2.annotation.JSONField;
import com.gram.gram_daliy_study.annotaion_usage.annotation.MyAnnotation;

/**
 * @Author: zotij
 * @Date: 2024/3/30  15:08
 */
public class Student {

    @JSONField(ordinal =0)
    @MyAnnotation
    public String name;

    @MyAnnotation(id=1,describe="分数")
    public Integer score;

    public Student() {
    }

    @MyAnnotation(describe="getName方法")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
