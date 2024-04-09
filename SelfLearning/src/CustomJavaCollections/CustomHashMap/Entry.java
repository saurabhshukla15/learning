package CustomJavaCollections.CustomHashMap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Entry <K, V>{
    private K key;
    private V value;
    private Entry<K, V> nextNode;
}
