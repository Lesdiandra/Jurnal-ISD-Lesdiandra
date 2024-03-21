import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        Queue<String> antrian = new LinkedList<>();
    while (true) {
        System.out.println("1. Input tugas");
        System.out.println("2. Deadline Terdekat");
        System.out.println("3. Hapus Tugas");
        System.out.println("4. Tampilkan Tugas");
        System.out.println("5. Exit");

        String pilihan = in.nextLine();

                switch (pilihan) {
                    
                    case "1":
                    
                    System.out.println("Input Tugas :");
                    String mataKuliah = in.nextLine();
                    System.out.println("Nama Tugas :");
                    String namaTugas = in.nextLine();
                    System.out.println("Deadline :");
                    String deadline = in.nextLine();
                    antrian.add(mataKuliah + namaTugas + deadline);
                    break;

                    case "2":
                    
                        if (!antrian.isEmpty()) {
                            System.out.println("Deadline Terdekat : "+ antrian.peek());
                        } else {
                            System.out.println("Tidak ada tugas");
                        }
                        break;
                        
                    case "3":
                        
                       if (!antrian.isEmpty()) {
                        System.out.println("Sudah selesai "+ antrian.remove());
                       } else {
                        System.out.println("Sudah selesai ");
                       }break;

                    case "4":
                       for (String tugas : antrian) {
                        System.out.println(tugas);
                       }break;
                    
                    case "5":
                       System.out.println("Semangat!!!");
                       System.exit(0);
                       break;
                    default:
                    System.out.println("Pilih angka lain :");
                    break;


                }
    }
    }
}