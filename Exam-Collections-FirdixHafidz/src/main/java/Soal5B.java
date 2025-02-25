import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Soal5B {
    public static void main(String[] args) {
        // Membuat daftar mahasiswa
        List<Soal5A> students = new ArrayList<>();
        students.add(new Soal5A("CaptainAmerica", 85));
        students.add(new Soal5A("Ironman", 99));
        students.add(new Soal5A("Hulk", 78));
        students.add(new Soal5A("Thor", 85));
        students.add(new Soal5A("Dr.Strange", 94));

        // Mengurutkan daftar berdasarkan nilai secara menurun
        students.sort(Comparator.comparingInt(Soal5A::getScore).reversed());

        // Menampilkan hasil setelah diurutkan
        System.out.println("Daftar Mahasiswa setelah diurutkan:");
        for (Soal5A student : students) {
            System.out.println(student);
        }
    }
}
