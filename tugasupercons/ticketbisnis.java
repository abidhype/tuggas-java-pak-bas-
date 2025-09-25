package tugasupercons;

public class ticketbisnis extends ticketekonomi{

    public ticketbisnis(String noticket, String harga, String asal, String tujuan) {
        super(noticket, harga, asal, tujuan);
    }
     
    String infoTicketBisnis (){
        return "Nomor Ticket: "+noticket +"\nHarga: "+harga+"\nAsal: "+asal+"\nTujuan: "+tujuan+"\nKelas: Ekonomi";
    }
}
