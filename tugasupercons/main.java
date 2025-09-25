package tugasupercons;

public class main {
    public static void main(String[] args) {
        ticketekonomi te = new ticketekonomi("001", "50000", "Jakarta", "Bandung");
        System.out.println(te.infoTicketEkonomi());
        System.out.println();
        
        ticketbisnis tb = new ticketbisnis("002", "150000", "Jakarta", "Surabaya");
        System.out.println(tb.infoTicketBisnis());
        System.out.println();
        
        ticketeksekutif tk = new ticketeksekutif("003", "300000", "Jakarta", "Bali");
        System.out.println(tk.infoTicketEksekutif());
    }
}
