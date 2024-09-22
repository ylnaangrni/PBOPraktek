package akademik;

import java.util.ArrayList;
import java.util.List;

public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private int sks;
    private List<JadwalKuliah> daftarJadwalKuliah;

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.daftarJadwalKuliah = new ArrayList<>();
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public List<JadwalKuliah> getDaftarJadwalKuliah() {
        return daftarJadwalKuliah;
    }

    public void setDaftarJadwalKuliah(List<JadwalKuliah> daftarJadwalKuliah) {
        this.daftarJadwalKuliah = daftarJadwalKuliah;
    }

    public void tambahJadwalKuliah(JadwalKuliah jadwalKuliah) {
        daftarJadwalKuliah.add(jadwalKuliah);
    }
}

