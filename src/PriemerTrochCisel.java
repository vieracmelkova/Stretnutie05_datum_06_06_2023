import java.util.Scanner;

public class PriemerTrochCisel {

    static double priemer(double fa, double fb, double fc){

        /* double priemerCisel = (fa + fb + fc)/3;
        return priemerCisel; */
        return (fa + fb + fc)/3;

    }


    public static void main(String[] args) {

        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        System.out.println("Zadaj cislo a: ");
        double a = mojObjekt.nextDouble();

        System.out.println("Zadaj cislo b: ");
        double b = mojObjekt.nextDouble();

        System.out.println("Zadaj cislo c: ");
        double c = mojObjekt.nextDouble();

        double vysledok = priemer (a, b, c);
        System.out.println("Priemerom danych cisel je " + vysledok);

    }
}
