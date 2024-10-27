package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapSwitcher {
    public static void main(String[] args) {
        // Пример использования метода
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("apple", 1);
        originalMap.put("banana", 2);
        originalMap.put("orange", 3);

        Map<Integer, String> switchedMap = switchMap(originalMap);

        // Вывод результата
        for (Map.Entry<Integer, String> entry : switchedMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }

    public static <K, V> Map<V, K> switchMap(Map<K, V> originalMap) {
        Map<V, K> switchedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            switchedMap.put(entry.getValue(), entry.getKey());
        }

        return switchedMap;
    }

}
