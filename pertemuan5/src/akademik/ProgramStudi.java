package akademik;

import java.util.ArrayList;
import java.util.List;

public class ProgramStudi {
        private String kodeProdi;
        private String namaProdi;
        private List<MataKuliah> daftarMataKuliah;
    
        public ProgramStudi(String kodeProdi, String namaProdi) {
            this.kodeProdi = kodeProdi;
            this.namaProdi = namaProdi;
            this.daftarMataKuliah = new ArrayList<>();
        }
    
        public String getKodeProdi() {
            return kodeProdi;
        }
    
        public void setKodeProdi(String kodeProdi) {
            this.kodeProdi = kodeProdi;
        }
    
        public String getNamaProdi() {
            return namaProdi;
        }
    
        public void setNamaProdi(String namaProdi) {
            this.namaProdi = namaProdi;
        }
    
        public List<MataKuliah> getDaftarMataKuliah() {
            return daftarMataKuliah;
        }
    
        public void setDaftarMataKuliah(List<MataKuliah> daftarMataKuliah) {
            this.daftarMataKuliah = daftarMataKuliah;
        }
    
        public void tambahMataKuliah(MataKuliah mataKuliah) {
            daftarMataKuliah.add(mataKuliah);
        }
        
}
