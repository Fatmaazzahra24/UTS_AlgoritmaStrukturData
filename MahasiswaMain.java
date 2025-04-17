import java.util.Scanner;
public class MahasiswaMain {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean running = true;

        Mahasiswa[] mhs = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };
        MataKuliah[] matkul = {
            new MataKuliah("MK001", "Struktur Data", 3),
            new MataKuliah("MK002", "Basis Data", 3), shhhhhshshw
            new MataKuliah("MK003", "Desain Web", 3)    
        };
        Penilaian[] dataNilai = {
            new Penilaian(mhs[0], matkul[0], 80, 85, 90),
            new Penilaian(mhs[0], matkul[1], 60, 75, 70),
            new Penilaian(mhs[1], matkul[0], 75, 70, 80),
            new Penilaian(mhs[2], matkul[1], 85, 90, 95),
            new Penilaian(mhs[2], matkul[2], 80, 90, 65)
        };
      
        while (running) {
            System.out.println(("============= MENU SISTEM AKADEMIK ===============")); 
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("6. Keluar "); 
            System.out.print("Pilih Menu: ");
            int menu = input.nextInt();
            input.nextLine(); 

            switch (menu) {
                case 1:
                    for (Mahasiswa mahasiswa : mhs) {
                        mahasiswa.tampilMahasiswa();                       
                    }
                    break;
                case 2:
                    for (MataKuliah MataKuliah : matkul) {
                        MataKuliah.tampilMataKuliah();
                    }
                    break;
                case 3:
                    for (Penilaian penilaian : dataNilai) {
                        penilaian.tampilDataPenilaian();
                    }
                    break;
                case 4:
                    for (Penilaian ShortingNilai : dataNilai) {
                        ShortingNilai.tampilDataPenilaian(); 
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cari = input.nextLine(); 
                    mahasiswa.SearchNim(mhs, cari);
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem akademik.");
                    running = false;
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang tersedia.");
            }

        }
    } 

}

