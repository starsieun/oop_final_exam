package ac.kr.jejunu;

import java.awt.*;

/**
 * Created by sieun on 2017. 6. 21..
 */
public class c계산창 {

    c입력창 inputView;

    int[] midium_exam;
    int[] final_exam;
    int[] admit;
    int[] report;


    c계산창(){

        inputView = new c입력창;

        midium_exam = new int[15];
        final_exam = new int[15];
        admit = new int[15];
        report = new int[15];

    }


     public int gradeCalculation(int i,int j,int k, int g ){

         int totalgrade = 0;

         totalgrade = midium_exam[i] * (30/100) + final_exam[j]*(30/100) + admit[k]*(20/100) + report[g]*(20/100);

         return totalgrade;
     }


     public String gradeABCDF(int grade){

         String gradeSigral;

         if(grade>=97){

             gradeSigral ="A+";

         }else if (grade >= 94){

             gradeSigral ="A0";

         }else if (grade >= 90){

             gradeSigral ="A-";

         }else if (grade >= 87){

             gradeSigral ="B+";

         }else if (grade >= 84){

             gradeSigral ="B0";

         }else if (grade >= 80){

             gradeSigral ="B-";

         }else if (grade >= 77){

             gradeSigral ="C+";

         }else if (grade >= 74){

             gradeSigral ="C0";

         }else if (grade >= 70){

             gradeSigral ="C-";

         }else if (grade >= 67){

             gradeSigral ="D+";

         }else if (grade >= 64){

             gradeSigral ="D0";

         }else if (grade >= 60){

             gradeSigral ="D-";
         }

         return gradeSigral;

     }
}
