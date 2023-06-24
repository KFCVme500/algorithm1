package com.hzj.alg;

import java.util.HashMap;

import static com.sun.corba.se.impl.util.RepositoryId.cache;

public class LRUCache {
    class Node {
        int key;
        int value;
        Node pre,next;
        public Node(){}
        public Node(int key,int value) {
            key = key;
            value = value;
        }
    }
    private HashMap<Integer,Node> cache = new HashMap<>();
    private int size;
    private int capacity;
    private Node head,tail;
    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        Node node = cache.get(key);
       if (node == null) {
           return -1;
       }
       //key不为空，将node更换至双向链表的头部
       moveToHead(node);
       return node.value;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }
    //添加至头节点
    private void addToHead(Node node) {
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }
    //将此节点删除
    private void removeNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);
        if (node == null) {
            Node newNode = new Node(key,value);
            cache.put(key,newNode);
            addToHead(newNode);
            size++;
            if (size > capacity) {
                Node tail = removeTail();
                cache.remove(tail.key);
                size--;
            }
        }
        else {
            node.value = value;
            moveToHead(node);
        }
    }
    //删除尾节点
    private Node removeTail() {
        Node res = tail.pre;
        removeNode(res);
        return res;
    }
}
