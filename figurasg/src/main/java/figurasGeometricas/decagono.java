package figurasGeometricas;
public class decagono extends figura {
    double lado,longitud,apotema,area,perimetro;
    
    public decagono()
    {

    }
    public decagono(double lado, double longitud, double apotema, double area, double perimetro) {
        this.lado = lado;
        this.longitud = longitud;
        this.apotema = apotema;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void calcularArea(double l, double a)
    {
        area= 5 * l * a;
        System.out.println("El area del decagono es: "+area);
       
    }
    public void calcularPerimetro(double l)
    {
        perimetro = 10*l;
        System.out.println("El perimetro del decagono es: " + perimetro);
    }
    
}
