import java.util.Scanner;

public class start010617 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Gib die erste Zahl ein:");
        double zahl1 = s.nextDouble();
        System.out.println("Deine erste Zahl " + zahl1);

        System.out.println("Gib die zweite Zahl ein:");
        double zahl2 = s.nextDouble();
        System.out.println("Deine zweite Zahl " + zahl2);

        System.out.println("Gib deinen Operator ein:");
        String operator = s.next();
        System.out.println("Dein Operator " + operator);



    }
}
