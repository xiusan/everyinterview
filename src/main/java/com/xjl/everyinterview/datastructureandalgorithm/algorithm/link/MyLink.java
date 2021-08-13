package com.xjl.everyinterview.datastructureandalgorithm.algorithm.link;

/**
 * @author xjl
 * @version .0
 * @description: TODO
 * @date 0/8/3 8:00
 */
public class MyLink {

//头节点指针
    private Node head;
// 尾节点指针
    private Node last;
//链表实际长度
    private int size;
    public void insert(int data, int index) throws Exception {
        if (index<0 || index>size) {
            throw new IndexOutOfBoundsException(" 超出链表节点范围！");
        }
        Node insertedNode = new Node(data);

        if(size == 0){  //空链表
              head = insertedNode;
              last = insertedNode;
        } else if(index == 0){  //插入头部

             insertedNode.next = head;
             head = insertedNode;
        }else if(size == index){
            //插入尾部
            last.next = insertedNode;
            last = insertedNode;
        }else {
            //插入中间
            Node prevNode = get(index-1);
            insertedNode.next = prevNode.next;
            prevNode.next = insertedNode;
        }
        size++;
        
    }

    private Node get(int i) {
        Node tamp =  null;
        int count = 0;
        while (count<i){
            tamp = head.next;
            count++;
        }
        return tamp;
    }

}
