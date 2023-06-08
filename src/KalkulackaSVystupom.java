import java.util.Scanner;

public class KalkulackaSVystupom {

    static double vypocet (double fa, double fb, String fznamienko){
        double fvysledok = 0;

        switch (fznamienko) {
            case "+":
                fvysledok = fa + fb;
                break;
            case "-":
                fvysledok = fa - fb;
                break;
            case "*":
                fvysledok = fa * fb;
                break;
            case "/":
                fvysledok = fa / fb;
        }
        return fvysledok;

    }

    public static void main(String[] args) {

        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        System.out.println("Zadaj cislo a: ");
        double a = mojObjekt.nextDouble();

        System.out.println("Zadaj cislo b: ");
        double b = mojObjekt.nextDouble();

        System.out.println("Zadaj znacku operacie, ktoru chces vykonat (+, -, *, /): ");
        String operand = mojObjekt.next();

        if (operand != "+" || operand != "-" || operand != "*" || operand != "/") {
            System.out.println("Zadal si nespravne znamienko operacie.");
        } else {
            double vysledok = vypocet(a, b, operand);
        }

    }
}
