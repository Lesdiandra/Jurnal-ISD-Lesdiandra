public class Buku{
    private String judulBuku;
    private String penulis;
    private String tahunTerbit;
    public Buku(String judulBuku, String penulis, Integer tahunTerbit) {
    this.judulBuku = judulBuku;
    this.penulis = penulis;
    this.tahunTerbit = m ;
    }
    public String getNim() {
    return judulBuku;
    }
    @Override
    public String toString() {
    return "Judul Buku ='" + judulBuku + '\'' +
    ", Penulis ='" + penulis + '\'' +
    ", Tahun Terbit ='" + tahunTerbit + '\''
    ;
    }
   }
   