import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Soal6 {
    public static void main(String[] args) {

        // Membuat ArrayList dengan beberapa nilai
        List<Integer> numbers = new ArrayList<>();
        numbers.add(19);
        numbers.add(21);
        numbers.add(69);
        numbers.add(420);
        numbers.add(2025);

        // Menggunakan Iterator untuk menampilkan elemen-elemen
        System.out.println("Daftar angka sebelum penghapusan:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Menghapus elemen dengan nilai tertentu (misalnya, hapus angka 30)
        iterator = numbers.iterator(); // Reset iterator sebelum iterasi baru
        while (iterator.hasNext()) {
            if (iterator.next() == 69) { // Jika elemen adalah 30, hapus
                iterator.remove();
            }
        }

        // Menampilkan elemen setelah penghapusan
        System.out.println("\nDaftar angka setelah menghapus 69:");
        iterator = numbers.iterator(); // Reset iterator untuk iterasi baru
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
