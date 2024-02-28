import java.awt.*;
import java.util.Scanner;

public class LoginSystem {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Selamat Datang di Sistem Login Liblary ===");

        System.out.println(" Silahkan Pilih Role Anda: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Exit");
        System.out.println("Silahkan Pilih (1-3): ");
        int roleChoice = scanner.nextInt();
        scanner.nextLine();

        switch (roleChoice){
            case 1:
                adminLogin(scanner);
                break;
            case 2:
                MahasiswaLogin(scanner);
                break;
            case 3:
                Exit(scanner);;
            default:
                System.out.println("Pilihan Anda Tidak Valid!");
        }
    }

    private static void adminLogin(Scanner scanner){
        System.out.println("=== Login Admin ===");
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)){
            System.out.println("Anda Telah Masuk Ke Admin");
        } else if (username.equals(ADMIN_USERNAME)) {
            System.out.println("Username Tidak Valid!");
        } else if (password.equals(ADMIN_PASSWORD)) {
            System.out.println("Password Yang Anda Masukan Salah!");
        }else {
            System.out.println("Username & Password Yang Anda Masukan Salah! ");
        }
    }

    private static void MahasiswaLogin(Scanner scanner){
        System.out.println("=== Login Mahasiswa ===");
        System.out.println("Masukan Nim Anda: ");
        String MasukanNimAnda = scanner.nextLine();

        if (MasukanNimAnda.length() == 15){
            System.out.println("Login Berhasil Sebagai Mahasiswa Dengan Nim: " + MasukanNimAnda);
        }else {
            System.out.println("Panjang NIM Harus 15 Angka! ");
        }
    }

    private static void Exit(Scanner scanner) {
        System.out.println("Anda Telah Keluar");
    }
}