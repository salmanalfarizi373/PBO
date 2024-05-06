package inheritance;

public class Perusahaan {
    protected String namaPerusahaan;
    protected String alamatPerusahaan;

    public Perusahaan(String namaPerusahaan, String alamatPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public String getAlamatPerusahaan() {
        return alamatPerusahaan;
    }
}

