package polymorphism;

public class DivA extends Div {

    public DivA(double x, double y){
        super(x,y);
    }
    public double calcResult() {
        return x * y;
    }
}
