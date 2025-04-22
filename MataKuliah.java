public class MataKuliah {
    public String kodeMK;
    public String namaMK;
    public String  dosen ;
    public int sks;

    public MataKuliah (String kodeMK, String namaMK, String dosen, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.dosen = dosen;
        this.sks = sks;
    }
    public void tampilMataKuliah() {
        System.out.println("Kode MK: " + kodeMK + " | Nama: " + namaMK +" | SKS: " + sks + " | Dosen: " + dosen);
    }
}