package numberPrograms;

public class Percentile {
    public static void main(String[] args) {
        int[] studentMarks = {12, 60, 80, 71, 30};
        percentile(studentMarks);
    }

    public static void percentile(int[] studentMarks) {
        int totalStudents = studentMarks.length;

        for (int i = 0; i < totalStudents; i++) {
            int count = 0;
            for (int j = 0; j < totalStudents; j++) {
                if (studentMarks[i] > studentMarks[j]) {
                    count += 1;
                }
            }
            float percentile = (count * 100f) / (totalStudents - 1);
            System.out.println("" + percentile + "%");
        }
    }
}
