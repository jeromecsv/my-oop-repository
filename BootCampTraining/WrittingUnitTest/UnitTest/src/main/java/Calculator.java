import java.util.List;

public class Calculator {

    //ADDITION METHOD
    public int add(int num1, int num2){
       return num1 + num2;
    }
    //SUBTRACTION METHOD
    public int subtract(int num1, int num2){
        return num1 - num2;
    }
    //MULTIPLICATION METHOD
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    //DIVISION METHOD
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
    //AVERAGE METHOD
    public Float average(List<Float> valuesToBeAvaraged){
        Float getAve = (float) ((valuesToBeAvaraged.stream().mapToInt(i -> i.intValue()).sum()) / valuesToBeAvaraged.size());
        return getAve;
    }
}
