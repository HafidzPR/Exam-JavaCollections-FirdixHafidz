// Kelas Book dengan atribut title dan author
class Soal8A {
    private String title;
    private String author;

    public Soal8A(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Judul Buku  :       " + title + " | Penulis     : " + author;
    }
}

