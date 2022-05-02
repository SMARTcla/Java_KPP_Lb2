package KPP.MyLab2.proxy;

public class NumFunction implements Evaluatable {
    @Override
    public double evalf(double x) {
        return Math.sin(x);
    }
}
