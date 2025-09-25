package tugasupercons;

public class ticketeksekutif extends ticketbisnis {
    ticketeksekutif(String noticket, String harga, String asal, String tujuan){
        super(noticket, harga, asal, tujuan);
}

    String infoTicketEksekutif(){
        return "Nomor Ticket: "+noticket +"\nHarga: "+harga+"\nAsal: "+asal+"\nTujuan: "+tujuan+"\nKelas: Eksekutif";
}
    
}
