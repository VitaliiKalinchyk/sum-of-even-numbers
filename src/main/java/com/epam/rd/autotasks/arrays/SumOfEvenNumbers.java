package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] a){
        // return a==null?0:Arrays.stream(a).filter(i->i%2==0).sum(); // short solution
        if (a==null){
            return 0;
        }
        int sum=0;
        for (int i: a) {
            if (i%2==0)
                sum+=i;
        }
        return sum;
    }
}
