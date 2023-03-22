import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int aboneAdedi = 2;
        Sayac[] sayac = new Sayac[aboneAdedi];
        AboneBilgileri[] abone = new AboneBilgileri[aboneAdedi];

        for(int i=0; i<aboneAdedi; i++){
            sayac[i] = new Sayac();
            abone[i] = new AboneBilgileri();
        }

        for(int i=0;i<aboneAdedi;i++){
            System.out.println("Sayac Numarasini giriniz : ");
            sayac[i].setSayacNo(inp.nextInt());
            inp.nextLine();
            System.out.println("TC kimlik numarasi giriniz : ");
            abone[i].setTC(inp.nextLine());
            System.out.println("Abone ad giriniz : ");
            abone[i].setAd(inp.nextLine());
            System.out.println("Abone soyad giriniz : ");
            abone[i].setSoyad(inp.nextLine());
            System.out.println("Abone adres giriniz : ");
            abone[i].setAdres(inp.nextLine());
            System.out.println("Abone telefon numarasi giriniz : ");
            abone[i].setTelNo(inp.nextLine());
            System.out.println("Tuketilen elektrigi giriniz : ");
            sayac[i].setTuketilenElektrik(inp.nextDouble());
            sayac[i].setAbone(abone[i]);
            System.out.println((i+1) + ".Abone kaydedildi !\n");
        }

        Sayac.tuketimHesapla(sayac,aboneAdedi);
        Sayac.yazdir(sayac,aboneAdedi);

        System.out.println("Sayac numarasi giriniz :");
        int arananSayacNo = inp.nextInt();
        Sayac.ara(sayac,aboneAdedi,arananSayacNo);

    }
}
