package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Happy nation, livin' in a happy nation, Where the people understand and dream of perfect man, Situation leading to sweet salvation, For the people, for the good, for mankind brotherhood";

        // Приводим строку к нижнему регистру и удаляем знаки препинания
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z0-9' ]", "").split("\\s+");

        // Создаем HashMap для хранения частоты слов
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Подсчет частоты встречаемости слов
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Вывод результатов
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("Слово: '" + entry.getKey() + "' - Частота: " + entry.getValue());
        }
    }
}
