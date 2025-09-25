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
  String jenisMesin ="lisrtik";

  String cekMobil() { 
    return "Ini berasal dari class Mobil"; 
  }
}

class MobilListrik extends Mobil {
  int kapasitasBaterai = 75;
   
  String cekMobilListrik() { 
    return "Ini berasal dari class MobilListrik"; 
  }
}
class info extends MobilListrik{
    String infoKendaraan(){
      return "Merk: "+merk+"\nTahun Produksi: "+tahunProduksi+"\nJumlah Roda: "+jumlahRoda+"\nJenis Mesin: "+jenisMesin+"\nKapasitas Baterai: "+kapasitasBaterai;
    }
    String nyalKanMesin(){
      return "ehwfhwuihuuihfshuhuuuiuihhsdfufduh";
    }
}
 
public class TrasnportasiDemo {
  public static void main(String args[]){
     
    info mobilListrik = new info();
     
    

    System.out.println(mobilListrik.infoKendaraan());
    System.out.println(mobilListrik.cekKendaraan());
    System.out.println(mobilListrik.cekKendaraanDarat());
    System.out.println(mobilListrik.cekMobil());
    System.out.println(mobilListrik.cekMobilListrik());
   
  }
}