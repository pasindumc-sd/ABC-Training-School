package Models;

public class BatchDetails {

    private int courseOfferingNumber;
    private String courseName;
    private String batchNumber;
    private String startDate;
    private double tuitionFee;
    private int courseId;

    public BatchDetails(int courseOfferingNumber, String courseName, String batchNumber, String startDate, double tuitionFee, int courseCode) {
        this.courseOfferingNumber = courseOfferingNumber;
        this.courseName = courseName;
        this.batchNumber = batchNumber;
        this.startDate = startDate;
        this.tuitionFee = tuitionFee;
        this.courseId = courseCode;
    }

    public int getCourseOfferingNumber() {
        return courseOfferingNumber;
    }

    public void setCourseOfferingNumber(int courseOfferingNumber) {
        this.courseOfferingNumber = courseOfferingNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    

}
