package com.example.demo;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Scanner;

public class ExistNumber {

    // 前提条件: 文件中的数都在1-100区间范围内

    // 1.循环读取文件中的输入数据i

    // 2.为数组array下标为i-1的赋值为true.

    // 3.判断数组array所有数据是否都为true, 满足条件返回,文件包含区间[1-100]所有的整数, 否则反之.

    public static void setArrayNumberIsTrue(int num, boolean[] array) {
        array[num - 1] = true;
    }

    public static boolean judgeDataOverrideAllDataofArray(boolean[] array) {
        for (boolean b :
                array) {
            if (!b)
                return false;
        }
        return true;
    }

    public static void printResultInformation(boolean target) {
        if (target)
            System.out.println("文件包含区间[1-100]所有的整数");
        else
            System.out.println("文件不包含区间[1-100]所有的整数");
    }


//    public static void main(String[] args) throws Exception {
//        boolean[] array = new boolean[100];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = false;
//        }
////        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(new File("~/number.txt"));
//        while (scanner.hasNext()) {
//            int num = scanner.nextInt();
//            if(num>0 && num<=100)
//            setArrayNumberIsTrue(num, array);
//        }
//        boolean b = judgeDataOverrideAllDataofArray(array);
//        printResultInformation(b);
//    }

    public static void main(String[] args) throws Exception {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Math.random()*10+1 + 'a');
//        }

        System.out.println("Integer:"+Integer.class.getClassLoader());
        System.out.println("int:"+int.class.getClassLoader());

        System.out.println(Integer.class.isInstance(11));
        System.out.println(Date.class.getClassLoader());
        System.out.println(int.class.equals(Integer.class));
//        int.class
    }

}
