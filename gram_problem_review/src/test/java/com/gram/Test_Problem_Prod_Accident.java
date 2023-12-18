package com.gram;

import entity.CodeReview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:zotij
 * @Date: 2023/12/18  19:40
 */

/**
 *
 * 今日出现一个生产事故，半年前写的一个bug, 白盒评价系统在进行下载对应模版，
 * 填写对应数据然后进行导入功能时，每次数据导入条数是正确的，但实际查询数据库的时候，只有追后一条数据是正常导入的，
 * 前面的数据没有进行正确的导入，
 *
 * 根因：我之前写的Excel工具类出了点小问题，具体如下demo
 */
public class Test_Problem_Prod_Accident {

    public static void main(String[] args) {

        List<CodeReview> codeReviewList = new ArrayList<>();
        CodeReview vo = new CodeReview();

        vo.setDept("PaaS");
        vo.setName("张三");
        vo.setUserId("001");
        codeReviewList.add(vo);
        vo.setDept("SaaS");
        vo.setName("李四");
        vo.setUserId("002");
        codeReviewList.add(vo);
        codeReviewList.forEach(System.out::println);

    }
}
