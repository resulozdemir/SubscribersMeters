public class AboneBilgileri {
    private String TC;
    private String ad;
    private String soyad;
    private String adres;
    private String telNo;
    private double borc;

    public AboneBilgileri(String TC, String ad, String soyad, String adres, String telNo, int borc) {
        this.TC = TC;
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.telNo = telNo;
        this.borc = borc;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public double getBorc() {
        return borc;
    }

    public void setBorc(double borc) {
        this.borc = borc;
    }
}
