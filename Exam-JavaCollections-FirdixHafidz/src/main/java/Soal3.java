import java.util.HashMap;
import java.util.Map;

public class Soal3 {
    public static void main(String[] args) {
        // Membuat HashMap untuk menyimpan Student ID dan Nama Mahasiswa
        HashMap<String, String> mahasiswaMap = new HashMap<>();

        // menambahkan 5 entri ke dalam HashMap
        mahasiswaMap.put("S001", "Alice");
        mahasiswaMap.put("S002", "Bob");
        mahasiswaMap.put("S003", "Charlie");
        mahasiswaMap.put("S004", "Diana");
        mahasiswaMap.put("S005", "Eve");

        // mencari nama mahasiswa berdasarkan Student ID
        String studentId = "S003";
        String namaMahasiswa = mahasiswaMap.get(studentId);
        System.out.println("Nama mahasiswa dengan Student ID " + studentId + ": " + namaMahasiswa);

        // menghapus entri berdasarkan Student ID
        mahasiswaMap.remove("S002"); // Menghapus Bob

        // menampilkan semua Student ID dan nama mahasiswa
        System.out.println("Daftar Student ID dan Nama Mahasiswa:");
        for (Map.Entry<String, String> entry : mahasiswaMap.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Nama: " + entry.getValue());
        }
    }
}