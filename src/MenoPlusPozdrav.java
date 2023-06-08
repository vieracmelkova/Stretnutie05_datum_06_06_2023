import java.util.Scanner;

public class MenoPlusPozdrav {

    static String uvitanie (String fname) {
        return "Ahoj " + fname + ".";
    }

    public static void main(String[] args) {
        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        System.out.println("Zadaj meno osoby: ");
        String name = mojObjekt.next();

        System.out.println(uvitanie(name));
    }
}
