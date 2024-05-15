package game;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;
public interface MyInterface {
    /**
     * Method play on step
     * @param enemy - 1st team
     * @param friend - 2st team
     */
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend);
}
