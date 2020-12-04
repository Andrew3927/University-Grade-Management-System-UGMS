import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;

public class Sort {
    public static void quickSortScore(AllStudent allStudent, int length) {
        ArrayList<Student> all = allStudent.getGlobalStudentList();
        quickSortInternallyScore(allStudent, 0, length - 1);
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternallyScore(AllStudent allStudent, int p, int r) {

        if (p >= r) return;
        StdRandom.shuffle(allStudent.getNowClassStudentList().toArray());

        int q = partitionScore(allStudent, p, r); // 获取分区点
        quickSortInternallyScore(allStudent, p, q - 1);
        quickSortInternallyScore(allStudent, q + 1, r);
    }

    private static int partitionScore(AllStudent allStudent, int p, int r) {
        double pivot = allStudent.getNowClassStudentList().get(r).getScore(0);
        int i = p;
        for (int j = p; j < r; ++j) {
            if (allStudent.getNowClassStudentList().get(j).getScore(0) < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    Student mid = allStudent.getNowClassStudentList().get(i);
                    allStudent.getNowClassStudentList().set(i++, allStudent.getNowClassStudentList().get(j));
                    allStudent.getNowClassStudentList().set(j, mid);
                }
            }
        }
        Student mid = allStudent.getNowClassStudentList().get(i);
        allStudent.getNowClassStudentList().set(i, allStudent.getNowClassStudentList().get(r));
        allStudent.getNowClassStudentList().set(r, mid);
        return i;
    }


    public static void quickSortSurnName(AllStudent allStudent, int length) {
        quickSortInternallyLastName(allStudent, 0, length - 1);
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternallyLastName(AllStudent allStudent, int p, int r) {

        if (p >= r) return;
        StdRandom.shuffle(allStudent.getGlobalStudentList().toArray());

        int q = partitionSurnName(allStudent, p, r); // 获取分区点
        quickSortInternallyLastName(allStudent, p, q - 1);
        quickSortInternallyLastName(allStudent, q + 1, r);
    }

    private static int partitionSurnName(AllStudent allStudent, int p, int r) {
        String pivot = allStudent.getNowClassStudentList().get(r).getFirstName();
        int i = p;
        for (int j = p; j < r; ++j) {
            if (pivot.compareTo(allStudent.getNowClassStudentList().get(j).getFirstName()) > 0) {
                if (i == j) {
                    ++i;
                } else {
                    Student mid = allStudent.getNowClassStudentList().get(i);
                    allStudent.getNowClassStudentList().set(i++, allStudent.getNowClassStudentList().get(j));
                    allStudent.getNowClassStudentList().set(j, mid);
                }
            }
        }
        Student mid = allStudent.getNowClassStudentList().get(i);
        allStudent.getNowClassStudentList().set(i, allStudent.getNowClassStudentList().get(r));
        allStudent.getNowClassStudentList().set(r, mid);
        return i;
    }

}






