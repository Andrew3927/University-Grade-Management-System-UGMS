import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private String ID;
    private Double[] scores = new Double[15];
    private int credit;


    public Student(String firstName, String lastName, String ID, double scores, int index) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ID = ID;
        this.scores[index] = scores;
    }

    public Student(String firstName, String lastName, String id, String s, int index) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ID = id;
        scores[index] = Double.valueOf(s);
    }

    public static double getGPA(Double[] Score, AllStudent allStudent) {//算gpa

        double gradePointTotal = 0;
        double gradeOfEachCourseTotal = 0;
        for (int i = 0; i < allStudent.courses.size(); i++) {
            if (Score[i] == null) continue;
            gradePointTotal += pointOfEachCourse(Score[i]) * allStudent.courses.get(i).getCredit();
            gradeOfEachCourseTotal += allStudent.courses.get(i).getCredit();
        }

        return Double.parseDouble(new java.text.DecimalFormat("#.00").format(gradePointTotal / gradeOfEachCourseTotal));
    }

    public static double pointOfEachCourse(double grade) {//根据实际成绩判断学分方法
        double point = 0.0;
        if (grade >= 93) point = 4.0;
        else if (grade >= 88) point = 3.7;
        else if (grade >= 83) point = 3.3;
        else if (grade >= 78) point = 3.0;
        else if (grade >= 72) point = 2.7;
        else if (grade >= 68) point = 2.3;
        else if (grade >= 63) point = 2.0;
        else if (grade >= 58) point = 1.7;
        else if (grade >= 53) point = 1.3;
        else if (grade >= 50) point = 1.0;
        else point = 0.0;

        return point;
    }

    public static String Grade(double grade) {
        if (grade >= 93) return "A+";
        else if (grade >= 88) return "A";
        else if (grade >= 83) return "A-";
        else if (grade >= 78) return "B+";
        else if (grade >= 72) return "B";
        else if (grade >= 68) return "B-";
        else if (grade >= 63) return "C+";
        else if (grade >= 58) return "C";
        else if (grade >= 53) return "C-";
        else if (grade >= 50) return "D";
        else if (grade >= 40) return "F";
        else return "O";
    }
    
    public String toString() {
        return lastName + "," + firstName + "\t" + ID + "\t" + Arrays.toString(scores);
    }

    public String getID() {
        return ID;
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

    public int getCredit() {
        return credit;
    }

    public Double[] getScores() {
        return scores;
    }

    public double getScore(int index) {
        if (scores[index] == null) return -1.0;
        return scores[index];
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setID(String ID) {
        this.ID = ID;
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
