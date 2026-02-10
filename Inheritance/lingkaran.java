class lingkaran extends bidangDuaDimensi {
    protected int jari;

    public lingkaran(String nama, int jari) {
        super(nama);
        this.jari = jari;
    }

    @Override
    public double luas() {
        return 3.14 * jari * jari;
    }

}