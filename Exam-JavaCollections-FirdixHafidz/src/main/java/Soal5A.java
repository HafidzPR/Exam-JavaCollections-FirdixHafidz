// Kelas Student dengan atribut nama dan nilai
class Soal5A {
    private String name;
    private int score;

    public Soal5A(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // Override toString untuk menampilkan hasil dengan mudah
    @Override
    public String toString() {
        return name + " - " + score;
    }
}

