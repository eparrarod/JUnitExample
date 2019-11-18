/**
 * Created by estebanparra on 4/21/19.
 */
public class Math {

    public Math(){

    }

    public double multiply(double a, double b) {

        double result = 0.0;
        result = a * b;
        return result;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0.0){
            throw new ArithmeticException();
        }
        return a/b;
    }


    public double substract(double a, double b) {

        return add(a, -b);
    }

}
