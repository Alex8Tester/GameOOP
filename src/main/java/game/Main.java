package game;
import game.Agility.Crossbowman;
import game.Agility.Rogue;
import game.Agility.Sniper;
import game.Intellect.Magician;
import game.Intellect.Monk;
import game.Strength.Peasant;
import game.Strength.Piciner;
import game.Strength.Spearman;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();

        ArrayList<BaseUnit> team1 = new ArrayList<>();
        ArrayList<BaseUnit> team2 = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(7);
            int coordX1 = rand.nextInt(10);
            int coordX2 = rand.nextInt(10);
            Position xy1 = new Position(coordX1, 0);
            Position xy2 = new Position(coordX2, 9);
            switch (val) {
                case 0:
                    team1.add(new Crossbowman(getName(), i, 0));
                    team2.add(new Crossbowman(getName(), i, 9));
                    break;
                case 1:
                    team1.add(new Rogue(getName(), i, 0));
                    team2.add(new Rogue(getName(), i, 9));
                    break;
                case 2:
                    team1.add(new Sniper(getName(), i, 0));
                    team2.add(new Sniper(getName(), i, 9));
                    break;
                case 3:
                    team1.add(new Magician(getName(), i, 0));
                    team2.add(new Magician(getName(), i, 9));
                    break;
                case 4:
                    team1.add(new Monk(getName(), i, 0));
                    team2.add(new Monk(getName(), i, 9));
                    break;
                case 5:
                    team1.add(new Peasant(getName(), i, 0));
                    team2.add(new Peasant(getName(), i, 9));
                    break;
                case 6:
                    team1.add(new Spearman(getName(), i, 0));
                    team2.add(new Spearman(getName(), i, 9));
                    break;
                case 7;
                    team1.add(new Piciner(getName(), i, 0));
                    team2.add(new Piciner(getName(), i, 0));
                default:
                    break;
            }
        }
        System.out.println("Team 1:");
        for (BaseUnit a : team1) {
            System.out.printf("Name: %s, Position: x: %d,y: %d\n", a.name, a.position.getX(), a.position.getY());
        }
        System.out.println("Team 2:");
        for (BaseUnit a : team2) {
            System.out.printf("Name: %s, Position: x: %d,y: %d\n", a.name, a.position.getX(), a.position.getY());
        }
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }
}
