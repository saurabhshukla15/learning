package customjavacollections.customhashmap;

public class TestCustomHashMap {

    public static void main(String[] a) {

        CustomHashMap<String, String> map = new CustomHashMap<>();
        map.put("Saurabh", "test");
        map.put("Saurabh", "test1");

        System.out.println("value from map : "+ map.get("Saurabh"));
        System.out.println("map size : "+ map);

    }
}
