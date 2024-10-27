package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int N = 10;

        double[] array = new double[N];
        for (int i = 0; i < N; i++) {
            array[i] = Math.random() * 100;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < N; i++) {
            arrayList.add(Integer.parseInt(String.format("%.0f", array[i])));
        }
        Collections.sort(arrayList);

        for (Object i : arrayList){
            System.out.print(i + " ");
        }
        System.out.println();

        Collections.reverse(arrayList);
        for (Object i : arrayList){
            System.out.print(i + " ");
        }
        System.out.println();

        Collections.shuffle(arrayList);
        for (Object i : arrayList){
            System.out.print(i + " ");
        }
        System.out.println();

        Collections.rotate(arrayList, 1);
        for (Object i : arrayList){
            System.out.print(i + " ");
        }
        System.out.println();
        Set<Integer> set = new HashSet<>();
        List<Object> duplicates = new ArrayList<>();
        arrayList.forEach(n -> {
            if (!set.add((Integer) n)) {
                duplicates.add(n);
            }
        });
        System.out.println(duplicates + "\n" + set);
        System.out.println(PrimesGenerator.generate(100));

    }
}