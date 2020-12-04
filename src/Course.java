public class Course {
    private String courseCode;
    private int credit;
    private int classSize;

    public Course(String courseCode, String credit, String classSize) {
        this.courseCode = courseCode;
        this.credit = Integer.parseInt(credit);
        this.classSize = Integer.parseInt(classSize);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCredit() {
        return credit;
    }

    public int getClassSize() {
        return classSize;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setClassSize(int classSize) {
        this.classSize = classSize;
    }


}
