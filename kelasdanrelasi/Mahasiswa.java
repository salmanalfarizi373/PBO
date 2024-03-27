package kelasdanrelasi;

public class Mahasiswa {
    private String NRP;
    private String nama;

    public Mahasiswa(String NRP, String nama) {
        this.NRP = NRP;
        this.nama = nama;
    }

    public String display() {
        return "NRP: " + NRP + ", Nama: " + nama;
    }

    public String getNRP() {
        return NRP;
    }
}



