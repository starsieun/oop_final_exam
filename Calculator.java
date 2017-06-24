
/**
 * Created by kth919 on 2017-06-24.
 */
public class Calculator {

    private String stdNum; //학번
    private String name; // 이름
    private int midExam; // 중간
    private int finalExam; //기말
    private int attend; // 출석
    private int report; // 과제

    private double rate = 0.25;

    public Calculator(InModel inModel) {

        this.stdNum = inModel.getStdNum();
        this.name = inModel.getName();
        this.midExam = inModel.getMidExam();
        this.finalExam = inModel.getFinalExam();
        this.attend = inModel.getAttend();
        this.report = inModel.getReport();

    }

    public double midRate(){ // 중간 비율적용 점수

        return (int) (midExam * rate);
    }

    public double finalRate(){ // 기말 비율적용 점수

        return (int) (finalExam * rate);
    }

    public double attendRate(){ // 출석 비율적용 점수
        return (int) (attend * rate);
    }

    public double reportRate(){ // 과제 비율 적용점수
        return (int) (report * rate);
    }

    public double sumCal(){ // 평균 계산

        return (midRate() + finalRate() + attendRate() + reportRate());

    }

    public String gradeCal(double grade){ // 학점 계산

        String gradeSigral = null;

        if(grade>=97.0){

            gradeSigral ="A+";

        }else if (grade >= 94.0){

            gradeSigral ="A0";

        }else if (grade >= 90.0){

            gradeSigral ="A-";

        }else if (grade >= 87.0){

            gradeSigral ="B+";

        }else if (grade >= 84.0){

            gradeSigral ="B0";

        }else if (grade >= 80.0){

            gradeSigral ="B-";

        }else if (grade >= 77.0){

            gradeSigral ="C+";

        }else if (grade >= 74.0){

            gradeSigral ="C0";

        }else if (grade >= 70.0){

            gradeSigral ="C-";

        }else if (grade >= 67.0){

            gradeSigral ="D+";

        }else if (grade >= 64.0){

            gradeSigral ="D0";

        }else if (grade >= 60.0){

            gradeSigral ="D-";

        } else {
            gradeSigral ="D-";
        }

        return gradeSigral;

    }

}
