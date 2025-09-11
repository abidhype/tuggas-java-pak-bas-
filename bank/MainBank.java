package bank;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nomor Rekening: ");
        String noRek = input.nextLine();

        System.out.print("Masukkan Saldo Awal    : ");
        double saldo = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan Jenis Rekening (tabungan/giro/deposito): ");
        String jenis = input.nextLine().toLowerCase();

        Rekening rekening;

        switch (jenis) {
            case "tabungan":
                rekening = new RekeningTabungan(noRek, saldo);
                break;
            case "giro":
                rekening = new RekeningGiro(noRek, saldo);
                break;
            case "deposito":
                rekening = new RekeningDeposito(noRek, saldo);
                break;
            default:
                System.out.println("Jenis rekening tidak dikenal. Program berhenti.");
                return;
        }

        System.out.println("\n=== Informasi Rekening ===");
        rekening.tampilkanInfo();
        System.out.println("Bunga yang didapat : Rp " + rekening.hitungBunga());
    }
}

