import edu.princeton.cs.algs4.StdOut;

public class ScoreInquiry {
    public static void scoreInquirybyid(String id, AllStudent allStudent) {
        for (int i = 0; i < allStudent.getSizeOfGlobalStudentList(); i++) {
            if (id.equals(allStudent.getGlobalStudentList().get(i).getStudentID())) {
                for (int j = 0; j < allStudent.getGlobalStudentList().get(i).size(); j++) {
                    if (allStudent.getGlobalStudentList().get(i).getScore(j) == -1.0) continue;
                    StdOut.println(allStudent.getGlobalCoursesList().get(j).getCourseCode() + "         " + allStudent.getGlobalStudentList().get(i).Grade(j));

                }
                StdOut.println("GPA: " + allStudent.getGPA(allStudent.getGlobalStudentList().get(i).getScores()));
                break;
            }
        }
    }

    public static void scoreInquirybysurname(String surname, AllStudent allStudent) {
        for (int i = 0; i < allStudent.getSizeOfGlobalStudentList(); i++) {
            if (surname.equals(allStudent.getGlobalStudentList().get(i).getLastName())) {
                StdOut.println(allStudent.getGlobalStudentList().get(i).getFirstName() + " " + allStudent.getGlobalStudentList().get(i).getLastName() + " " + allStudent.getGlobalStudentList().get(i).getStudentID());
                for (int j = 0; j < allStudent.getGlobalStudentList().get(i).size(); j++) {
                    if (allStudent.getGlobalStudentList().get(i).getScore(j) == -1.0) continue;
                    StdOut.println(allStudent.getGlobalCoursesList().get(j).getCourseCode() + "         " + allStudent.getGlobalStudentList().get(i).Grade(j));
                }
                StdOut.println("GPA: " + allStudent.getGPA(allStudent.getGlobalStudentList().get(i).getScores()));
                StdOut.println("");

            }
        }
    }

    public static void scoreInquiryBySurnameWithWildCards(String surname, AllStudent allStudent) {
        for (int i = 0; i < allStudent.getSizeOfGlobalStudentList(); i++) {
            if (CompareSurname(surname, allStudent.getGlobalStudentList().get(i).getLastName())) {
                StdOut.println(allStudent.getGlobalStudentList().get(i).getFirstName() + " " + allStudent.getGlobalStudentList().get(i).getLastName() + " " + allStudent.getGlobalStudentList().get(i).getStudentID());
                for (int j = 0; j < allStudent.getGlobalStudentList().get(i).size(); j++) {
                    if (allStudent.getGlobalStudentList().get(i).getScore(j) == -1.0) continue;
                    StdOut.println(allStudent.getGlobalCoursesList().get(j).getCourseCode() + "         " + allStudent.getGlobalStudentList().get(i).Grade(j));
                }
                StdOut.println("GPA: " + allStudent.getGPA(allStudent.getGlobalStudentList().get(i).getScores()));
                StdOut.println("");

            }
        }
    }

    private static boolean CompareSurname(String surname, String surname2) {
        int length = surname.length();
        if (length > surname2.length()) return false;
        String ok = surname2.substring(0, length);
        return ok.equals(surname);
    }

}
