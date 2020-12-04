//import edu.princeton.cs.algs4.StdOut;
//
//public class ScoreInquiry {
//    public static void scoreInquirybyid(String id, AllStudent allStudent) {
//        for (int i = 0; i < allStudent.getGlobalStudentList().size(); i++) {
//            if (id.equals(allStudent.getGlobalStudentList().get(i).getStudentID())) {
//                for (int j = 0; j < allStudent.getGlobalStudentList().get(i).size(); j++) {
//                    if (allStudent.getGlobalStudentList().get(i).getScore(j) == -1.0) continue;
//                    StdOut.println(allStudent.getGlobalStudentList().get(j).getCourseCode() + "         " + Student.Grade(allStudent.getGlobalStudentList().get(i).getScore(j)));
//                }
//                StdOut.println("GPA: " + Student.getGPA(allStudent.getGlobalStudentList().get(i).getScores(), allStudent));
//                break;
//            }
//        }
//    }
//
//    public static void scoreInquirybysurname(String surname, AllStudent allStudent) {
//        for (int i = 0; i < allStudent.getGlobalStudentList().size(); i++) {
//            if (surname.equals(allStudent.getGlobalStudentList().get(i).getLastName())) {
//                StdOut.println(allStudent.getGlobalStudentList().get(i).getFirstName() + " " + allStudent.getGlobalStudentList().get(i).getLastName() + " " + allStudent.getGlobalStudentList().get(i).getStudentID());
//                for (int j = 0; j < allStudent.getGlobalStudentList().get(i).size(); j++) {
//                    if (allStudent.getGlobalStudentList().get(i).getScore(j) == -1.0) continue;
//                    StdOut.println(allStudent.getGlobalStudentList().get(j).getCourseCode() + "         " + Student.Grade(allStudent.getGlobalStudentList().get(i).getScore(j)));
//                }
//                StdOut.println("GPA: " + Student.getGPA(allStudent.getGlobalStudentList().get(i).getScores(), allStudent));
//                StdOut.println("");
//
//            }
//        }
//    }
//}
