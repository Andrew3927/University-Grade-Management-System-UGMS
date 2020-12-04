import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private Double[] scores = new Double[15];

    public Student(String buf_info, int index) {
        String[] temp_info = buf_info.split(",");
        this.firstName = temp_info[0];
        this.lastName = temp_info[1];
        this.studentID = temp_info[2];
        this.scores[index] = Double.parseDouble(temp_info[3]);
    }

//    public Student(String firstName, String lastName, String studentID, double scores, int index) {
//        this.lastName = lastName;
//        this.firstName = firstName;
//        this.studentID = studentID;
//        this.scores[index] = scores;
//    }
//
//    public Student(String firstName, String lastName, String id, String score, int index) {
//        this.lastName = lastName;
//        this.firstName = firstName;
//        this.studentID = id;
//        this.scores[index] = Double.valueOf(score);
//    }


    public String toString() {
        return lastName + "," + firstName + "\t" + studentID + "\t" + Arrays.toString(scores);
    }

    public String getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + "," + lastName;
    }

    public Double[] getScores() {
        return scores;
    }

    public double getScore(int index) {
        if (scores[index] == null) return -1.0;
        return scores[index];
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setScore(double score, int index) {

        scores[index] = score;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int size() {
        return scores.length;
    }
}
