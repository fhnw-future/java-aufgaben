import java.util.Scanner;

public class rechnerJUNI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String kontrolle;

        do {
        System.out.println("Gib die erste Zahl ein:");
        double zahl1 = s.nextDouble();
        System.out.println("Deine erste Zahl " + zahl1);

        System.out.println("Gib die zweite Zahl ein:");
        double zahl2 = s.nextDouble();
        System.out.println("Deine zweite Zahl " + zahl2);

        System.out.println("Gib deinen Operator ein:");
        String operator = s.next();
        System.out.println("Dein Operator " + operator);

        double result = 0;
        switch (operator) {
            case "/":
                if (zahl2 == 0) {
                    System.err.println("Du kannst nicht durch 0 rechnen");
                } else {
                    result = zahl1 / zahl2;
                }
                break;
            case "+":
                result = zahl1 + zahl2;
                break;
            case "-":
                result = zahl1 - zahl2;
                break;
            case "*":
                result = zahl1 * zahl2;
                break;
            default:
                System.err.println("Kein definierter operator");
                break;
        }
        System.out.println(result);

        System.out.println("Willst du weiter rechnen? Dann gib 'J' ein ");
        kontrolle = s.next();

        } 
        while (kontrolle.equals("J"));

    }
}
