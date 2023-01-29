import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360

         */


        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;

        /*System.out.println("Hesaplamak istediğiniz dairenin yarıçapını giriniz.");
        double yaricap = scanner.nextDouble();

        double alan = 3.14 * (yaricap * yaricap);

        double cevre = 2 * 3.14 * yaricap;

        System.out.println("Dairenin çeveresi : " + cevre;
        System.out.println("Dairenin alanı : " + alan);

        */

        System.out.println("Hesaplamak istediğiniz dairenin yarıçapını giriniz : ");
        double yaricap = scanner.nextDouble();

        System.out.println("Hesaplamak istediğiniz dairenin merkez açısı ölçüsünü giriniz : ");
        int aci = scanner.nextInt();

        double alan = (3.14 * (yaricap*yaricap)* aci);

        System.out.println("Dairein alanı : " + alan);
    }
}
