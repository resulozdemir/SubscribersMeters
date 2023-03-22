public class Sayac {
    private int sayacNo;
    private double tuketilenElektrik;
    private AboneBilgileri abone;

    public Sayac() {}

    public int getSayacNo() {
        return sayacNo;
    }

    public void setSayacNo(int sayacNo) {
        this.sayacNo = sayacNo;
    }

    public double getTuketilenElektrik() {
        return tuketilenElektrik;
    }

    public void setTuketilenElektrik(double tuketilenElektrik) {
        this.tuketilenElektrik = tuketilenElektrik;
    }

    public AboneBilgileri getAbone() {
        return abone;
    }

    public void setAbone(AboneBilgileri abone) {
        this.abone = abone;
    }


    public static void tuketimHesapla(Sayac[] sayac,int aboneAdedi){
        for(int i=0;i< aboneAdedi ;i++){
            if(sayac[i].getTuketilenElektrik() > 100){
                double ekstraKullanim = sayac[i].getTuketilenElektrik() - 100;
                double ekstraKullanimFiyat = ekstraKullanim * 3 ;
                double normalKullanimFiyat = (sayac[i].getTuketilenElektrik() - ekstraKullanimFiyat) * 2;
                sayac[i].getAbone().setBorc(normalKullanimFiyat + ekstraKullanimFiyat);
            }
            else if (sayac[i].getTuketilenElektrik() >0 && sayac[i].getTuketilenElektrik() < 100) {
                sayac[i].getAbone().setBorc(sayac[i].getTuketilenElektrik() * 2);
            }
        }
    }

    public static void yazdir(Sayac[] sayac,int aboneAdedi){
        for(int i=0;i< aboneAdedi ;i++){
            System.out.println("Sayac Numarasi : " + sayac[i].getSayacNo());
            System.out.println("Abone adi : " + sayac[i].getAbone().getAd());
            System.out.println("Elektrik tuketimi : " + sayac[i].getTuketilenElektrik());
            System.out.println("Fatura tutari : " + sayac[i].getAbone().getBorc());
        }
    }

    public static void ara(Sayac[] sayac,int aboneAdedi,int arananSayacNo){
        for(int i = 0;i< aboneAdedi;i++){
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
