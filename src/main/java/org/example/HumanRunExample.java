package org.example;

import java.util.*;

public class HumanRunExample {

    public static void main(String[] args){
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human("John", "Doe", 25));
        humanList.add(new Human("Jane", "Smith", 30));
        humanList.add(new Human("Alice", "Johnson", 22));
        humanList.add(new Human("Bob", "Brown", 28));

        // a) HashSet
        Set<Human> hashSet = new HashSet<>(humanList);
        System.out.println("HashSet: " + hashSet);

        // b) LinkedHashSet
        Set<Human> linkedHashSet = new LinkedHashSet<>(humanList);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // c) TreeSet (по имени)
        Set<Human> treeSetByName = new TreeSet<>(humanList);
        System.out.println("TreeSet (по имени): " + treeSetByName);

        // d) TreeSet с компаратором по фамилии
        Set<Human> treeSetByLastName = new TreeSet<>(new HumanComparatorByLastName());
        treeSetByLastName.addAll(humanList);
        System.out.println("TreeSet (по фамилии): " + treeSetByLastName);

        // e) TreeSet с анонимным компаратором по возрасту
        Set<Human> treeSetByAge = new TreeSet<>(new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return Integer.compare(h1.getAge(), h2.getAge());
            }
        });
        treeSetByAge.addAll(humanList);
        System.out.println("TreeSet (по возрасту): " + treeSetByAge);

        // f) Объяснение различий
        /*
         * HashSet: Не гарантирует порядок. Элементы могут быть в произвольном порядке.
         * LinkedHashSet: Сохраняет порядок добавления элементов. Элементы выводятся в том порядке, в каком они были добавлены.
         * TreeSet (по имени): Сортирует элементы по имени в алфавитном порядке. Не допускает дубликатов.
         * TreeSet (по фамилии): Сортирует элементы по фамилии в алфавитном порядке. Не допускает дубликатов.
         * TreeSet (по возрасту): Сортирует элементы по возрасту. Не допускает дубликатов.
         */

    }
}
