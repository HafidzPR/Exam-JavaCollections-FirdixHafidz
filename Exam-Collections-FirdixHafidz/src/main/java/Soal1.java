import java.util.ArrayList;

public class Soal1 {
    public static void main(String[] args) {
        // buat ArrayList buat mnyimpan nama
        ArrayList<String> namaList = new ArrayList<>();

        // nambah lima nama ke dalam ArrayList
        namaList.add("Alice");
        namaList.add("Bob");
        namaList.add("Charlie");
        namaList.add("Diana");
        namaList.add("Eve");

        // menghapus satu nama dari daftar berdasarkan index (misalnya index 2)
        namaList.remove(2); // menghapus "Charlie"

        // menampilkan semua nama yang ada dalam ArrayList setelah perubahan
        System.out.println("Daftar nama setelah perubahan: " + namaList);
    }
}