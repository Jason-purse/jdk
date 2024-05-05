package club.smileboy.jdk.test;

import java.util.HashMap;
import java.util.Random;

/**
 * @author jasonj
 * @date 2024/2/28
 * @time 23:51
 * @description
 **/
public class Main {

    public static void main(String[] args) {
//        ClassLoader.getSystemClassLoader();
        System.out.println(System.currentTimeMillis());

        System.out.println(new Random().nextInt(123));
        new Random().print("123123");

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        Object put = objectObjectHashMap.put("123", 234);

        System.out.println(put == null);

        objectObjectHashMap.put("456",123);

        System.out.println(objectObjectHashMap);

    }
}
