package inheritance;

public class Karyawan extends Perusahaan {
    private String namaKaryawan;
    private int umur;
    private double gaji;

    public Karyawan(String namaKaryawan, int umur, double gaji, String namaPerusahaan, String alamatPerusahaan) {
        super(namaPerusahaan, alamatPerusahaan);
        this.namaKaryawan = namaKaryawan;
        this.umur = umur;
        this.gaji = gaji;
    }
    public String getNamaKaryawan() {
        return namaKaryawan;
    }
    public int getUmur() {
        return umur;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public void displayInfo() {
        System.out.println("Perusahaan: " + getNamaPerusahaan() + " - " + getAlamatPerusahaan());
        System.out.println("Karyawan: " + namaKaryawan);
        System.out.println("Umur: " + umur);
        System.out.println("Gaji: " + gaji);
    }
}
