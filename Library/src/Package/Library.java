package Package;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

public class Library {
    /**
     * součet dvou čísel
     *
     * @param a číslo
     * @param b číslo
     * @return součet
     */
    public static int summary(int a, int b) {
        return a + b;

    }

    /**
     * odčítání
     *
     * @param a číslo
     * @param b číslo
     * @return rozdíl těchto čísel
     */
    public static int different(int a, int b) {
        return a - b;

    }

    /**
     * dělení
     *
     * @param a číslo
     * @param b číslo
     * @return vrátí podíl dvou techto čísel
     */
    public static double divide(double a, double b) {
        return a / b;

    }

    /**
     * násobení
     *
     * @param a číslo
     * @param b číslo
     * @return vynásobý číslo
     */
    public static int multiplication(int a, int b) {
        return a * b;

    }

    /**
     * Obvod čísla
     *
     * @param a strana čtverce
     * @return ovod čtverce
     */
    public static int obvodctverce(int a) {
        return 4 * a;

    }

    /**
     * obsah čtverce
     *
     * @param a strana čtverce
     * @return obsah čtverce
     */
    public static int obsahctverce(int a) {
        return a * a;

    }

    /**
     * Obvod obdelníka
     *
     * @param a strana obdelníka
     * @param b druhá strana obdelníka
     * @return obvod obdelníka
     */
    public static int obvodobdelníku(int a, int b) {
        return 2 * (a + b);

    }

    /**
     * obsah obdelníka
     *
     * @param a strana obdelníka
     * @param b druhá strana obdelníka
     * @return obsah obdelníka
     */
    public static int obsahobdelníku(int a, int b) {
        return a * b;

    }

    /**
     * mocnina daného čísla
     *
     * @param a číslo
     * @return mocnina zadaného čísla
     */
    public static int PowerOnSc(int a) {
        return (a * a);

    }

    /**
     *
     * objem krychle
     *
     * @param a strana
     * @return vypočet objemu krychle
     */
    public static int objemKrychle(int a) {
        return (a * a * a);
    }

    /**
     *
     * povrch krychle
     *
     * @param a strana
     * @return vypočet povrch krychle
     */
    public static int povrchKrychle(int a) {
        return 6 * (a * a);
    }

    /**
     * povrch kvadru
     *
     * @param a strana b strana c strana
     * @return vypočet povrchu kvadru
     */
    public static int povrchKvadru(int a, int b, int c) {
        return 2 * ((a * b) + (a * c) + (b * c));
    }

    /**
     * objem kvadru
     *
     * @param a strana, b strana, c strana
     * @return vypočet objemu  kvadru
     */
    public static int objemKvadru(int a, int b, int c) {
        return a * b * c;
    }
    /**
     * obvod kruhu
     *
     * @param r polomer
     * @return obvod kruhu
     */
    public static double obvodKruhu(int r){
        double pí =3.14;

        return 2*pí*r;
    }
    /**
     * obsah kruhu
     *
     * @param r polomer
     * @return obsah kruhu
     */
    public static double obsahKruhu(int r){
        double pí =3.14;

        return pí*(r*r);
    }
    /**
     * soucet cisel v poli
     *
     * @param a cisla
     * @return soucet cisel
     */
    public static int summaryOfArray(int a[]){
      int b =0;
        for (int i = 0;i<a.length;i++){
            b=b+a[i];

        }
        return b;
    }
    /**
     * zjisteni zbytku
     *
     * @param a cislo
     * @return jestli ma cislo zbytek po vydelení 2
     */
    public static int modulo(int a ){
        return a%2;
    }
    /**
     * zda je číslo liché
     *
     * @param a cislo
     * @return ano čí ne je číslo liché
     */
    public  static void odd(int a ){

        if(a%2==1){
            System.out.println("číslo je liché");

        }else{

            System.out.println("číslo není liché");
        }
    }
    /**
     * zda je číslo sudé
     *
     * @param a cislo
     * @return ano čí ne je číslo sudé
     */
    public  static void even(int a ){

        if(a%2==0){
            System.out.println("číslo je sudé");

        }else{
            System.out.println("číslo není sudé");

        }
    }
    /**
     * prumer čísel
     *
     * @param a pole
     * @return prumer cisel v poli
     */
    public static double average(int a[]){
        double b =0;
        double c = 0;
        double d = 0;
        for (int i = 0;i<a.length;i++){
            b=b+a[i];
            c=c+1;

        }
        d=b/c;
        return d;

    }
    /**
     * max cislo
     *
     * @param a cislo b cislo c cislo
     * @return nalezne max cislo
     */
    public static void maxcisla(int a,int b, int c){
        if(a>b&&a>c){
            System.out.println(a + " je nejvetsi cislo");
        }else if(b>a&&b>c){
            System.out.println(b + " je nejvetsi cislo");
        }else{
            System.out.println(c + " je nejvetsi cislo");
        }


    }
    /**
     * min cislo
     *
     * @param a cislo b cislo c cislo
     * @return nalezne min cislo
     */
    public static void mincisla(int a,int b, int c){
        if(a<b&&a<c){
            System.out.println(a + " je nejmensi cislo");
        }else if(b<a&&b<c){
            System.out.println(b + " je nejmensi cislo");
        }else{
            System.out.println(c + " je nejmensi cislo");
        }


    }
    /**
     * faktorial daneho cisla
     *
     * @param number cislo
     * @return udela faktorial císla
     */
    public static int factorial(int number){
       int d =1;
        for(int i = number;i>1;i--){
            d = d *i;

        }

        return d;


    }
    /**
     * nalezení nejvetsiho delitele
     *
     * @param a cislo b cislo
     * @return nalezne nejvetsiho delitele
     */
    public static int gcd(int a, int b) {
        int c;
        while (b != 0) {
            c = b;
            b = a % b;
            a = c;
        }
        return a;
    }
    /**
     * Objem koule
     *
     * @param r polomer
     * @return vypočet objemu koule
     */
    public static double objemKoule(int r ){
        double pí = 3.14;
        return 4*pí*(r*r);
    }



}

