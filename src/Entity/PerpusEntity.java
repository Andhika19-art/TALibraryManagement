package entity;

public abstract class PerpusEntity{
    private String judul,pengarang;
    private int kode,tahunTerbit;

    public PerpusEntity(String judul, String pengarang, int kode, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.kode = kode;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
}
