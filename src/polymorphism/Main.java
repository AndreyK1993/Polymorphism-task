package polymorphism;

public class Main {
    static String roundResultA;
    static String roundResultB;
    public static void main (String[] args){
        double x=10;
        double y=5;

        Div DivA=new DivA(x,y);
        Div DivB=new DivB(x,y);

        double resultA = DivA.calcResult();
        double resultB = DivB.calcResult();

        String roundResultA = Rounder.roundValue(resultA);
        String roundResultB = Rounder.roundValue(resultB);


        System.out.println("Result from Device A: " + roundResultA +
                "\nResult from Device B: " + roundResultB);
    }
}
