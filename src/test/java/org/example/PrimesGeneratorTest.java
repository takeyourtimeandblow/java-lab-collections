package org.example;

import java.util.Arrays;
import java.util.Iterator;

public class PrimesGeneratorTest {
    public static void main(String[] args) {
        Iterator iterator = Arrays.asList(PrimesGenerator.generate(100).reversed()).iterator();
        System.out.println(iterator.next());
    }
}