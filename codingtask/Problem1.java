package codingtask;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    static Map<Integer, String> data = new HashMap<>();

    public static void main(String[] args) {
        //We can use Map and ArrayList but here , MAP is very efficient for Key value ;


        data.put(1, "AAA");
        data.put(2, "BBB");
        data.put(3, "CCC");
        data.put(4, "DDD");
        print(3);
        print(4);

    }

    public static void print(int key) {
        System.out.println(data.get(key));
    }
}
