package game;
import java.util.List;

public interface MyInterface {
    /**
     * Method play on step
     * @param team1 - 1st team
     * @param team2 - 2st team
     */
    public void step(List<BaseUnit>team1, List<BaseUnit>team2);
}
