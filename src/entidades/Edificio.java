package entidades;

public abstract class Edificio {

    protected double high;
    protected double wide;
    protected double l0ng;

    public Edificio(double high, double wide, double l0ng) {
        this.high = high;
        this.wide = wide;
        this.l0ng = l0ng;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public double getL0ng() {
        return l0ng;
    }

    public void setL0ng(double l0ng) {
        this.l0ng = l0ng;
    }

    public abstract double calcularSuperficie();

    public abstract double calcularVolumen();

}