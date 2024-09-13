package com.polban.jtk.inventory;

public class Inventori {
    private Barang[] barangs;

    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    void showBarang() {
        System.out.println(barangs[0].getNamaBarang() + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNamaBarang() + "(" + barangs[1].getStok() + ")");
    }

    void pengadaan() {
        initBarang();
        barangs[0].tambahStok(+4);
        barangs[1].tambahStok(+10);
        barangs[0].tambahStok(-30); // Tidak akan mengurangi stok jika nilai negatif
        // barangs[0].stok *= 30; // Ini tidak bisa dilakukan lagi
        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
