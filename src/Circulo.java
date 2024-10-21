import Abstractos.figura;

public class Circulo extends figura {
   double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    @Override
    protected double CalcularArea() {
        return 0;
    }

    @Override
    protected double CalcularPerimetro() {
        return 0;
    }
}
