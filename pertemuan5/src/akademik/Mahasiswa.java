package akademik;

public class Mahasiswa extends Person {
    private String nim;
    private int semester;
    private Jurusan jurusan;
    private ProgramStudi programStudi;

    public Mahasiswa(String nama, String alamat, String noTelp, String nim, int semester, Jurusan jurusan, ProgramStudi programStudi){
        super(nama, alamat, noTelp);
        this.nim = nim;
        this.semester = semester;
        this.jurusan = jurusan;
        this.programStudi = programStudi;
    }

    public String getNim(){
        return nim;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public int getSemester(){
        return semester;
    }

    public void setSemester(int semester){
        this.semester = semester;
    }

    public Jurusan getJurusan(){
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan){
        this.jurusan = jurusan;
    }

    public ProgramStudi getProgramStudi(){
        return programStudi;
    }

    public void setProgramStudi(ProgramStudi programStudi){
        this.programStudi = programStudi;
    }


    public String toString() {
        return "Mahasiswa{" +
                "nama='" + getNama() + '\'' +
                ", nim='" + nim + '\'' +
                ", semester=" + semester +
                ", jurusan=" + jurusan.getNamaJurusan() +
                ", programStudi=" + programStudi.getNamaProdi() +
                '}';
    }
}
