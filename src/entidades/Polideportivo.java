package entidades;

public final class Polideportivo extends Edificio {

    private String name;
    private boolean roofing;

    public Polideportivo(String name, boolean roofing, double high, double wide, double l0ng) {
        super(high, wide, l0ng);
        this.name = name;
        this.roofing = roofing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRoofing() {
        return roofing;
    }

    public void setRoofing(boolean roofing) {
        this.roofing = roofing;
    }

    @Override
    public double calcularSuperficie() {
        double area = super.wide * super.l0ng;
        return area;
    }

    @Override
    public double calcularVolumen() {
        double volume = super.wide * super.l0ng * super.high;
        return volume;
    }

}