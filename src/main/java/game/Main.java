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
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static ArrayList<BaseUnit> holyTeam = new ArrayList<>();
    public static ArrayList<BaseUnit> darkTeam = new ArrayList<>();
    public static ArrayList<BaseUnit> allTeam = new ArrayList<>();

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

    public static void main(String[] args) {
        initTeam();
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        allTeam.sort((o1, o2) -> o2.getInitiative() - o1.getInitiative());

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            View.view();
            scanner.nextLine();
            int summ1HP = 0;
            int summ2HP = 0;
            for (BaseUnit unit : holyTeam){
                summ1HP += unit.getHP();
            }
            for (BaseUnit unit : darkTeam){
                summ2HP += unit.getHP();
            }
            if (summ1HP == 0){
                System.out.println("Winner team darkTeam");
                flag = false;
                break;
            }
            if (summ2HP == 0){
                System.out.println("Winner team holyTeam");
                flag = false;
                break;
            }
            for (BaseUnit unit : allTeam) {
                if (holyTeam.contains(unit)) unit.step(darkTeam, holyTeam);
                else unit.step(holyTeam, darkTeam);
            }
        }
    }

    public static void initTeam() {
        int teamCount = 10;
        Random rand = new Random();
        for (int i = 1; i < teamCount+1; i++) {
            int val = rand.nextInt(8);
            int coordX1 = rand.nextInt(10);
            int coordX2 = rand.nextInt(10);
            Position xy1 = new Position(coordX1, 1);
            Position xy2 = new Position(coordX2, 10);
            switch (val) {
                case 0:
                    holyTeam.add(new Crossbowman(getName(), i, 1));
                    break;
                case 1:
                    holyTeam.add(new Rogue(getName(), i, 1));
                    break;
                case 2:
                    holyTeam.add(new Sniper(getName(), i, 1));
                    break;
                case 3:
                    holyTeam.add(new Magician(getName(), i, 1));
                    break;
                case 4:
                    holyTeam.add(new Monk(getName(), i, 1));
                    break;
                case 5:
                    holyTeam.add(new Peasant(getName(), i, 1));
                    break;
                case 6:
                    holyTeam.add(new Spearman(getName(), i, 1));
                    break;
                case 7:
                    holyTeam.add(new Piciner(getName(), i, 1));
                    break;
                default:
                    break;
            }
        }
        for (int i = 1; i < teamCount+1; i++) {
            int val = rand.nextInt(8);
            int coordX1 = rand.nextInt(10);
            int coordX2 = rand.nextInt(10);
            Position xy1 = new Position(coordX1, 1);
            Position xy2 = new Position(coordX2, 10);
            switch (val) {
                case 0:
                    darkTeam.add(new Crossbowman(getName(), i, 10));
                    break;
                case 1:
                    darkTeam.add(new Rogue(getName(), i, 10));
                    break;
                case 2:
                    darkTeam.add(new Sniper(getName(), i, 10));
                    break;
                case 3:
                    darkTeam.add(new Magician(getName(), i, 10));
                    break;
                case 4:
                    darkTeam.add(new Monk(getName(), i, 10));
                    break;
                case 5:
                    darkTeam.add(new Peasant(getName(), i, 10));
                    break;
                case 6:
                    darkTeam.add(new Spearman(getName(), i, 10));
                    break;
                case 7:
                    darkTeam.add(new Piciner(getName(), i, 10));
                    break;
                default:
                    break;
            }
        }
    }
}
