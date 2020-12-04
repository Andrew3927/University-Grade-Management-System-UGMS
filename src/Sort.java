import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;

public class Sort {
    // 快速排序，a是数组，n表示数组的大小
    public static void quickSortGPA(AllStudent allStudent, int length) {
        ArrayList<Student> all = allStudent.AllStudent;
        quickSortInternally(allStudent, 0, length - 1);
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternally(AllStudent allStudent, int p, int r) {

        if (p >= r) return;
        StdRandom.shuffle(allStudent.AllStudent.toArray());

        int q = partition(allStudent, p, r); // 获取分区点
        quickSortInternally(allStudent, p, q - 1);
        quickSortInternally(allStudent, q + 1, r);
    }

    private static int partition(AllStudent allStudent, int p, int r) {
        double pivot = FileIO.getGPA(allStudent.AllStudent.get(r).getScores(), allStudent);
        int i = p;
        for (int j = p; j < r; ++j) {
            if (FileIO.getGPA(allStudent.AllStudent.get(j).getScores(), allStudent) < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    Student mid = allStudent.AllStudent.get(i);
                    allStudent.AllStudent.set(i++, allStudent.AllStudent.get(j));
                    allStudent.AllStudent.set(j, mid);
                }
            }
        }
        Student mid = allStudent.AllStudent.get(i);
        allStudent.AllStudent.set(i, allStudent.AllStudent.get(r));
        allStudent.AllStudent.set(r, mid);
        return i;
    }


    public static void quickSortScore(AllStudent allStudent, int length) {
        ArrayList<Student> all = allStudent.AllStudent;
        quickSortInternallyScore(allStudent, 0, length - 1);
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternallyScore(AllStudent allStudent, int p, int r) {

        if (p >= r) return;
        StdRandom.shuffle(allStudent.nowClassStudent.toArray());

        int q = partitionScore(allStudent, p, r); // 获取分区点
        quickSortInternallyScore(allStudent, p, q - 1);
        quickSortInternallyScore(allStudent, q + 1, r);
    }

    private static int partitionScore(AllStudent allStudent, int p, int r) {
        double pivot = allStudent.nowClassStudent.get(r).getScore(0);
        int i = p;
        for (int j = p; j < r; ++j) {
            if (allStudent.nowClassStudent.get(j).getScore(0) < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    Student mid = allStudent.nowClassStudent.get(i);
                    allStudent.nowClassStudent.set(i++, allStudent.nowClassStudent.get(j));
                    allStudent.nowClassStudent.set(j, mid);
                }
            }
        }
        Student mid = allStudent.nowClassStudent.get(i);
        allStudent.nowClassStudent.set(i, allStudent.nowClassStudent.get(r));
        allStudent.nowClassStudent.set(r, mid);
        return i;
    }


    public static void quickSortSurnName(AllStudent allStudent, int length) {
        ArrayList<Student> all = allStudent.AllStudent;
        quickSortInternallySurnName(allStudent, 0, length - 1);
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternallySurnName(AllStudent allStudent, int p, int r) {

        if (p >= r) return;
        StdRandom.shuffle(allStudent.AllStudent.toArray());

        int q = partitionSurnName(allStudent, p, r); // 获取分区点
        quickSortInternallySurnName(allStudent, p, q - 1);
        quickSortInternallySurnName(allStudent, q + 1, r);
    }

    private static int partitionSurnName(AllStudent allStudent, int p, int r) {
        String pivot = allStudent.nowClassStudent.get(r).getFirstName();
        int i = p;
        for (int j = p; j < r; ++j) {
            if (pivot.compareTo(allStudent.nowClassStudent.get(j).getFirstName()) > 0) {
                if (i == j) {
                    ++i;
                } else {
                    Student mid = allStudent.nowClassStudent.get(i);
                    allStudent.nowClassStudent.set(i++, allStudent.nowClassStudent.get(j));
                    allStudent.nowClassStudent.set(j, mid);
                }
            }
        }
        Student mid = allStudent.nowClassStudent.get(i);
        allStudent.nowClassStudent.set(i, allStudent.nowClassStudent.get(r));
        allStudent.nowClassStudent.set(r, mid);
        return i;
    }

}






