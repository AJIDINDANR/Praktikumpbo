package TokoMakeUp;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemPendataanProdukMakeUpDiTokoSubasic {
    public static void main(String[] args) {
        ArrayList<ProdukMakeUp> daftarProduk = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=========================");
            System.out.println("     Menu Toko MakeUp");
            System.out.println("=========================");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Lihat Produk");
            System.out.println("3. Update Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Keluar");
            System.out.println("=========================");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 
            switch (pilihan) {
                case 1:
                    System.out.println("\n=========================");
                    System.out.println("     Tambah Produk");
                    System.out.println("=========================");
                    System.out.print("Masukkan nama produk: ");
                    String nama = scanner.nextLine();
                    double harga = 0;
                    boolean inputHargaValid = false;
                    do {
                        try {
                            System.out.print("Masukkan harga produk: ");
                            harga = scanner.nextDouble();
                            inputHargaValid = true;
                        } catch (Exception e) {
                            System.out.println("Harga harus berupa angka. Silakan coba lagi.");
                            scanner.nextLine(); // Membersihkan buffer
                        }
                    } while (!inputHargaValid);
                    daftarProduk.add(new ProdukMakeUp(nama, harga));
                    System.out.println("Produk berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("\n=========================");
                    System.out.println("     Daftar Produk");
                    System.out.println("=========================");
                    if (daftarProduk.isEmpty()) {
                        System.out.println("Belum ada produk yang tersedia.");
                    } else {
                        System.out.println("No  Nama Produk             Harga");
                        for (int i = 0; i < daftarProduk.size(); i++) {
                            ProdukMakeUp produk = daftarProduk.get(i);
                            System.out.printf("%-4d%-25s%.2f\n", i + 1, produk.getNamaProduk(), produk.getHarga());
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("\n=========================");
                    System.out.println("     Update Produk");
                    System.out.println("=========================");
                    if (daftarProduk.isEmpty()) {
                        System.out.println("Belum ada produk yang tersedia.");
                    } else {
                        System.out.println("Daftar Produk:");
                        for (int i = 0; i < daftarProduk.size(); i++) {
                            ProdukMakeUp produk = daftarProduk.get(i);
                            System.out.println((i + 1) + ". " + produk.getNamaProduk() + " - " + produk.getHarga());
                        }
                        System.out.print("Masukkan indeks produk yang ingin diupdate: ");
                        int indeksUpdate = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan newline di buffer
                        if (indeksUpdate >= 0 && indeksUpdate < daftarProduk.size()) {
                            System.out.print("Masukkan nama produk baru: ");
                            String namaUpdate = scanner.nextLine();
                            double hargaUpdate = 0;
                            boolean inputHargaUpdateValid = false;
                            do {
                                try {
                                    System.out.print("Masukkan harga produk baru: ");
                                    hargaUpdate = scanner.nextDouble();
                                    inputHargaUpdateValid = true;
                                } catch (Exception e) {
                                    System.out.println("Harga harus berupa angka. Silakan coba lagi.");
                                    scanner.nextLine(); // Membersihkan buffer
                                }
                            } while (!inputHargaUpdateValid);
                            ProdukMakeUp produkUpdate = daftarProduk.get(indeksUpdate);
                            produkUpdate.setNamaProduk(namaUpdate);
                            produkUpdate.setHarga(hargaUpdate);
                            System.out.println("Produk berhasil diupdate!");
                        } else {
                            System.out.println("Indeks produk tidak valid!!!");
                        }
                    }
                    break;
                
                case 4:
                    System.out.println("\n=========================");
                    System.out.println("     Hapus Produk");
                    System.out.println("=========================");
                    if (daftarProduk.isEmpty()) {
                        System.out.println("Belum ada produk yang tersedia.");
                    } else {
                        System.out.println("Daftar Produk:");
                        for (int i = 0; i < daftarProduk.size(); i++) {
                            ProdukMakeUp produk = daftarProduk.get(i);
                            System.out.println((i + 1) + ". " + produk.getNamaProduk() + " - " + produk.getHarga());
                        }
                        System.out.print("Masukkan indeks produk yang ingin dihapus: ");
                        int indeksHapus = scanner.nextInt();
                        if (indeksHapus >= 0 && indeksHapus < daftarProduk.size()) {
                            daftarProduk.remove(indeksHapus);
                            System.out.println("Produk berhasil dihapus!");
                        } else {
                            System.out.println("Indeks produk tidak valid!!!");
                        }
                    }
                    break;
                
                case 5:
                    System.out.println("\nTerima kasih telah berkunjung *><*");
                    break;
                default:
                    System.out.println("\nPilihan menu tidak valid. Silakan pilih lagi!!!");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}