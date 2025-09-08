package tugasKeren;

public class Pegawai {
    // Atribut dengan akses modifier
    protected String nama;
    protected String idPegawai;
    protected double gaji;

    // Constructor
    public Pegawai(String nama, String idPegawai, double gaji) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.gaji = gaji;
    }

    // Method yang bisa dioverride
    public void tampilkanInfo() {
        System.out.println("===== Data Pegawai =====");
        System.out.println("Nama       : " + nama);
        System.out.println("ID Pegawai : " + idPegawai);
        System.out.println("Gaji       : Rp " + gaji + " jt");
    }
}
