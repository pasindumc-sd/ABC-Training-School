
package Models;


public class TutorDetails {
    private int tutorId;
    private String tutorName;
    private String tutorNIC;
    private String tutorAddress;
    private String employmentDate;
    private String courseName;

    public TutorDetails(int tutorId, String tutorName, String tutorNIC, String tutorAddress, String employmentDate, String courseName) {
        this.tutorId = tutorId;
        this.tutorName = tutorName;
        this.tutorNIC = tutorNIC;
        this.tutorAddress = tutorAddress;
        this.employmentDate = employmentDate;
        this.courseName = courseName;
    }

   

    public int getTutorId() {
        return tutorId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTutorId(int tutorId) {
        this.tutorId = tutorId;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public String getTutorNIC() {
        return tutorNIC;
    }

    public void setTutorNIC(String tutorNIC) {
        this.tutorNIC = tutorNIC;
    }

    public String getTutorAddress() {
        return tutorAddress;
    }

    public void setTutorAddress(String tutorAddress) {
        this.tutorAddress = tutorAddress;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }
    
    
}
