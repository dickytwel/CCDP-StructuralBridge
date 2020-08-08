public abstract class BukuKomputer implements Buku{

    @Override
    public boolean khususBahasa() {
        return false;
    }

    @Override
    public boolean khususKomputer() {
        return true;
    }

    public abstract String getPenerbit();
}
