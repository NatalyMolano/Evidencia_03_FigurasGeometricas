package figurasGeometricas;
public class rombo extends figura
{
    double diagonalMayor,diagonalMenor,longitud;
    
    public rombo()
    {

    }
    public rombo(double diagonalMayor, double diagonalMenor, double longitud) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.longitud = longitud;
    }
    public double getDiagonalMayor() {
        return diagonalMayor;
    }
    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }
    public double getDiagonalMenor() {
        return diagonalMenor;
    }
    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    
    public void calcularArea(double D, double d)
    {
        System.out.println("El area del rombo es:" +(D*d)/2);

    }
    public void calcularPerimetro(double l)
    {
        System.out.println("El perimetro del decagono es:" +l*4);
    }
    
}
