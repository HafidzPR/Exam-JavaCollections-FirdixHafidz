import java.util.HashSet;

public class Soal2 {
    public static void main(String[] args) {
        // buat hashSet untuk menyimpan nama-nama kota
        HashSet<String> kotaSet = new HashSet<>();

        // menambahkan 5 nama kota ke dalam HashSet (termasuk duplikat)
        kotaSet.add("Jakarta");
        kotaSet.add("Bandung");
        kotaSet.add("Surabaya");
        kotaSet.add("Medan");
        kotaSet.add("Jakarta"); // duplikat

        // menampilkan semua nama kota yang ada di dalam HashSet
        System.out.println("Daftar kota: " + kotaSet);
    }
}