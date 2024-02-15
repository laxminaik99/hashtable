package com.bridgelabz13;
import java.util.LinkedList;

class MyMapNode<K, V> {
    K key;
    V value;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}


public class Main3 {
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        String[] words = sentence.split("\\s+");

        MyHashMap<String, Integer> wordFrequencyMap = new MyHashMap<>(10);

        for (String word : words) {
            String cleanedWord = word.toLowerCase();
            Integer frequency = wordFrequencyMap.get(cleanedWord);
            if (frequency == null) {
                wordFrequencyMap.put(cleanedWord, 1);
            } else {
                wordFrequencyMap.put(cleanedWord, frequency + 1);
            }
        }

        // Print the word frequencies
        wordFrequencyMap.printMap(); // Corrected method call
    }
}
