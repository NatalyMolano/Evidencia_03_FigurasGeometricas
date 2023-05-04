package figurasGeometricas;
public class triangulo extends figura {
    double base,altura;
    public triangulo()
   {
    
   }

   public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        
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
   
    
}
