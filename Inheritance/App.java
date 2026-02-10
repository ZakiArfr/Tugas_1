public class App {
    public static void main(String[] args) {

        bujurSangkar bujursangkar = new bujurSangkar("Bujur Sangkar", 34);

        bujursangkar.infoBidang();
        System.out.println("Luas Bujur Sangkar: " + bujursangkar.luas());
        System.out.println();
        lingkaran bundaran = new lingkaran("Lingkaran", 11);

        bundaran.infoBidang();
        System.out.println("Luas Lingkaran: " + bundaran.luas());
    }

}