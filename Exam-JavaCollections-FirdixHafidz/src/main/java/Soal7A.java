class Soal7A implements Comparable<Soal7A> {
    private String name;
    private int arrivalTime; // Waktu kedatangan pelanggan

    public Soal7A(String name, int arrivalTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public int compareTo(Soal7A other) {
        return Integer.compare(this.arrivalTime, other.arrivalTime); // Urut berdasarkan waktu kedatangan
    }

    @Override
    public String toString() {
        return name + " (Datang ke : " + arrivalTime + ")";
    }
}


