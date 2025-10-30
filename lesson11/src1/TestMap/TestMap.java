package TestMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {

        // --- Bước 2: HashMap ---
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        // --- Bước 3: TreeMap (sắp xếp theo key tăng dần) ---
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap + "\n");

        // --- Bước 4: LinkedHashMap (lưu theo thứ tự thêm vào, có thể kích hoạt chế độ truy cập gần nhất) ---
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);

        // Truy cập một phần tử để quan sát thay đổi thứ tự truy cập
        System.out.println("The age for Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println("Display entries in LinkedHashMap (access order):");
        System.out.println(linkedHashMap);
    }
}
