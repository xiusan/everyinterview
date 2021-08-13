package com.xjl.everyinterview.datastructureandalgorithm.algorithm.arr;

/**
 * @author xjl
 * @version 1.0
 * @description:  实现简单数组
 * @date 2021/8/13 16:31
 */
public interface MyArray {
    /**
    * @description: 添加
    * @author xjl
    * @date: 2021/8/13 16:36
    * @param:
    * data 插入的数据
    * @return:
    **/
    void put(int data);
    /**
     * @description: 删除 （某个位置置为空值）
     * @author xjl
     * @date: 2021/8/13 16:36
     * @param:
     * @return:
     **/
    void delete(int position);

    /**
     * @description: 根据数据替换文件
     * @author xjl
     * @date: 2021/8/13 16:36
     * @param:
     * @return:
     **/
    void update(int data,int position);

    /**
     * @description: 查
     * @author xjl
     * @date: 2021/8/13 16:36
     *   position 获取位置
     * @return:
     **/
    int get(int position);


    /**
     * @description: 大小
     * @author xjl
     * @date: 2021/8/13 16:36
     * @param:
     * @return:
     **/
    int size();


    /**
     * @description: 获取全部数据
     * @author xjl
     * @date: 2021/8/13 16:36
     * @param:
     * @return:
     **/
    void getAll();

}
