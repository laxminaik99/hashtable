package com.bridgelabz13;

import java.util.LinkedList;

//public class MyHashMap<K,V> {
//	MyLinkedList<K> myLinkedList;
//	
//	public MyHashMap() {
//		this.myLinkedList=new MyLinkedList<>();
//	}
//
//}
public class MyHashMap<K, V> {
    private LinkedList<MyMapNode<K, V>>[] buckets;
    private int size;

    public MyHashMap(int capacity) {
        this.buckets = new LinkedList[capacity];
        this.size = 0;
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % buckets.length);
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        // Check if the key already exists, if so, update the value
        for (MyMapNode<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        buckets[index].add(new MyMapNode<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<MyMapNode<K, V>> bucket = buckets[index];
        if (bucket != null) {
            for (MyMapNode<K, V> node : bucket) {
                if (node.key.equals(key)) {
                    return node.value;
                }
            }
        }
        return null;
    }

    public int size() {
        return size;
    }
    
    public void printMap() {
        for (LinkedList<MyMapNode<K, V>> bucket : buckets) {
            if (bucket != null) {
                for (MyMapNode<K, V> node : bucket) {
                    System.out.println(node.key + ": " + node.value);
                }
            }
        }
    }
}

