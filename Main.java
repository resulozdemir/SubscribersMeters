import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Sayac[] sayac = new Sayac[100];
        AboneBilgileri[] abone = new AboneBilgileri[100];

        for(int i=0;i<100;i++){
            System.out.println("Sayac Numarasini giriniz : ");
            sayac[i].setSayacNo(inp.nextInt());
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
        }

        sayac[10].getAbone().setTC("11111111111");
        sayac[10].getAbone().setAd("Resul");
        sayac[10].getAbone().setSoyad("Ozdemir");
        sayac[10].getAbone().setAdres("istanbul");
        sayac[10].getAbone().setTelNo("553 113 2552");
        sayac[10].getAbone().setBorc(150);

        Sayac.sirala(sayac);
        Sayac.sirala(sayac);
        Sayac.yazdir(sayac);

        System.out.println("Sayac numarasi giriniz :");
        int arananSayacNo = inp.nextInt();
        for(int i = 0;i< sayac.length ;i++){
            if(sayac[i].getSayacNo() == arananSayacNo){
                System.out.println("Elektrik tukitimi : " + sayac[i].getTuketilenElektrik());
                System.out.println("Abone TC : " + sayac[i].getAbone().getTC());
                System.out.println("Abone ad : " + sayac[i].getAbone().getAd());
                System.out.println("Abone soyad : " + sayac[i].getAbone().getSoyad());
                System.out.println("Abone adres : " + sayac[i].getAbone().getAdres());
                System.out.println("Abone telefon numarasi : " + sayac[i].getAbone().getTelNo());
                System.out.println("Abone borc : " + sayac[i].getAbone().getBorc());
            }
        }
    }
}
