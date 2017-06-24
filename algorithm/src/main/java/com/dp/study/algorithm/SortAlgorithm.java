package com.dp.study.algorithm;

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
            for ( j = i; j > 0 && a[j - 1] < tmp; j--) {
                a[j] = a[j - 1];//依次将大于待排序值的元素向后移动
            }
            a[j] = tmp;//把待排序元素插入对应的位置
        }
    }
}
