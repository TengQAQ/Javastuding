package com.ming.test;

import com.ming.sort.BubblingSort;
import com.ming.sort.InsertSort;
import com.ming.sort.SelectSort;
import com.ming.sort.ShellSort;

import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        starun();
//        test001();
    }
    static void starun(){
        int[] ints = new Random()
                .ints(10,100,999)
                .toArray();
        System.out.println(Arrays.toString(ints));

        int[] bubblingints = Arrays.copyOf(ints,ints.length);
        BubblingSort bubblingsort = new BubblingSort();
//        bubblingsort.starsort(bubblingints);
        int[] selcetints = Arrays.copyOf(ints,ints.length);
        SelectSort selectSort = new SelectSort();
//        selectSort.starsort(selcetints);

        int[] insertints = Arrays.copyOf(ints,ints.length);
        InsertSort insertSort = new InsertSort();
//        insertSort.starsort(insertints);

        int[] shelltints = Arrays.copyOf(ints,ints.length);
        ShellSort sort = new ShellSort();
        sort.starsort(shelltints);
    }

    static void test001(){
        int a = 3;
        int b = 2;
        int c = a/b;
        System.out.println(c);
    }

}
