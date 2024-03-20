package TokoMakeUp;

public class ProdukMakeUp {
    private String namaProduk;
    private double harga;

    public ProdukMakeUp(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Getter untuk nama produk
    public String getNamaProduk() {
        return namaProduk;
    }

    // Setter untuk nama produk
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    // Getter untuk harga
    public double getHarga() {
        return harga;
    }

    // Setter untuk harga
    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Nama Produk: " + namaProduk + ", Harga: " + harga;
    }
}
