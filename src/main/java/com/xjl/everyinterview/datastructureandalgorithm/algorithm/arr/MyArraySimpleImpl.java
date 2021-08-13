package com.xjl.everyinterview.datastructureandalgorithm.algorithm.arr;

/**
 * @author xjl
 * @version 1.0
 * @description: 实现简单数组
 * @date 2021/8/13 16:31
 */
public class MyArraySimpleImpl implements MyArray {

    //数组
    private int[] arr;

    //数组初始化大小
    private int size = 8;

    //数组长度
    private int length = 0;

    public MyArraySimpleImpl(int size) {
        this.arr = new int[size];
        this.size = size;
    }

    @Override
    public void put(int data) {
        if(arr.length==length){
//            扩容
        }
        arr[length] = data;
        length++;
    }

    @Override
    public void delete(int position) {
        arr[position] = 0;
        length--;
    }

    @Override
    public void update(int data,int position) {
        if(position>size){
//            扩容
        }
        for (int i = size - 1; i > length; i--) {
            arr[i+1] = arr[i];
        }
        arr[position] = data;
    }

    @Override
    public int get(int position) {
       return arr[position];
    }

    @Override
    public int size() {
        System.out.println(length);
        return length;
    }

    @Override
    public void getAll() {
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            System.out.println(i1);
        }

    }
}
