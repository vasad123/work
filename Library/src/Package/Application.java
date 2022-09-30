package Package;
import Package.Library;
import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Application {
    public static void main(String[] args) {
        System.out.println(Library.summary(23,6 ));
        System.out.println(Library.different(5,8));
        System.out.println(Library.divide(8,5));
        System.out.println(Library.multiplication(8,5));
        System.out.println(Library.obvodctverce(8));
        System.out.println(Library.obsahctverce(8));
        System.out.println(Library.obvodobdelníku(9,8));
        System.out.println(Library.obsahobdelníku(8,6));
        System.out.println(Library.PowerOnSc(5));
        System.out.println(Library.povrchKrychle(5));
        System.out.println(Library.objemKrychle(5));
        System.out.println(Library.objemKvadru(4,5,8));
        System.out.println(Library.povrchKvadru(5,4,7));
        System.out.println(Library.obvodKruhu(5));
        System.out.println(Library.obsahKruhu(15));
        int [] arr = {1,23,5,5};
        System.out.println(Library.summaryOfArray(arr));
        System.out.println(Library.modulo(5));
        Library.odd(6);
        Library.even(6);
        int []arrAverage = {5,7,8,4,5,9,6};
        System.out.println(Library.average(arrAverage));
       Library.maxcisla(8,7,5);
        Library.mincisla(7,3,9);
        System.out.println(Library.factorial(5));
        System.out.println(Library.gcd(20,180));
        System.out.println(Library.objemKoule(5));
    };
}
