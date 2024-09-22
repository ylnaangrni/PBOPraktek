package akademik;

public class Dosen extends Person {
    private String nip;
    private String mataKuliah;

    public Dosen(String nama, String alamat, String noTelp, String nip, String mataKuliah) {
        super(nama, alamat, noTelp);
        this.nip = nip;
        this.mataKuliah = mataKuliah;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public String toString() {
        return "Dosen{" +
                "nama='" + getNama() + '\'' +
                ", nip='" + nip + '\'' +
                ", mataKuliah='" + mataKuliah + '\'' +
                '}';
    }
}
    

