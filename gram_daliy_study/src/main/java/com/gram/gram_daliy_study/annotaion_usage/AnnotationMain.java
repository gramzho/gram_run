package com.gram.gram_daliy_study.annotaion_usage;

import com.gram.gram_daliy_study.annotaion_usage.Vo.Student;
import com.gram.gram_daliy_study.annotaion_usage.annotation.MyAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @Author: zotij
 * @Date: 2024/3/30  15:32
 */
public class AnnotationMain {
    public static void main(String[] args) {

        Class<?> studentClass = Student.class;
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field: fields) {
            String fieldName = field.getName();  // 获取该类成员变量的名字
            System.out.println("成员变量的名字是：" + fieldName);
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                Class<? extends Annotation> annatationType = annotation.annotationType();
                String annatationName = annatationType.getSimpleName();   // 注解的简短名称
                System.out.println("使用的注解是：" + annatationName);

                // 判断该注解是不是MyAnnotation 注解， 是的话将其打印 id 和 describe 属性
                if (annatationType.equals(MyAnnotation.class)) {
                    MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);
                    int id = myAnnotation.id();
                    String describe = myAnnotation.describe();
                    System.out.println("MyAnnotaion注解中的id是：" + id);
                    System.out.println("My Annotation注解中的describe是：" + describe);

                }

            }
        }
        
    }
}
