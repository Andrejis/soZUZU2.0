import java.util.Scanner;
public class main {
    public static void main(String[] args) throws NespravnyVekException {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Napis prve cislo: ");
        //int cislo1 = sc.nextInt();
        //System.out.print("Napis druhe cislo: ");
        //int cislo2 = sc.nextInt();
        //DelenieCisel(cislo1, cislo2);

        System.out.print("Zadaj tvoj vek: ");
        int vek = sc.nextInt();


        try {
            NespravnyVek(vek);
        } catch (NespravnyVekException vynimka) {
            System.out.println(vynimka);
        }


    }
    public static void DelenieCisel (int paCislo1, int paCislo2) {
        try {
            System.out.println(paCislo1 / paCislo2);
        } catch (ArithmeticException vynimka) {
            System.out.println(vynimka);
        }
    }
    public static void NespravnyVek (int paVek) throws NespravnyVekException {

        if (paVek >= 15) {
            System.out.println("Vek moze byt :) ");
        } else {
            throw new NespravnyVekException();
        }
    }
}