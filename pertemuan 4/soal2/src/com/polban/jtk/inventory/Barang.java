package com.polban.jtk.inventory;

public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public void tambahStok(int tambahan) {
        if (tambahan > 0) {
            stok += tambahan;
        }
    }

    public int getStok() {
        return stok;
    }

    public String getNamaBarang() {
        return nama_barang;
    }
}
