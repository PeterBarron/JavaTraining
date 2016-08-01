import java.awt.*;


/**
 * Created by Peter.Barron on 22/07/2016.
 */
public class plant {

    int size;
    String color;
    String type;

    public enum enumColor {
        BLUE, RED, YELLOW
    }

    public enum enumType {
        BUSH, ORCHID, CACTUS, FLOWERING
    }

    public plant(int size, String color, String type) {
        setSize(size);
        setColor(color);
        setType(type);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        try
        {
            enumColor.valueOf(color);               /* check to see if the color sent in is in the list defined in enumColor, if not the exception is thrown */
            this.color = color;
        } catch (IllegalArgumentException e) {
            throw new ColorException("Illegal Color: " + color);
        }
     }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "size=" + size + ", type=" + type + ", color=" + color;
    }
}
