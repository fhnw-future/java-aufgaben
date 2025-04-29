import java.util.Scanner;

public class rechner {
    public static void main(String[] args) {
        double resultat, zahl1, zahl2;
        boolean correct_operator = false;
        int check = 0;
        String operator;

        Scanner eingabe = new Scanner(System.in);

    do {
        System.out.println("Gib deine erste Zahl ein: ");
        zahl1 = eingabe.nextDouble();
        System.out.println("Deine erste Zahl " + zahl1);

        System.out.println("Gib deine zweite Zahl ein: ");
        zahl2 = eingabe.nextDouble();
        System.out.println("Deine zweite Zahl " + zahl2);

        do {
        System.out.println("Gib dein Operator ein: ");
        operator = eingabe.next();
        System.out.println("Dein Operator " + operator);

            if (operator.equals("/") || operator.equals("*") || operator.equals("-") || operator.equals("+")) {
                resultat = berechnung(zahl1, zahl2, operator);
                System.out.println(zahl1 + " " + operator + " " + zahl2 + " ergbibt " + resultat );
                correct_operator = true;
            } else {
                System.out.println("Falscher Operator, bitte gib einen richtigen operator ein");
                correct_operator = false;
            }

        }  while (correct_operator == false);

        System.out.println("Willst du weiter machen? Dann gib 1 ein");
        check = eingabe.nextInt();


    } while (check == 1);

    System.out.println("bye");
    
    }

    public static double berechnung(double a, double b, String operator) {
        double resultat = 0;
        switch (operator) {
            case "/":
                resultat = a / b;
                break;
            case "*":
                resultat = a * b;
                break;
            case "+":
                resultat = a + b;
                break;
            case "-":
                resultat = a - b;
                break;        
            default:
                System.out.println("Kein operator");
                break;

        }
        return resultat;

    }
}
