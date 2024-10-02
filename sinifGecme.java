import java.util.Scanner;

/*Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. */

public class sinifGecme {
    public static void main(String[] args) {

        int mat, türkce, tarih, kimya, cografya;
        int sayi = 0;
        int toplam = 0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz:");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            sayi++;
        }

        System.out.println("Türkce Notunuzu Giriniz:");
        türkce = input.nextInt();

        if (türkce >= 0 && türkce <= 100) {
            toplam += türkce;
            sayi++;
        }

        System.out.println("Tarih Notunuzu Giriniz:");
        tarih = input.nextInt();
        if (tarih >= 0 && tarih <= 100) {
            toplam += türkce;
            sayi++;
        }

        System.out.println("Kimya Notunuzu Giriniz:");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            sayi++;
        }

        System.out.println("Coğrafya Notunuzu Giriniz:");
        cografya = input.nextInt();
        if (cografya >= 0 && cografya <= 100) {
            toplam += cografya;
            sayi++;
        }

        if (sayi > 0) {
            average = toplam / sayi; // Ortalamayı hesapla
            System.out.println("Not Ortalamaniz: " + average);
            if (average < 45) {
                System.out.println("Sinifta Kaldiniz Daha Cok Calismalisiniz !!!");
            } 
            else if(average > 85) {
                System.out.println("Mükemmel Note Tebrikler !");
            }
            else {
                System.out.println("Sinifi Gectiniz Tebrikler :)");
            }

        }

        else {
            System.out.println("Geçerli not yok.");
        }

    }
}
