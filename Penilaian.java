public class Penilaian {
    Mahasiswa  Mahasiswa;
    MataKuliah matkul;
    double tugas, nilaiUTS, nilaiUAS, nilaiAkhir, nilaiKuis;

    public Penilaian(Mahasiswa Mahasiswa, MataKuliah matkul, double tugas, double nilaiUTS, double nilaiUAS, double nilaiKuis) {
        this.Mahasiswa = Mahasiswa;
        this.matkul = matkul;
        this.tugas = tugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiKuis = nilaiKuis;
        hitungNilaiAkhir();
    }
    void hitungNilaiAkhir  () {
        nilaiAkhir = (tugas * 0.1) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4) + (nilaiKuis * 0.2);
    }

    public void tampilDataPenilaian() {
        System.out.println(Mahasiswa.nama + " | " + matkul.namaMK + " | Nilai Akhir :  " + nilaiAkhir);
    } 
    public void ShortingNilaiBubble(Penilaian[] dataNilai) {
        int n = dataNilai.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dataNilai[j].nilaiAkhir > dataNilai[j + 1].nilaiAkhir) {
                    Penilaian temp = dataNilai[j];
                    dataNilai[j] = dataNilai[j + 1];
                    dataNilai[j + 1] = temp;
                }
            }
        }
    } 
    public void ShortingNilaiInsertion (Penilaian [] dataNilai) {
        for (int i = 0; i < dataNilai.length; i++) {
            Penilaian temp = dataNilai[i];
            int j=i-1;
            while (j >= 0 && dataNilai[j].nilaiAkhir <  temp.nilaiAkhir) {
                dataNilai[j + 1] = dataNilai[j];
                j--;
            }
            dataNilai[j + 1] = temp;
        }
    }
    
}