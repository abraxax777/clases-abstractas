public class triangulo extends Figura{
    private double altura;
    private double base;

    public triangulo(String color, double altura, double base) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        double area;
        area=(base*altura)/2;
        return area;
    }
}
