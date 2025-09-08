package tugasKeren;

public class Manajer extends Pegawai {
    private String divisi;

    public Manajer(String nama, String idPegawai, double gaji, String divisi) {
        super (nama, idPegawai, gaji);
        this.divisi = divisi;
    }

    
    @Override
    public void tampilkanInfo() {
        System.out.println("===== Data Manajer =====");
        System.out.println("Nama       : " + nama);
        System.out.println("ID Pegawai : " + idPegawai);
        System.out.println("Divisi     : " + divisi);
    }
}


