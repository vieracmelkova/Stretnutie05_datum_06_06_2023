import java.util.Scanner;

public class ObdlznikZHviezdiciek {

    static void vykreslenieObdlznika(int fa, String fznak){
            System.out.println(fznak.repeat(fa));
            System.out.println(fznak + " ".repeat(fa-2) + fznak);
            System.out.println(fznak.repeat(fa));
    }



    public static void main(String[] args) {

        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        System.out.println("Zadaj cislo a: ");
        int a = mojObjekt.nextInt();

        System.out.println("Zadaj znak: ");
        String znak = mojObjekt.next();

        vykreslenieObdlznika (a, znak);


    }
}
