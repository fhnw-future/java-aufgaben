import java.util.Scanner;

public class scanner2 {
    public static void main(String[] args) {
        double resultat, zahl1, zahl2;
        String operator;

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Gib deine erste Zahl ein: ");
        zahl1 = eingabe.nextDouble();
        System.out.println("Deine erste Zahl " + zahl1);

        System.out.println("Gib deine zweite Zahl ein: ");
        zahl2 = eingabe.nextDouble();
        System.out.println("Deine zweite Zahl " + zahl2);

        System.out.println("Gib dein Operator ein: ");
        operator = eingabe.next();
        System.out.println("Dein Operator " + operator);

        switch (operator) {
            case "/":
                resultat = zahl1 / zahl2;
                System.out.println(zahl1 + " durch " + zahl2 + " ergibt " + resultat);
                break;
            case "*":
                resultat = zahl1 * zahl2;
                System.out.println(zahl1 + " mal " + zahl2 + " ergibt " + resultat);
                break;
            case "+":
                resultat = zahl1 + zahl2;
                System.out.println(zahl1 + " plus " + zahl2 + " ergibt " + resultat);
                break;
            case "-":
                resultat = zahl1 - zahl2;
                System.out.println(zahl1 + " minus " + zahl2 + " ergibt " + resultat);
                break;        
            default:
                System.out.println("Kein operator");
                break;
        }







        
    }
}
