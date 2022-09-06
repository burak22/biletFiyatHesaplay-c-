import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM Türünden Giriniz: ");
        int distance = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int age = input.nextInt();

        System.out.print("Seçiniz: 1-) Tek yön 2-) Gidiş-Dönüş: ");
        int flightType = input.nextInt();

        if(distance <=0 || age < 0){
            System.out.println("Hatalı Giriş yaptınız!");
        }

        float discountAge = 0;
        float roundFlightDiscount = 0.2f;

        if(age<12){
            discountAge=0.5f;
        }
        else if(age<24){
            discountAge = 0.1f;
        }
        else if (age > 65){
            discountAge = 0.3f;
        }
        float basePrice = distance *0.1f;
        float price = basePrice - basePrice * discountAge;
        switch(flightType){
            case 1: 
                break;
            case 2:
                price -= price*roundFlightDiscount;
                price *= 2;
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız.");
                System.exit(0);
        }
        System.out.println("Bilet fiyatı: " + price);

    }
}