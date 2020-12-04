import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private String ID;
    private Double[] scores = new Double[15];
    private int Credit;


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
        return Credit;
    }

    public Double[] getScores() {
        return scores;
    }

    public double getScore(int index) {
        if (scores[index] == null) return -1.0;
        return scores[index];
    }

    public void setCredit(int credit) {
        Credit = credit;
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
