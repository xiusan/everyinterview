package com.xjl.everyinterview.datastructureandalgorithm.algorithm.arr;

/**
 * @author xjl
 * @version 1.0
 * @description: TODO
 * @date 2021/8/13 16:58
 */
public class TestArray {

    public static void main(String[] args) {
        MyArraySimpleImpl arraySimple = new MyArraySimpleImpl(6);
        arraySimple.size();
        arraySimple.put(1);
        arraySimple.put(1);
        arraySimple.put(1);
        arraySimple.put(1);
        System.out.println("-----------------------");

        arraySimple.size();
        arraySimple.delete(3);
        arraySimple.delete(1);
        arraySimple.delete(2);
        arraySimple.size();
        System.out.println("-----------------------");
        arraySimple.getAll();
        arraySimple.update(32,1);
        System.out.println("-----------------------");
        arraySimple.getAll();

    }
}
