import java.util.Scanner;

public class film {
    public static void main(String[] args) {
        String pilihan;
        Scanner beli = new Scanner(System.in);
        Boolean lanjut = true;

        while (lanjut) {
            double hargaDeadpool3 = 45000;
            double hargaKungFuPanda = 50000;
            double hargaKarateKid = 60000;

            System.out.println("Cinema Zefa");
            System.out.println("|1.Deadpool 3 (Harga 45k)\t|");
            System.out.println("|2.Kung Fu Panda (Harga 50k)\t|");
            System.out.println("|3.Inside Out 3 (Harga 50k)\t|");
            System.out.println("-----------------");
            System.out.print("Masukkan pilihan anda: ");
            int pilih = beli.nextInt();
            if (pilih == 1) {
                pilihan = "Deadpool 3";
            }
            else if (pilih == 2) {
                pilihan = "Exhuma";

         }  else if (pilih == 3) {
                pilihan = "The Glory";

              }else{
                pilihan = "Input Salah";
            }

            System.out.println("Film yang ingin anda tonton\t: " + pilihan);
            System.out.print("Jumlah tiket\t\t\t: ");

            double jumlah = beli.nextDouble();


         double hargaTotal = 0;
            switch (pilih) {
                case 1:
                    hargaTotal = jumlah * hargaDeadpool3;
                    break;
                case 2:
                    hargaTotal = jumlah * hargaKungFuPanda;
                    break;
                case 3: hargaTotal = jumlah * hargaKarateKid;
                break;
                default:
                    System.out.println("Input tidak valid");
                    break;
            }

            double uangDibayar = 0;
            double kembalian = 0;
            double diskon = 0;

            double besarDiskon = 0;
            if (jumlah >= 2) {
                diskon = 0.10;
                besarDiskon = hargaTotal * diskon;
                hargaTotal -= besarDiskon;
            }
            System.out.print("Masukkan uang yang dibayar: ");
            uangDibayar = beli.nextDouble();




            kembalian  = uangDibayar - hargaTotal;
            System.out.println("Rincian pembayaran");
            System.out.println("========================================");
            System.out.println("|1. Jenis Film\t: "+ pilih);
            System.out.println("|2. Jumlah Tiket\t: "+jumlah+ " Tiket");
            System.out.println("|3. Jumlah diskon\t: Rp." +besarDiskon+ "(Anda mendapatkan diskon karena membeli lebih dari 2 tiket)");
            System.out.println("|4. Total pembayaran\t: Rp."+hargaTotal);
            System.out.println("|5. Uang yang dibayar\t: Rp."+hargaTotal);
            System.out.println("|6. Kembalian\t\t: Rp."+kembalian);

            System.out.println("==========================================");
            System.out.println("Apakah anda ingin membeli lagi (y/n)? ");
            String jawab = beli.next();

            if (jawab.equalsIgnoreCase("n")) {
                lanjut = false;
                System.out.println("Terima kasih telah membeli tiket di J Cinema");
            }
        }
    }
}