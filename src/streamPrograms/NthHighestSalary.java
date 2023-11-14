package streamPrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NthHighestSalary {

    public static void main(String[] args) {
        Map<String, Integer> empMap = new HashMap<>();

        empMap.put("tom", 1600);
        empMap.put("jeff", 1600);
        empMap.put("rob", 1200);
        empMap.put("dan", 1700);
        empMap.put("bob", 1700);
        empMap.put("james", 1400);

//        findHighestSalary(2, empMap);
        findHighestSalaryWithDuplicates(2, empMap);
    }

    // No duplicates handling
    public static void findHighestSalary(int n, Map<String, Integer> map) {
        Stream<Map.Entry<String, Integer>> empStream = map.entrySet().stream();
        Stream<Map.Entry<String, Integer>> sortedStream = empStream.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
        List<Map.Entry<String, Integer>> list = sortedStream.collect(Collectors.toList());
        Map.Entry<String, Integer> result = list.get(n - 1);
        System.out.println(result);
    }

    // Duplicates handling
    public static void findHighestSalaryWithDuplicates(int n, Map<String, Integer> map) {
        Map<Integer, List<String>> grouped = map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        List<Map.Entry<Integer, List<String>>> list = grouped.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList());
        System.out.println(list.get(n - 1));
    }
}
