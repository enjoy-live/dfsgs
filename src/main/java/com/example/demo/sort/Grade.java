package com.example.demo.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grade implements Comparable<Grade>{
    private Integer num;

    public Grade(){}

    public Grade(Integer num) {
        this.num = num;
    }

    @Override
    public int compareTo(Grade o) {
        return this.num.compareTo(o.num);
    }

    public static void main(String[] args) {
//        List<Grade> gradeList = new ArrayList<>();
//        gradeList.add(new Grade(10));
//        gradeList.add(new Grade(90));
//        gradeList.add(new Grade(60));
//        Collections.sort(gradeList);
//        for (Grade g :
//                gradeList) {
//            System.out.println(g.num);
//        }
        byte[] b = null;
        System.out.println(b.length);
    }
}
