
package Models;


public class StudentDetails {
    private int studentId;
    private String studentNo;
    private String studentName;
    private String studentBirthday;
    private String courseName;

    public StudentDetails(int studentId, String studentNo, String studentName, String studentBirthday, String courseName) {
        this.studentId = studentId;
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentBirthday = studentBirthday;
        this.courseName = courseName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(String studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    
}
