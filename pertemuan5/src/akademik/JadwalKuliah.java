package akademik;

public class JadwalKuliah {
    private String hari;
    private String waktuMulai;
    private String waktuSelesai;
    private Ruangan ruangan;
    private Dosen dosen;
    private MataKuliah mataKuliah;

    public JadwalKuliah(String hari, String waktuMulai, String waktuSelesai, Ruangan ruangan, Dosen dosen, MataKuliah mataKuliah) {
        this.hari = hari;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
        this.ruangan = ruangan;
        this.dosen = dosen;
        this.mataKuliah = mataKuliah;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getWaktuMulai() {
        return waktuMulai;
    }

    public void setWaktuMulai(String waktuMulai) {
        this.waktuMulai = waktuMulai;
    }

    public String getWaktuSelesai() {
        return waktuSelesai;
    }

    public void setWaktuSelesai(String waktuSelesai) {
        this.waktuSelesai = waktuSelesai;
    }

    public Ruangan getRuangan() {
        return ruangan;
    }

    public void setRuangan(Ruangan ruangan) {
        this.ruangan = ruangan;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public String toString() {
        return "JadwalKuliah{" +
                "hari='" + hari + '\'' +
                ", waktu=" + waktuMulai + " - " + waktuSelesai +
                ", mataKuliah=" + mataKuliah.getNamaMK() +
                ", ruangan=" + ruangan.getKodeRuangan() +
                ", dosen=" + dosen.getNama() +
                '}';
    }
}