import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Soal7B {
    public static void main(String[] args) {
        // **1. Menggunakan Queue (LinkedList) untuk antrian pelanggan**
        Queue<String> customerQueue = new LinkedList<>();

        // Menambahkan tiga pelanggan ke dalam antrian
        customerQueue.add("Hafidz");
        customerQueue.add("Firdi");
        customerQueue.add("Far");

        // **2. Menampilkan pelanggan yang pertama kali masuk (peek)**
        System.out.println("Pelanggan pertama dalam antrian: " + customerQueue.peek());

        // **3. Menggunakan PriorityQueue untuk prioritas berdasarkan waktu kedatangan**
        PriorityQueue<Soal7A> priorityQueue = new PriorityQueue<>();

        // Menambahkan pelanggan dengan waktu kedatangan berbeda
        priorityQueue.add(new Soal7A("Far   ", 3));  // Datang ke-3
        priorityQueue.add(new Soal7A("Hafid ", 1));    // Datang pertama
        priorityQueue.add(new Soal7A("Firdi ", 2));  // Datang ke-2

        // Menampilkan pelanggan berdasarkan prioritas (waktu kedatangan)
        System.out.println("\nAntrian berdasarkan waktu kedatangan (PriorityQueue):");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll()); // Mengeluarkan pelanggan sesuai prioritas
        }
    }
}