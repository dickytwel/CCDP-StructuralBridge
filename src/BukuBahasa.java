public abstract class BukuBahasa implements Buku{

    @Override
    public boolean khususBahasa() {
        return true;
    }

    @Override
    public boolean khususKomputer() {
        return false;
    }

}
