import java.util.Scanner;

public class VystupZFunkcie {

    static int vysledokSuctu (int a, int b){
    /*    int sucet = a + b;
        return (sucet); */

        return (a + b);
    }

    public static void main(String[] args) {

        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        System.out.println("Zadaj cislo a: ");
        int a = mojObjekt.nextInt();

        System.out.println("Zadaj cislo b: ");
        int b = mojObjekt.nextInt();

    /*    int vysledok = vysledokSuctu (a, b);
        System.out.println("Vysledok suctu je " + vysledok); */

        System.out.println("Vysledok suctu je " + vysledokSuctu(a, b));

    }

}
