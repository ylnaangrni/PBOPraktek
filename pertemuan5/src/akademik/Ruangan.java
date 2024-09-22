package akademik;

public class Ruangan {
    private String kodeRuangan;
    private int kapasitas;

    public Ruangan(String kodeRuangan, int kapasitas) {
        this.kodeRuangan = kodeRuangan;
        this.kapasitas = kapasitas;
    }

    public String getKodeRuangan() {
        return kodeRuangan;
    }

    public void setKodeRuangan(String kodeRuangan) {
        this.kodeRuangan = kodeRuangan;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
}

