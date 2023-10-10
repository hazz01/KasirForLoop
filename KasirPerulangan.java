import java.util.Scanner;

public class KasirPerulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int 
        SabunCuci       = 15000,
        MinyakGoreng    = 40000,
        Telur           = 25000,
        Beras           = 13500,
        Gula            = 12500;

        char InMenu, InLoop;
        int InJumlah, Biaya=0;

        System.out.println("==========KASIR==========");

        System.out.println("Daftar Menu: ");
        System.out.println("1. Sabun Cuci   : 15.000");
        System.out.println("2. Minyak Goreng: 40.000");
        System.out.println("3. Telur        : 25.000");
        System.out.println("4. Beras        : 13.500");
        System.out.println("5. Gula         : 12.500");

        do {
            InJumlah=0;

            System.out.println("========================");
            System.out.print("Input Menu: ");
            InMenu = input.next().charAt(0);
            System.out.print("Jumlah: ");
        
            InJumlah = input.nextInt();

            switch(InMenu){
                case '1':
                Biaya = Biaya + (SabunCuci*InJumlah);
                break;

                case '2':
                Biaya = Biaya + (40000*InJumlah);
                break;

                case '3':
                Biaya = Biaya + (25000*InJumlah);
                break;

                case '4':
                Biaya = Biaya + (13000*InJumlah);
                break;

                case '5':
                Biaya = Biaya + (12500*InJumlah);
                break;
            }

            System.out.print("Ada menu Tambahan? [Y/N]: ");
            InLoop = input.next().charAt(0);

        } while (InLoop == 'Y' || InLoop == 'y');

        System.out.println("========================");
        System.out.println("Tagian Anda Adala: " +Biaya);
    }
}
