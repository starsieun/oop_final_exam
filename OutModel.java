/**
 * Created by kth919 on 2017-06-24.
 */
public class OutModel {

    private String stdNum; //학번
    private String name; // 이름
    private double midExamCal; // 중간
    private double finalExamCal; //기말
    private double attendCal; // 출석
    private double reportCal; // 과제
    private double sum; //총계
    private String grade; // 학점

    public OutModel(String stdNum, String name, double midExamCal, double finalExamCal, double attendCal, double reportCal, double sum, String grade) {
        this.stdNum = stdNum;
        this.name = name;
        this.midExamCal = midExamCal;
        this.finalExamCal = finalExamCal;
        this.attendCal = attendCal;
        this.reportCal = reportCal;
        this.sum = sum;
        this.grade = grade;
    }

    public String getStdNum() {
        return stdNum;
    }

    public String getName() {
        return name;
    }

    public double getMidExamCal() {
        return midExamCal;
    }

    public double getFinalExamCal() {
        return finalExamCal;
    }

    public double getAttendCal() {
        return attendCal;
    }

    public double getReportCal() {
        return reportCal;
    }

    public double getSum() {
        return sum;
    }

    public String getGrade() {
        return grade;
    }

}
