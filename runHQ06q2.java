import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Peter.Barron on 22/07/2016.
 */
public class runHQ06q2 {
    public static void main(String[] args) throws ColorException,TypeException  {

        ArrayList<plant> plants = new ArrayList<>();

        try
        {
            plants.add(new plant(100, "RED", "XXX"));
            plants.add(new plant(101, "PURPLE", "YYY"));

        }
        catch (ColorException e)
        {
            System.err.print(e);
        }

    }

}
