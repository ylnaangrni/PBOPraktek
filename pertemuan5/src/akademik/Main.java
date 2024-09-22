package akademik;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi data
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        List<Dosen> daftarDosen = new ArrayList<>();
        List<MataKuliah> daftarMataKuliah = new ArrayList<>();
        List<Ruangan> daftarRuangan = new ArrayList<>();
        List<JadwalKuliah> daftarJadwalKuliah = new ArrayList<>();

        // Buat jurusan dan program studi
        Jurusan jurusanTeknikInrfomatika = new Jurusan("15", "Teknik Informatika");
        ProgramStudi prodiD3TeknikInrfomatika = new ProgramStudi("11", "D3 Teknik Informatika");
        ProgramStudi prodiD4TeknikInrfomatika = new ProgramStudi("24", "D4 Teknik Informatika");
        
        jurusanTeknikInrfomatika.tambahProdi(prodiD3TeknikInrfomatika);
        jurusanTeknikInrfomatika.tambahProdi(prodiD4TeknikInrfomatika);

        // Tambahkan data mahasiswa
        daftarMahasiswa.add(new Mahasiswa("Agra Anisa Ibtisamah", "Bandung", "081234567890", "231511067", 3, jurusanTeknikInrfomatika, prodiD3TeknikInrfomatika));
        daftarMahasiswa.add(new Mahasiswa("Elsa Monika Sinaga", "Bandung", "088743739623", "231511074", 3, jurusanTeknikInrfomatika, prodiD3TeknikInrfomatika));
        daftarMahasiswa.add(new Mahasiswa("Syahla Salsabila", "Cimahi", "089884678354", "231511095", 3, jurusanTeknikInrfomatika, prodiD3TeknikInrfomatika));
        daftarMahasiswa.add(new Mahasiswa("Yulina Anggraeni", "Tegal", "081984627739", "231511096", 3, jurusanTeknikInrfomatika, prodiD3TeknikInrfomatika));
        daftarMahasiswa.add(new Mahasiswa("Aulia Putri Ramadhani", "Garut", "087689430838", "231511070", 3, jurusanTeknikInrfomatika, prodiD3TeknikInrfomatika));
        daftarMahasiswa.add(new Mahasiswa("Muhammad Daffa Tridya Atha", "Cimahi", "0883657809745", "231511082", 3, jurusanTeknikInrfomatika, prodiD3TeknikInrfomatika));
        daftarMahasiswa.add(new Mahasiswa("Melly Dwiliani", "Cimahi", "081237937432", "231511080", 3, jurusanTeknikInrfomatika, prodiD3TeknikInrfomatika));
        daftarMahasiswa.add(new Mahasiswa("Isyana Putri Indriana", "Cirebon", "088934562354", "231511078", 3, jurusanTeknikInrfomatika, prodiD3TeknikInrfomatika));
        daftarMahasiswa.add(new Mahasiswa("Jihan Humaira", "Bandung", "087325462729", "231511079", 3, jurusanTeknikInrfomatika, prodiD3TeknikInrfomatika));
        daftarMahasiswa.add(new Mahasiswa("Sifa Wafiqna", "Tasikmalaya", "081832764923", "231511092", 3, jurusanTeknikInrfomatika, prodiD3TeknikInrfomatika));


        // Tambahkan data dosen
        daftarDosen.add(new Dosen("Yudi Widhiyasana", "Bandung", "081234567800", "KO013N", "Komputer Grafik TE"));
        daftarDosen.add(new Dosen("Trisna Gelar A", "Bandung", "083573849998", "KO078N", "Komputer Grafik PR, Proyek 3"));
        daftarDosen.add(new Dosen("Suprihanto", "Bandung", "0812345678901", "KO022N", "Matematika Diskrit"));
        daftarDosen.add(new Dosen("Yadhi Aditya P", "Bandung", "087143056923", "DKO052N", "PRPL PR,PBO TE"));
        daftarDosen.add(new Dosen("Ade Chandra N", "Bandung", "08832562562990", "KO001N", "Basis Data TE"));
        daftarDosen.add(new Dosen("Muhammad Rizqi S", "Bandung", "086320937289", "KO074N", "Aljabar Linear"));
        daftarDosen.add(new Dosen("Santi Sundari", "Bandung", "089832679456", "KO009N", "PRPL TE"));
        daftarDosen.add(new Dosen("Irawan Thamrin", "Bandung", "080912789387", "KO006N", "Proyek 3"));
        daftarDosen.add(new Dosen("Irwan Setiawan", "Bandung", "085678987587", "KO045N", "Proyek 3"));
        daftarDosen.add(new Dosen("Ade Hodijah", "Bandung", "081298276673", "KO060N", "Basis Data PR"));
        daftarDosen.add(new Dosen("Zulkifli Arsyad", "Bandung", "081298327347", "KO061N", "PBO PR"));
    


        // Tambahkan data mata kuliah
        daftarMataKuliah.add(new MataKuliah("21IF2015", "Komputer Grafik", 3));
        daftarMataKuliah.add(new MataKuliah("21IF2011", "Pemprograman Berorientasi Objek", 3));
        daftarMataKuliah.add(new MataKuliah("21IF2010", "Matematika Diskrit", 3));
        daftarMataKuliah.add(new MataKuliah("21IF2012", "Basis Data", 4));
        daftarMataKuliah.add(new MataKuliah("21IF2014", "Aljabar Linier", 2));
        daftarMataKuliah.add(new MataKuliah("21IF2014", "Pengantar Rekayasa Perangkat Lunak", 4));
        daftarMataKuliah.add(new MataKuliah("21IF2016", "Proyek 3 : Pengembangan Perangkat Lunak Berbasis Web", 2));

        // Tambahkan data ruangan
        daftarRuangan.add(new Ruangan("D217-Kelas", 35));
        daftarRuangan.add(new Ruangan("D101-Kelas", 35));
        daftarRuangan.add(new Ruangan("D102-Lab.MT", 35));
        daftarRuangan.add(new Ruangan("D106-Lab.SDB", 35));

        // Buat jadwal kuliah
        daftarJadwalKuliah.add(new JadwalKuliah("Senin", "08:40", "10:40", daftarRuangan.get(0), daftarDosen.get(3), daftarMataKuliah.get(1)));
        daftarJadwalKuliah.add(new JadwalKuliah("Senin", "10:40", "12:20", daftarRuangan.get(0), daftarDosen.get(0), daftarMataKuliah.get(0)));
        daftarJadwalKuliah.add(new JadwalKuliah("Senin", "13:00", "15:30", daftarRuangan.get(0), daftarDosen.get(2), daftarMataKuliah.get(2)));
        daftarJadwalKuliah.add(new JadwalKuliah("Senin", "15:50", "18:20", daftarRuangan.get(2), daftarDosen.get(1), daftarMataKuliah.get(0)));
        daftarJadwalKuliah.add(new JadwalKuliah("Selasa", "07:00", "08:40", daftarRuangan.get(1), daftarDosen.get(4), daftarMataKuliah.get(3)));
        daftarJadwalKuliah.add(new JadwalKuliah("Selasa", "08:40", "10:40", daftarRuangan.get(1), daftarDosen.get(5), daftarMataKuliah.get(4)));
        daftarJadwalKuliah.add(new JadwalKuliah("Selasa", "10:40", "12:20", daftarRuangan.get(1), daftarDosen.get(6), daftarMataKuliah.get(5)));
        daftarJadwalKuliah.add(new JadwalKuliah("Rabu", "07:00", "16.40", daftarRuangan.get(2), daftarDosen.get(1), daftarMataKuliah.get(6)));
        daftarJadwalKuliah.add(new JadwalKuliah("Rabu", "07:00", "16.40", daftarRuangan.get(2), daftarDosen.get(7), daftarMataKuliah.get(6)));
        daftarJadwalKuliah.add(new JadwalKuliah("Rabu", "07:00", "16.40", daftarRuangan.get(2), daftarDosen.get(8), daftarMataKuliah.get(6)));
        daftarJadwalKuliah.add(new JadwalKuliah("Kamis", "09:50", "15.30", daftarRuangan.get(3), daftarDosen.get(3), daftarMataKuliah.get(5)));
        daftarJadwalKuliah.add(new JadwalKuliah("Kamis", "15:50", "18.20", daftarRuangan.get(3), daftarDosen.get(10), daftarMataKuliah.get(2)));
        daftarJadwalKuliah.add(new JadwalKuliah("Jumat", "07:00", "13.50", daftarRuangan.get(3), daftarDosen.get(9), daftarMataKuliah.get(3)));

        // Tambahkan mata kuliah ke program studi
        for (MataKuliah mk : daftarMataKuliah) {
            prodiD3TeknikInrfomatika.tambahMataKuliah(mk);
        }

        // Tampilkan data mahasiswa
        System.out.println("=== Daftar Mahasiswa ===\n");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Semester: " + mahasiswa.getSemester());
            System.out.println("Program Studi: " + mahasiswa.getProgramStudi().getNamaProdi());
            System.out.println("Jurusan: " + mahasiswa.getJurusan().getNamaJurusan());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("No. Telp: " + mahasiswa.getNoTelp());
            System.out.println();
        }

        // Tampilkan data dosen
        System.out.println("=== Daftar Dosen ===\n");
        for (Dosen dosen : daftarDosen) {
            System.out.println("Nama: " + dosen.getNama());
            System.out.println("Kode Dosen: " + dosen.getNip());
            System.out.println("Mata Kuliah: " + dosen.getMataKuliah()); 
            System.out.println("Alamat: " + dosen.getAlamat());
            System.out.println("No. Telp: " + dosen.getNoTelp());
            System.out.println();
        }

        // Tampilkan jadwal kuliah
        System.out.println("\n=== Daftar Jadwal Kuliah ===\n");
        for (JadwalKuliah jk : daftarJadwalKuliah) {
            System.out.println("Hari: " + jk.getHari());
            System.out.println("Waktu: " + jk.getWaktuMulai() + " - " + jk.getWaktuSelesai());
            System.out.println("Ruangan: " + jk.getRuangan().getKodeRuangan());
            System.out.println("Dosen: " + jk.getDosen().getNama());
            System.out.println("Mata Kuliah: " + jk.getMataKuliah().getNamaMK());
            System.out.println();
        }
    }
}
