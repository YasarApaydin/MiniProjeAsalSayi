import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        number = scan.nextInt();
        int remember = number % 2;
        boolean isPrime = true;
        if (number == 1) {
            System.out.println(number + " Sayısı asal değildir.");
            return;
        }
        if (number < 1) {
            System.out.println(number + " Gecersiz Sayı Giridniz.");
            return;
        }


        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }

        }
        if (isPrime) {
            System.out.println(number + " Sayısı asaldır");
        } else {
            System.out.println(number + " Sayısı asal değildir.");
        }






   /*     if(number==2 || number==3){
            System.out.println(number+" Sayısı Asaldır");

        }
 for(int k=sayi;k>=2;k--){

   remember = number % k;
     if(remember==0){
         System.out.println(number+" Sayısı Asal Değildir.");
         break;
     }else {

         System.out.println(number+" Sayısı Asaldır");
         break;

     }
 }


*/


    }
}