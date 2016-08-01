import java.io.IOException;

/**
 * Created by Peter.Barron on 22/07/2016.
 */
public class rectangle {

    public int rectangleArea(int a, int b) throws ArithmeticException {
        int area = 0;

        if (a < 0 || b < 0) throw new ArithmeticException();

        area = a * b;

        return area;
    }
}
