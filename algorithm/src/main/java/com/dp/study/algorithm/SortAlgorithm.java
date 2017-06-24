package com.dp.study.algorithm;

import java.util.Arrays;

/**
 * 常用排序算法
 * Created by DuPu on 2017/6/24.
 */
public class SortAlgorithm {

    /**
     * 插入排序
     *
     * @param a 待排序数组
     */
    public void insertionSort(int[] a) {
        int j;//保存待插入的角标
        for (int i = 1; i < a.length; i++) {
            int tmp = a[i];//tmp元素保存待插入的元素
            for (j = i; j > 0 && a[j - 1] < tmp; j--) {
                a[j] = a[j - 1];//依次将大于待排序值的元素向后移动
            }
            a[j] = tmp;//把待排序元素插入对应的位置
        }
    }

    public void shellSort(int[] a) {
        int j;
        for (int gap = a.length / 2; gap > 0; gap /= 2) {//元素间隔从序列的长度的一半每次减半,直到间隔为1

            for (int i = gap; i < a.length; i++) {//对每个相隔gap距离的元素进行插入排序
                int tmp = a[i];

                for (j = i; j >= gap && tmp < a[j - gap]; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = tmp;
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {3, 57, 25, 7, 5, 889, 4, 6, 7, 223, 64, 78, 54, 83, 57, 92, 468, 9, 342, 68, 4, 289, 23, 333, 135};
        SortAlgorithm algorithm = new SortAlgorithm();
        algorithm.shellSort(a);
        Arrays.stream(a).forEach(System.out::println);
    }
}
