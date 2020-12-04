import edu.princeton.cs.algs4.StdOut;

public class SortingOnGPA {
    public static void sorting(AllStudent allStudent) {
        Sort.quickSortGPA(allStudent, allStudent.AllStudent.size());
        StdOut.println("Student ID:\t\tStudent name:\t\tGPA");
        for (Student student : allStudent.AllStudent) {
            StdOut.println(student.getID() + "\t\t" + student.getName() + "\t\t" + Student.getGPA(student.getScores(), allStudent));
        }
    }
}
