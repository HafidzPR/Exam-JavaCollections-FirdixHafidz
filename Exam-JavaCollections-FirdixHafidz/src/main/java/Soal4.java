import java.util.LinkedList;

public class Soal4 {
    public static void main(String[] args) {
        // membuat LinkedList untuk menyimpan daftar tugas
        LinkedList<String> tugasList = new LinkedList<>();

        // menambahkan lima tugas ke dalam LinkedList
        tugasList.add("Membaca buku");
        tugasList.add("Menulis laporan");
        tugasList.add("Belajar Java");
        tugasList.add("Berolahraga");
        tugasList.add("Membuat presentasi");

        // menampilkan tugas-tugas yang ada di daftar
        System.out.println("Daftar tugas: " + tugasList);

        // menghapus tugas pertama dari daftar
        tugasList.removeFirst(); // Menghapus "Membaca buku"

        // menampilkan sisa tugas
        System.out.println("Daftar tugas setelah menghapus tugas pertama: " + tugasList);
    }
}