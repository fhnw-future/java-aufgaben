import java.util.Scanner;

public class rechnerJuni {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isOperator = true;

        System.out.println("Gib eine erste Zahl ein ");
        double zahl1 = s.nextDouble();

        System.out.println("Gib eine zweite Zahl ein ");
        double zahl2 = s.nextDouble();

        double resultat = 0;

        do {
            System.out.println("Gib einen Operator ein ");
            String operator = s.next();
            isOperator = true;

            switch (operator) {
                case "+":
                    resultat = zahl1 + zahl2;
                    break;
                case "-":
                    resultat = zahl1 - zahl2;
                    break;       
                case ":":
                    resultat = zahl1 / zahl2;
                    break;   
                case "*":
                    resultat = zahl1 * zahl2;
                    break;  
                default:
                    isOperator = false;
                    System.out.println("Du hast keinen gültigen Operator angegeben...");
                    break;
            }
        } while (isOperator == false);

        System.out.println(resultat);



  
    }
}