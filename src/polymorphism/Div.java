package polymorphism;

public abstract class Div {

    public double x;
    public double y;

    public Div (double x, double y){
        this.x=x;
        this.y=y;
    }
    public abstract double calcResult();
}
