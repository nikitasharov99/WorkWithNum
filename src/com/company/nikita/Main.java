package com.company.nikita;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(5);
        num.add(16);
        num.add(-1);
        num.add(-2);
        num.add(0);
        num.add(32);
        num.add(3);
        num.add(5);
        num.add(8);
        num.add(23);
        num.add(4);

        List<Integer> num2 = new ArrayList<>();

        for (int num1 : num) {
            if (num1 > 0 && num1 % 2 == 0) {
                num2.add(num1);
            } else ;
        }

        Collections.sort(num2);

        for (int num3 : num2) {
            System.out.println(num3);
        }


    }
}
