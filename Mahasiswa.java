public class Mahasiswa {
    public String NIM;
    public String nama;
    public String prodi;

    public Mahasiswa (String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }
    public void tampilMahasiswa () {
        System.out.println("NIM: " + NIM + " | Nama: " + nama + " | Prodi: ");
    }
    public static  void SearchNim (Mahasiswa[] mhs, String cari) {
        boolean ketemu = false;
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].NIM.equalsIgnoreCase(cari)) {
                mhs[i].tampilMahasiswa();
                ketemu = true;
            }
            if (!ketemu) {
                System.out.println("Mahasiswa dengan NIM " + cari + " tidak ditemukan.");
            }
        }
    }
}