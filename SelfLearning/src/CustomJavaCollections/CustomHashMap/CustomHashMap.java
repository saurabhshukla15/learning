package CustomJavaCollections.CustomHashMap;

import java.util.Objects;

public class CustomHashMap<K, V> {

    private static final int INITIAL_CAPACITY = 16;
    private final Entry<K, V>[] hashMap;

    public CustomHashMap() {
        hashMap = new Entry[INITIAL_CAPACITY];
    }

    public CustomHashMap(int capacity) {
        hashMap = new Entry[capacity];
    }

    public final int hashCode(K k) {
        return Objects.isNull(k) ? 0 : Math.abs (k.hashCode() % INITIAL_CAPACITY);
    }

    public void put(K k, V v) {

       int index = hashCode(k);
       Entry<K, V> node = hashMap[index];
       Entry<K, V> newNode = new Entry<>(k,v, null);
       if (Objects.isNull(node)) {
           hashMap[index] = newNode;
       } else {
           Entry previousNode = null;
           while(Objects.nonNull(node)) {
               if (node.getKey().equals(k)) {
                   node.setValue(v);
                   break;
               }
               previousNode = node;
               node = node.getNextNode();
           }
           if(Objects.nonNull(previousNode)) {
               previousNode.setNextNode(newNode);
           }
       }
    }

    public V get(K k) {
        int index = hashCode(k);
        Entry<K, V> node = hashMap[index];
        if (Objects.isNull(node.getNextNode())) {
            return node.getValue();
        }else {
            while(Objects.nonNull(node.getNextNode())) {
                if (node.getKey().equals(k)) {
                    return node.getValue();
                }
                node = node.getNextNode();
            }
        }
        return node.getValue();
    }


}
