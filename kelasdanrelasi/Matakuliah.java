package kelasdanrelasi;

public class Matakuliah {
    private String kode;
    private String nama;
    private String indexNilai;
    private int sks;

    public Matakuliah(String kode, String nama, String indexNilai, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.indexNilai = indexNilai;
        this.sks = sks;
    }

    public String display() {
        return kode + " - " + nama + " - " + indexNilai + " - " + sks;
    }

    public String getIndexNilai() {
        return indexNilai;
    }

    public int getSks() {
        return sks;
    }
}


