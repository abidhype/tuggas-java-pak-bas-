package tugasupercons;

public class main {
    public static void main(String[] args) {
        ticketekonomi budiEkonomi = new ticketekonomi("001", "50000", "Jakarta", "Bandung");
        System.out.println(budiEkonomi.infoTicketEkonomi());
        System.out.println();
        
        ticketbisnis bapakBisnis = new ticketbisnis("002", "150000", "Jakarta", "Surabaya");
        System.out.println(bapakBisnis.infoTicketBisnis());
        System.out.println();
        
        ticketeksekutif ibuEksekutif = new ticketeksekutif("003", "300000", "Jakarta", "Bali");
        System.out.println(ibuEksekutif.infoTicketEksekutif());
    }
}
