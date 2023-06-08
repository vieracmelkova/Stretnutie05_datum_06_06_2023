import java.util.Scanner;

public class zvysokPoDeleni {

    static void delenieSoZvyskom(int fa, int fb){
        if (fa > fb){
            System.out.println("Zvysok po deleni cisel " + fa + " a " + fb + " je " + (fa % fb));
        } else if (fb > fa) {
            System.out.println("Zvysok po deleni cisel " + fb + " a " + fa + " je " + (fb % fa));
        } else {
            System.out.println("Zvysok po deleni cisel " + fa + " a " + fb + " je 0");
        }
    }

    public static void main(String[] args) {
        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        System.out.println("Zadaj cislo a: ");
        int a = mojObjekt.nextInt();

        System.out.println("Zadaj cislo b: ");
        int b = mojObjekt.nextInt();

        delenieSoZvyskom (a, b);
    }
}
