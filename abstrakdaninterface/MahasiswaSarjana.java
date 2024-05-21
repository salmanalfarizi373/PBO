package abstrakdaninterface;

public class MahasiswaSarjana extends Mahasiswa {

    public MahasiswaSarjana(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void belajar() {
        System.out.println("Mahasiswa Sarjana " + nama + " sedang belajar mata kuliah dasar.");
    }
}

