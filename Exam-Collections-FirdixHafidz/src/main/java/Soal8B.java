import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Soal8B {
    public static void main(String[] args) {
        // **1. Membuat ArrayList untuk menyimpan buku**
        List<Soal8A> books = new ArrayList<>();

        // Menambahkan 5 buku ke dalam ArrayList
        books.add(new Soal8A("To Kill a Mockingbird ", "Harper Lee"));
        books.add(new Soal8A("Crime and Punishment  ", "Fyodor Dostoevsky"));
        books.add(new Soal8A("Pride and Prejudice   ", "Jane Austen"));
        books.add(new Soal8A("The Great Gatsby      ", "F. Scott Fitzgerald"));
        books.add(new Soal8A("Moby-Dick             ", "Herman Melville"));

        // **2. Mengurutkan berdasarkan author**
        Collections.sort(books, Comparator.comparing(Soal8A::getAuthor));

        // **3. Menampilkan semua buku setelah diurutkan**
        System.out.println("Daftar Buku Setelah Diurutkan Berdasarkan Author:");
        System.out.println("=================================================");
        for (Soal8A book : books) {
            System.out.println(book);
        }
    }
}
