public abstract class Figura {
    private String color;

    public Figura(String color) { //costructor
        this.color = color;
    }

    public String getColor() { //metodo getter normal
        return color;
    }

    public abstract double calcularArea();
}
