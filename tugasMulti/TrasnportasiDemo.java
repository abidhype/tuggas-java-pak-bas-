package tugasMulti;

class Kendaraan {
  String merk = "Tesla"; 
  int tahunProduksi = 2023;
   
  String cekKendaraan() { 
    return "Ini berasal dari class Kendaraan"; 
  }
}
 
class KendaraanDarat extends Kendaraan {
  int jumlahRoda = 4;
 
  String cekKendaraanDarat() { 
    return "Ini berasal dari class KendaraanDarat"; 
  }
}
 
class Mobil extends KendaraanDarat {
  String lihatSpec() { 
    return "Merk: " + merk + ", Tahun Produksi: " + tahunProduksi + ", Jumlah Roda: " + jumlahRoda;
  } 
  String cekMobil() { 
    return "Ini berasal dari class Mobil"; 
  }
}
 
public class TrasnportasiDemo {
  public static void main(String args[]){
     
    Mobil netbookAndi = new Mobil();
     
    System.out.println(netbookAndi.lihatSpec());
    System.out.println(netbookAndi.cekKendaraan());
    System.out.println(netbookAndi.cekKendaraanDarat());
    System.out.println(netbookAndi.cekMobil());
   
  }
}