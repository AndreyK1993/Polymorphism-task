package polymorphism;

public class DivB extends Div {
    private static final double CONST = 2;

    public DivB(double x, double y){
        super(x,y);
    }
    public double calcResult() {
        double sum = x + y;
        return sum * CONST;
    }
}
