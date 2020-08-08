import java.util.Arrays;
import java.util.List;

public class BridgeDemo {
    public static void main(String[] args) {

        List<Buku> bukus = Arrays.asList(
                new InstalLinux(),
                new Kamus(),
                new RakitPc(),
                new Toefl()
        );

        bukus.forEach(buku -> {
            if (buku instanceof BukuBahasa){
                BukuBahasa bukuBahasa = (BukuBahasa) buku;
                System.out.println(bukuBahasa.getNama()+" Ini Buku Bahasa ");
            }else if(buku instanceof BukuKomputer){
                BukuKomputer bukuKomputer = (BukuKomputer) buku;
                System.out.println(bukuKomputer.getNama()+" Ini Buku Komputer"+
                        "dengan Jumlah Halaman "+bukuKomputer.getPenerbit());
            }
        });
    }
}
