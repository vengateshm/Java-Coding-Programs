package insertInterval;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {

        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(5, 7));
        intervals.add(new Interval(8, 9));

        Interval newInterval = new Interval(2, 6);

        // 1,3 5,7 8,9
        //   4,6
        //   2,6

        int listIndex = 0;
        ArrayList<Interval> outputs = new ArrayList<>();

        // Get all non overlapping interval before new interval
        while (listIndex < intervals.size() && intervals.get(listIndex).end < newInterval.start) {
            outputs.add(intervals.get(listIndex));
            listIndex += 1;
        }

        // Merge overlapping intervals
        while (listIndex < intervals.size() && intervals.get(listIndex).start <= newInterval.end) {
            newInterval.start = Math.min(intervals.get(listIndex).start, newInterval.start);
            newInterval.end = Math.max(intervals.get(listIndex).end, newInterval.end);
            listIndex += 1;
        }

        outputs.add(newInterval); // Merging into one interval so outside

        // Add remaining non overlapping
        while (listIndex < intervals.size()) {
            outputs.add(intervals.get(listIndex));
            listIndex += 1;
        }

        outputs.forEach(System.out::println);
    }
}
