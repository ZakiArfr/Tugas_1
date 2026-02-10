public class App {
    public static void main(String[] args) {

        bujurSangkar bujursangkar = new bujurSangkar("Bujur Sangkar", 4);

        bujursangkar.infoBidang();
        System.out.println("Luas Bujur Sangkar: " + bujursangkar.luas());
        System.out.println();
        lingkaran bundaran = new lingkaran("Lingkaran", 8);

        bundaran.infoBidang();
        System.out.println("Luas Lingkaran: " + bundaran.luas());
    }


}
