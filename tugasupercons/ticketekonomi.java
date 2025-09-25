package tugasupercons;

public class ticketekonomi extends ticket {
    ticketekonomi(String noticket, String harga, String asal, String tujuan){
        super(noticket, harga, asal, tujuan);
    }

    String infoTicketEkonomi(){
        return "Nomor Ticket: "+noticket +"\nHarga: "+harga+"\nAsal: "+asal+"\nTujuan: "+tujuan+"\nKelas: Ekonomi";
    }
    
}
