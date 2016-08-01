import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Peter.Barron on 22/07/2016.
 */
public class runHW06q1 {

    public static void main(String[] args) throws IOException {
        rectangle rectangle1 = new rectangle();

        BufferedReader brA = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brB = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(brA.readLine());
        int b = Integer.parseInt(brB.readLine());

        int rectangle1area=rectangle1.rectangleArea(a,b);
        System.out.println(rectangle1area);
    }

}
