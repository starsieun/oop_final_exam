import java.awt.*;
import java.util.ArrayList;

/**
 * Created by kth919 on 2017-06-24.
 */
public class Controller {

    private InputView inputView;
    private OutputView outputView;
    private Calculator calculator;

    private ArrayList<InModel> inModels = new ArrayList<>();
    private ArrayList<OutModel> outModels = new ArrayList<>();

    public void controllerToDo(){ // 컨트롤러 작동 순서

            doInputView();
            doCalculator(inModels);
            doOutputView(outModels);

    }

    private void doInputView(){ // 입력뷰의 할일을 해라

        Frame f = new Frame();
        inputView = new InputView(f);

        inputView.setSize     (400, 500);
        inputView.setLocation (400, 400);
        inputView.setResizable(false);
        inputView.setVisible  (true);

//        System.out.println(inputView.getInputList().get(0).getStdNum());
        inModels = inputView.getInputList();

    }

    private void doCalculator(ArrayList<InModel> inModels) { // 계산해라

//        System.out.println("인모델 사이즈" + inModels.size());

        for (int i = 0; i<inModels.size(); i++) {

            calculator = new Calculator(inModels.get(i));

//            System.out.println(i + "의 학번은 " + inModels.get(i).getStdNum() + " : " + inModels.get(i).getName() + " : " + calculator.midRate() + " : " + calculator.finalRate() + " : " +
//                    calculator.attendRate() + " : " + calculator.reportRate() + " : " + calculator.sumCal() + " : " + calculator.gradeCal(calculator.sumCal()));

            outModels.add(i, new OutModel(inModels.get(i).getStdNum(), inModels.get(i).getName(), calculator.midRate(), calculator.finalRate(),
                    calculator.attendRate(), calculator.reportRate(), calculator.sumCal(), calculator.gradeCal(calculator.sumCal()) ) );

        }

    }

    private void doOutputView(ArrayList<OutModel> outModels){ // 출력뷰의 할일을 해라

        Frame f = new Frame();
        outputView = new OutputView(f);

        outputView.setSize     (500, 500);
        outputView.setResizable(false);
        inputView.setLocation (400, 400);
        outputView.value_set(outModels);
        outputView.print();
        outputView.setVisible(true);

    }

}
