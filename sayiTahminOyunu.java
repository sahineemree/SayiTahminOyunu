import java.util.*;

public class sayiTahminOyunu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100);
        System.out.println(number);
        int right = 6;

        System.out.println("Oyuna Hoşgeldiniz !!");
        System.out.println("Gizli sayı 0 ve 100 arasında!!!");
        System.out.println("Başlangıç hakkınız : " + right);
        System.out.println();

        for (int i = 1 ; i <= right ; i++){
            System.out.print("Lütfen tahmininizi giriniz : ");
            int selected = input.nextInt();

            if (selected<0 || selected>100){
                System.out.println("Girdiğin sayı 0 ile 100 arasında olmalıdır.");
                System.out.println("Kalan hakkın : " + (right - i));

            }

            if (right-i == 0){
                System.out.println("Maalesef kalan hakkınız bitti. Tekrar Başlatın !!");
            }

            if (selected == number){
                System.out.println("Tebrikler , doğru tahmin!");
                System.out.println(i + ". tahmininde doğru sonuca ulaştın. ");
                break;
            }
            else if (selected < number){
                System.out.println("Maalesef yanlış tahmin! Tekrar dene !");
                System.out.println("İpucu : Gizli sayıya ulaşmak istiyorsan daha büyük bir sayı girmelisin..");
                System.out.println();
                System.out.println("Kalan hakkın : " + (right - i));
                System.out.println();
            }
            else {
                System.out.println("Maalesef yanlış tahmin! Tekrar dene !");
                System.out.println("İpucu : Gizli sayıya ulaşmak istiyorsan daha küçük bir sayı girmelisin..");
                System.out.println();
                System.out.println("Kalan hakkın : " + (right - i));
                System.out.println();
            }
        }
        System.out.println("Gizli sayı : " + number);
    }
}