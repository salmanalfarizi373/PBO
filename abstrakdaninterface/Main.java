package abstrakdaninterface;

public class Main {
    public static void main(String[] args) {
        MahasiswaSarjana mahasiswaS1 = new MahasiswaSarjana("Asep", "666666");
        MahasiswaPascasarjana mahasiswaS2 = new MahasiswaPascasarjana("Winter", "696969");

        System.out.println("==Mahasiswa Sarjana==");
        System.out.println("Nama: " + mahasiswaS1.getNama());
        System.out.println("NIM: " + mahasiswaS1.getNim());
        mahasiswaS1.belajar();

        System.out.println("==Mahasiswa Pascasarjana==");
        System.out.println("Nama: " + mahasiswaS2.getNama());
        System.out.println("NIM: " + mahasiswaS2.getNim());
        mahasiswaS2.belajar();
        mahasiswaS2.melakukanPenelitian("Analisis Data Big Data");
    }
}
