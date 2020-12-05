import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;

public class Sort {
    // 快速排序，a是数组，n表示数组的大小
    public static void quickSortGPA(AllStudent allStudent, int length) {
        ArrayList<Student> all = allStudent.getGlobalStudentList();
        quickSortInternally(allStudent, 0, length - 1);
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternally(AllStudent allStudent, int p, int r) {

        if (p >= r) return;
        StdRandom.shuffle(allStudent.getGlobalStudentList().toArray());

        int q = partition(allStudent, p, r); // 获取分区点
        quickSortInternally(allStudent, p, q - 1);
        quickSortInternally(allStudent, q + 1, r);
    }

    private static int partition(AllStudent allStudent, int p, int r) {
//        double pivot = tool.getGPA(allStudent.getGlobalStudentList().get(r).getScore(), allStudent);
        double pivot = allStudent.getGPA(allStudent.getSelectedStudent(r).getScores());
        int i = p;
        for (int j = p; j < r; ++j) {
            if (allStudent.getGPA(allStudent.getSelectedStudent(j).getScores()) < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    Student mid = allStudent.getGlobalStudentList().get(i);
                    allStudent.getGlobalStudentList().set(i++, allStudent.getGlobalStudentList().get(j));
                    allStudent.getGlobalStudentList().set(j, mid);
                }
            }
        }
        Student mid = allStudent.getGlobalStudentList().get(i);
        allStudent.getGlobalStudentList().set(i, allStudent.getGlobalStudentList().get(r));
        allStudent.getGlobalStudentList().set(r, mid);
        return i;
    }


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
        ArrayList<Student> all = allStudent.getGlobalStudentList();
        quickSortInternallySurnName(allStudent, 0, length - 1);
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternallySurnName(AllStudent allStudent, int p, int r) {

        if (p >= r) return;
        StdRandom.shuffle(allStudent.getGlobalStudentList().toArray());

        int q = partitionSurnName(allStudent, p, r); // 获取分区点
        quickSortInternallySurnName(allStudent, p, q - 1);
        quickSortInternallySurnName(allStudent, q + 1, r);
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

    public static void quickSortID(AllStudent allStudent, int length) {
        ArrayList<Student> all = allStudent.getGlobalStudentList();
        quickSortInternallyID(allStudent, 0, length - 1);
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternallyID(AllStudent allStudent, int p, int r) {

        if (p >= r) return;
        StdRandom.shuffle(allStudent.getGlobalStudentList().toArray());

        int q = partitionID(allStudent, p, r); // 获取分区点
        quickSortInternallyID(allStudent, p, q - 1);
        quickSortInternallyID(allStudent, q + 1, r);
    }

    private static int partitionID(AllStudent allStudent, int p, int r) {
        String pivot = allStudent.getNowClassStudentList().get(r).getStudentID();
        int i = p;
        for (int j = p; j < r; ++j) {
            if (pivot.compareTo(allStudent.getNowClassStudentList().get(j).getStudentID()) > 0) {
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





