public class Penilaian {
    Mahasiswa  Mahasiswa;
    MataKuliah matkul;
    double tugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    public Penilaian(Mahasiswa Mahasiswa, MataKuliah matkul, double tugas, double nilaiUTS, double nilaiUAS) {
        this.Mahasiswa = Mahasiswa;
        this.matkul = matkul;
        this.tugas = tugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        hitungNilaiAkhir();
    }
    void hitungNilaiAkhir  () {
        nilaiAkhir = (tugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    public void tampilDataPenilaian() {
        System.out.println(Mahasiswa.nama + " | " + matkul.namaMK + " | Nilai Akhir :  " + nilaiAkhir );
    } 
    public void ShortingNilai (Penilaian [] dataNilai) {
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