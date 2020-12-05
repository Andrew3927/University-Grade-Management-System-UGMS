import edu.princeton.cs.algs4.StdOut;

public class SortingOnGPA {
    public static void sorting(AllStudent allStudent) {
        Sort.quickSortGPA(allStudent, allStudent.getSizeOfGlobalStudentList());
        StdOut.println("Student ID:\t\tStudent name:\t\tGPA");
        for (Student student : allStudent.getGlobalStudentList()) {
            StdOut.println(student.getStudentID() + "\t\t" + student.getName() + "\t\t" + allStudent.getGPA(student.getScores()));
        }
    }
}
