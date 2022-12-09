package figurasGeometricas;
public class triangulo extends figura {
    double base,altura,longitud,area,perimetro;
    public triangulo()
   {
    
   }

   public triangulo(double base, double altura, double longitud, double area, double perimetro) {
        this.base = base;
        this.altura = altura;
        this.longitud = longitud;
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

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    public void calcularArea(double b, double a)
    {
        area = (a*b)/2;
        System.out.println("El area del triangulo equilatero es: " + area);
    }
    public void calcularPerimetro(double l)
    {
        perimetro = l*3;
        System.out.println("El perimetro del triangulo equilatero es: "+perimetro);
    }
    
}
