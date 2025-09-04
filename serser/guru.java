package serser;

class guru {
    public String nama;
    protected int  nip;
    private double gaji;
    

    public guru(String nama, double gaji, int nip){
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
        
    }

    public void tampilkanInfo(){
        System.out.println("Nama\t: "+nama);
        System.out.println("nip\t: "+nip);
        System.out.println("gaji\t: "+gaji);
    }

    public double  getGaji(){
        return gaji;
    }

    public void setGaji(double  gaji){
        this.gaji = gaji;
    }
}
