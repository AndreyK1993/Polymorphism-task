package polymorphism;

import polymorphism.Div;

public class DivB extends Div {

    public DivB(double x, double y){
        super(x,y);
    }
    public double calcResult() {
        double sum = x + y;
        return sum * 2;
    }
}
