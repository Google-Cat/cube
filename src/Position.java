/**
 * Created by lunin_000 on 11.10.2015.
 */
public class Position {
    private int x;
    private int y;

    public Position() {


    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;

    }

    @Override
    public String toString() {
        return String.valueOf(x) + " " + String.valueOf(y);
    }
}
