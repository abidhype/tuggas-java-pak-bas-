package tugasupercons;

public class ticket {
    String noticket;
    String harga;
    String asal;
    String tujuan;

    ticket(String noticket, String harga, String asal, String tujuan){
        this.noticket = noticket;
        this.harga = harga;
        this.asal = asal;
        this.tujuan = tujuan;
    }

    String infoTicket(){
        return "Nomor Ticket: "+noticket +"\nHarga: "+harga+"\nAsal: "+asal+"\nTujuan: "+tujuan;
    }
}
