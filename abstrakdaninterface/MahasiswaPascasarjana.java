package abstrakdaninterface;

public class MahasiswaPascasarjana extends Mahasiswa implements Peneliti {

    public MahasiswaPascasarjana(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void belajar() {
        System.out.println("Mahasiswa Pascasarjana " + nama + " sedang belajar mata kuliah lanjutan.");
    }

    @Override
    public void melakukanPenelitian(String judul) {
        System.out.println("Mahasiswa Pascasarjana " + nama + " sedang melakukan penelitian dengan judul: " + judul);
    }
}
