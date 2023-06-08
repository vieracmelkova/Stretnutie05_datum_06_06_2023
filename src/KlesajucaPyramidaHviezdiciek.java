import java.util.Scanner;
public class KlesajucaPyramidaHviezdiciek {

    static void vykresleniePyramidy(int fa, String fznak){

        for (int i = fa; i > 0; i--) {
            System.out.println(fznak.repeat(i));
        }
    }

    public static void main(String[] args) {

        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        System.out.println("Zadaj cislo a: ");
        int a = mojObjekt.nextInt();

        System.out.println("Zadaj znak: ");
        String znak = mojObjekt.next();

        vykresleniePyramidy (a, znak);

    }
}
