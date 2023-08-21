package datastructures.hashTable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Hashtable<K, V> {

    private class HashNode {
        K key;
        V value;

        HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int INITIAL_SIZE = 10;
    private LinkedList<HashNode>[] bucketArray;
    private int numBuckets;
    private int size;



    public Hashtable() {
        bucketArray = new LinkedList[INITIAL_SIZE];
        numBuckets = INITIAL_SIZE;
        size = 0;
    }

    private int hash(K key) {
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode) % numBuckets;
//        CHATGPT HELP WITH THE EXECEPTION ADDING Math.abs
//        java.lang.ArrayIndexOutOfBoundsException: Index -7 out of bounds for length 10
//        hashtable.set("eleven", 55);
        return index;
    }

    public void set(K key, V value) {
        int bucketIndex = hash(key);
        if (bucketArray[bucketIndex] == null)
            bucketArray[bucketIndex] = new LinkedList<>();

        LinkedList<HashNode> chain = bucketArray[bucketIndex];
        for (HashNode node : chain) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        size++;
        chain.add(new HashNode(key, value));
    }

    public V get(K key) {
        int bucketIndex = hash(key);
        LinkedList<HashNode> chain = bucketArray[bucketIndex];
        if (chain == null) return null;

        for (HashNode node : chain) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null;
    }

    public boolean has(K key) {
        int bucketIndex = hash(key);
        LinkedList<HashNode> chain = bucketArray[bucketIndex];
        if (chain == null) return false;

        for (HashNode node : chain) {
            if (node.key.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public List<K> keys() {
        List<K> keysList = new ArrayList<>();
        for (int i = 0; i < numBuckets; i++) {
            LinkedList<HashNode> chain = bucketArray[i];
            if (chain != null) {
                for (HashNode node : chain) {
                    keysList.add(node.key);
                }
            }
        }
        return keysList;
    }

    public int getBucketIndexForKey(K key) {
        return hash(key);
    }

    public int size() {
        return numBuckets;
    }
}
