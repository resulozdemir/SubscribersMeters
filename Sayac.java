public class Sayac {
    private int sayacNo;
    private boolean kullanim;
    private double tuketilenElektrik;
    private boolean tuketimVarMi;
    private AboneBilgileri abone;

    public Sayac(int sayacNo, boolean kullanim, double tuketilenElektrik, boolean tuketimVarMi, AboneBilgileri abone) {
        this.sayacNo = sayacNo;
        this.kullanim = kullanim;
        this.tuketilenElektrik = tuketilenElektrik;
        this.tuketimVarMi = tuketimVarMi;
        this.abone = abone;
    }

    public int getSayacNo() {
        return sayacNo;
    }

    public void setSayacNo(int sayacNo) {
        this.sayacNo = sayacNo;
    }

    public boolean isKullanim() {
        return kullanim;
    }

    public void setKullanim(boolean kullanim) {
        this.kullanim = kullanim;
    }

    public double getTuketilenElektrik() {
        return tuketilenElektrik;
    }

    public void setTuketilenElektrik(double tuketilenElektrik) {
        this.tuketilenElektrik = tuketilenElektrik;
    }

    public boolean isTuketimVarMi() {
        return tuketimVarMi;
    }

    public void setTuketimVarMi(boolean tuketimVarMi) {
        this.tuketimVarMi = tuketimVarMi;
    }

    public AboneBilgileri getAbone() {
        return abone;
    }

    public void setAbone(AboneBilgileri abone) {
        this.abone = abone;
    }

    public static void sirala(Sayac[] sayac){
        for (int i=0;i<sayac.length-1;i++){
            int index = i;
            for(int j= i+1; j<sayac.length;j++){
                if(sayac[j].getTuketilenElektrik() > sayac[i].getTuketilenElektrik()){
                    index = j;
                }
            }
            if (index != i){
                Sayac gecici = sayac[i];
                sayac[i] = sayac[index];
                sayac[index] = gecici;
            }
        }
    }

    public static void tuketimHesapla(Sayac[] sayac){
        for(int i=0;i<sayac.length;i++){
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

    public static void yazdir(Sayac[] sayac){
        for(int i=0;i< sayac.length;i++){
            System.out.println("Sayac Numarasi : \t" + sayac[i].getSayacNo());
            System.out.println("Abone adi : \t" + sayac[i].getAbone().getAd());
            System.out.println("Elektrik tuketimi : \t" + sayac[i].getTuketilenElektrik());
            System.out.println("Fatura tutari : \t" + sayac[i].getAbone().getBorc());
        }
    }
}
