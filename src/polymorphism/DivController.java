package polymorphism;

public class DivController {

    public void runApp(double x,double y) {

        Div DivA=new DivA(x,y);
        Div DivB=new DivB(x,y);

        double resultA = DivA.calcResult();
        double resultB = DivB.calcResult();

        String roundResultA = Rounder.roundValue(resultA);
        String roundResultB = Rounder.roundValue(resultB);

        view.getOutput(roundResultA, roundResultB) ;

    }

}