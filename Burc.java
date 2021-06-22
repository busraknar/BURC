import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gun, ay;
        System.out.print("Doğum Tarihinizin Gün Değerini giriniz = ");
        gun=input.nextInt();

        System.out.print("Doğum Tarihiniz kaçıncı ayda? = ");
        ay=input.nextInt();//sistem girilen ay değerini küçük harfler ile algılamaktadır.Hata denetimi

        //Eğer aylerdan ocak ve günlerden 21 ve büyüğü ise yada aylardan şubat ve günlerden 19 ve küçüğü ise
        if((gun>=21 && ay==1) || (gun<=19 && ay==2))
            System.out.println("Burcunuz = Kova");//Burç koca demektir. Diğer if yapılarıda aynı mantıkta
        else if((gun>=20 && ay==2) || (gun<=20 && ay==3))
            System.out.println("Burcunuz = Balık");
        else if((gun>=21 && ay==3) || (gun<=20 && ay==4))
            System.out.println("Burcunuz = Koç");
        else if((gun>=21 && ay==4) || (gun<=20 && ay==5))
            System.out.println("Burcunuz = Boğa");
        else if((gun>=21 && ay==5) || (gun<=21 && ay==6))
            System.out.println("Burcunuz = İkizler");
        else if((gun>=22 && ay==6) || (gun<=23 && ay==7))
            System.out.println("Burcunuz = Yengeç");
        else if((gun>=24 && ay==7) || (gun<=23 && ay==8))
            System.out.println("Burcunuz = Aslan");
        else if((gun>=24 && ay==8) || (gun<=23 && ay==9))
            System.out.println("Burcunuz = Başak");
        else if((gun>=24 && ay==9) || (gun<=23 && ay==10))
            System.out.println("Burcunuz = Terazi");
        else if((gun>=24 && ay==10) || (gun<=22 && ay==11))
            System.out.println("Burcunuz = Akrep");
        else if((gun>=23 && ay==11) || (gun<=21 && ay==12))
            System.out.println("Burcunuz = Yay");
        else if((gun>=22 && ay==12) || (gun<=20 && ay==1))
            System.out.println("Burcunuz = Oğlak");
        else
            System.out.println("Yanlış bir değer girdiniz");


    }
    }

