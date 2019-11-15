/**
 * Created by estebanparra on 4/21/19.
 */
public class Math {


    public double multiply(double a, double b) {

        double result = 0.0;
        if (b > 1.0) {
            result = a * b;
        } else {
            result = a;
        }

        return result;
    }

    public double add(double a, double b) {

        return a + b;
    }

    public double divide(double a, double b) {

        return a / b;
    }


    public double substract(double a, double b) {

        return add(a, -b);
    }

}
