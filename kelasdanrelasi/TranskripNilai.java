package kelasdanrelasi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        kartuHasilStudi = new ArrayList<>();
        tglCetak = new Date();
    }
    public double hitungIPK() {
        double totalBobot = 0;
        double totalSKS = 0;

        for (KartuHasilStudi khs : kartuHasilStudi) {
            for (Matakuliah mk : khs.getDaftarMatakuliah()) {
                double bobot = getBobotNilai(mk.getIndexNilai());
                totalBobot += bobot * mk.getSks();
                totalSKS += mk.getSks();
            }
        }
        if (totalSKS != 0) {
            ipk = totalBobot / totalSKS;
        }
        return ipk;
    }
    private double getBobotNilai(String indexNilai) {
        switch (indexNilai) {
            case "A":
                return 4.0;
            case "AB":
                return 3.5;
            case "B":
                return 3.0;
            case "BC":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                return 0.0;
        }
    }
    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }
    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }
}




