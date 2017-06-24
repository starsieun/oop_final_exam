/**
 * Created by kth919 on 2017-06-24.
 */
public class InModel {

    private String stdNum; //학번
    private String name; // 이름
    private int midExam; // 중간
    private int finalExam; //기말
    private int attend; // 출석
    private int report; // 과제

    public InModel(String stdNum, String name, int midExam, int finalExam, int attend, int report) {
        this.stdNum = stdNum;
        this.name = name;
        this.midExam = midExam;
        this.finalExam = finalExam;
        this.attend = attend;
        this.report = report;
    }

    public String getStdNum() {
        return stdNum;
    }

    public String getName() {
        return name;
    }

    public int getMidExam() {
        return midExam;
    }

    public int getFinalExam() {
        return finalExam;
    }

    public int getAttend() {
        return attend;
    }

    public int getReport() {
        return report;
    }

}
