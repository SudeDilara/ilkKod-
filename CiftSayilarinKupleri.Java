public class CiftSayilarinKupleri {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) { // Çift sayıları 1'den 20'ye kadar kontrol ediyoruz
            if (i % 2 == 0) {
                toplam += (i * i * i); // Çift sayının küpünü toplama ekliyoruz
            }
        }

        System.out.println("1'den 20'ye kadar olan çift sayıların küplerinin toplamı: " + toplam);

    }

}