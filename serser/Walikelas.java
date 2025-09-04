package serser;

class WaliKelas extends guru{
    String Kelasbinaan;

    public WaliKelas(String nama, int nip, double gaji, String Kelasbinaan){
        super(nama, gaji, nip);
        this.Kelasbinaan = Kelasbinaan;
    }

    public void tampilkanInfoWali(){
        System.out.println("Nama\t: "+nama);
        System.out.println("nip\t: "+nip);
        System.out.println("Umur\t: "+getGaji());
        System.out.println("Kelas\t: "+Kelasbinaan);
    }
}