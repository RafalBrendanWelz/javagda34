package dzien8.garaz;

import java.util.Objects;

public abstract class Samochod {
    protected String marka;
    protected String model;
    protected String kolor;

    public Samochod(String marka, String model, String kolor) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    public void zmienKolor(String kolor){
        this.kolor = kolor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samochod samochod = (Samochod) o;
        return Objects.equals(marka, samochod.marka) &&
                Objects.equals(model, samochod.model) &&
                Objects.equals(kolor, samochod.kolor);
    }


}
