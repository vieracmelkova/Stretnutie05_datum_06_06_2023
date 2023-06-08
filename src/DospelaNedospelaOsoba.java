import java.util.Scanner;

public class DospelaNedospelaOsoba {

    static void overenie (String fname, int fage){
        if (fage > 18) {
            System.out.println(fname + " je dospela osoba.");
        } else {
            System.out.println(fname + " je nedospela osoba.");
        }
    }

    public static void main(String[] args) {

        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        System.out.println("Zadaj meno osoby: ");
        String name = mojObjekt.next();

        System.out.println("Zadaj vek osoby: ");
        int age = mojObjekt.nextInt();

        overenie(name, age);

    }
}
