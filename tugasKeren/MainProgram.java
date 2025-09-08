package tugasKeren;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Input Data Pekerja ===");
        System.out.print("Nama pekerja : ");
        String nama = input.nextLine();

        System.out.print("ID pekerja   : ");
        String id = input.nextLine();

        System.out.print("Gaji         : ");
        double gaji = input.nextDouble();
        input.nextLine(); 
        System.out.println("Apakah pekerja ini seorang manajer?");
        System.out.print("Manajer (y/n): ");
        String jawab = input.nextLine();

        Pegawai p;
        if (jawab.equalsIgnoreCase("y")) {
            System.out.print("Divisi       : ");
            String div = input.nextLine();
            p = new Manajer(nama, id, gaji, div);
        } else {
            p = new Pegawai(nama, id, gaji);
        }

        p.tampilkanInfo();

        input.close();
    }
}

