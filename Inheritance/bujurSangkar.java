class bujurSangkar extends bidangDuaDimensi {
    protected int sisi;

    public bujurSangkar(String nama, int sisi) {
        super(nama);
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

}
