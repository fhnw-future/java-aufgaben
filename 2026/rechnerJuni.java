import java.util.Scanner;

public class rechnerJuni {
    static Scanner s = new Scanner(System.in);
    
    private static double getZahl(String order) {
        System.out.println("Gib eine " + order + " Zahl ein ");
        double zahl = s.nextDouble();
        return zahl;
    
    }
    
    public static void main(String[] args) {
        boolean isOperator = true;
    
        double zahl1 = getZahl("erste");
        double zahl2 = getZahl("zweite");

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
                    if (zahl2 == 0) {
                        System.out.println("Du darfst nicht duch 0 rechnen!");
                        do {
                            zahl2 = getZahl("neue zweite");
                        } while (zahl2 == 0);
                    }
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

