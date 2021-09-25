package Katas;

import java.util.*;
import java.util.stream.Collectors;

public class MapComparator {
    public static void main(String[] args){
        sortByValue(Map.of("Five", 5,
                            "Three", 3,
                            "One", 1,
                            "Four", 4,
                            "Two", 2)).entrySet().forEach(System.out::println);
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map){

//        TreeMap<String, Integer> tree = new TreeMap<>(Comparator.comparingInt(map::get));
//        tree.putAll(map);
//        return tree;
        return map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }
}
