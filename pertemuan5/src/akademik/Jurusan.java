package akademik;


import java.util.ArrayList;
import java.util.List;

public class Jurusan {
    private String kodeJurusan;
    private String namaJurusan;
    private List<ProgramStudi> daftarProdi;

    public Jurusan(String kodeJurusan, String namaJurusan) {
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
        this.daftarProdi = new ArrayList<>();
    }

    public String getKodeJurusan() {
        return kodeJurusan;
    }

    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public List<ProgramStudi> getDaftarProdi() {
        return daftarProdi;
    }

    public void setDaftarProdi(List<ProgramStudi> daftarProdi) {
        this.daftarProdi = daftarProdi;
    }

    public void tambahProdi(ProgramStudi prodi) {
        daftarProdi.add(prodi);
    }
}

