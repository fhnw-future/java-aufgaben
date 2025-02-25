import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zahl A eingeben: ");
        double a = s.nextDouble();

        System.out.println("Zahl B eingeben: ");
        double b = s.nextDouble();

        //System.out.println("Zahl A ist " + a + " und Zahl B ist " + b);
        System.out.println("Operator eingeben: ");
        String operator = s.next();
        //String operator = s.nextLine();

        System.out.println("Operator ist "+ operator);

        switch(operator) {
            case "+":
                System.out.println("Plus Case");
                break;
            default:
                System.out.println("Default Case");
                break;

        }
    }
    
}
