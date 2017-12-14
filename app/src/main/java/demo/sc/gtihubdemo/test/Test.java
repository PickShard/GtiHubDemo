package demo.sc.gtihubdemo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sc on 2017/4/27.
 */

public class Test {

//    在1，2，3，4，5，6，7，8，9九个数字中插入“+”或“-”符号使得结果为100，
//      编程实现所有组合。
//    注：数字的顺序不能改变。
//    如：123-45-67+89=100   12-3-4+5-6+7+89=100

    public static void main(String[] args) {


        List<String> numList = new ArrayList<>();
        List<String> labList = new ArrayList<>();


        for (int i = 1; i < 10; i++) {
            String num = "";

            for (int j = i; j < 10; j++) {
                num += j;
                numList.add(num);
            }
        }


        for (int a = 0; a < 9; a++) {

            for (int b = 0; b < 9; b++) {

                String sum = "";
                for (int j = 0; j < numList.size(); j ++) {
                    if (j == 0) {
                        sum = numList.get(a) + "";

                    } else if (j < numList.size() - 1) {
                        String s = numList.get(j + 1);

                        if (!sum.startsWith(s.charAt(0) + "") && !sum.endsWith(s.charAt(0) + "")) {
                            sum += "+" + s;
                        }
                    } else if (j == numList.size() - 1) {

                    }
                }
                labList.add(sum);
            }

        }

        System.out.println(numList);
        System.out.println(labList);
    }
}
