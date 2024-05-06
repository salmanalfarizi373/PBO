package inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        // Contoh penggunaan
        Mahasiswa mhs = new Mahasiswa("2230999", "Asep", "Cimahi");
        System.out.println(mhs.getNrp() + "_" + mhs.getNama() + "_" + mhs.getAlamat());
    }
}