package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int roundedNum = (int) Math.round((double) numberToBeRounded);
        System.out.println(roundedNum);
    }
}
