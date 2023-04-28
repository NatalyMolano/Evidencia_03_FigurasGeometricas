package figurasGeometricas;
import java.util.Scanner;
public class ejecucion {
    
   
    public static void main(String[]args)
    {
        Opciones();
        
    }
    public static void Opciones()
    {
        Scanner lectura = new Scanner(System.in);
        decagono calcular = new decagono();
        triangulo triangulo= new triangulo();
        rombo rombo = new rombo();
        int op;
        
        
        do{
            System.out.println("\nBienvenido seleccione una de las figuras geomatricas \nelija 1 si desea la figura decagono\nelija 2 si dese la figura triangulo\nelija 3 si desea la figura rombo\nelija 4 para salir ");
            op = lectura.nextInt();
            if(op==1){ Decagono(); }
            else if(op==2){ Rombo(); }
            else if(op==3) {triangulo();}
            else{ System.out.println("Ingreso un dato invalido");}
        }while(op!=4);
    }
    public static void Decagono(){
        Scanner lectura = new Scanner(System.in);
        decagono calcular = new decagono();
        triangulo triangulo= new triangulo();
        rombo rombo = new rombo();
        int op;
        System.out.println("Bienvenido a la figura del DECAGONO \nseleccione la operacion que desea calcular\nelija 1 si desea realizar el calculo del area\nelija 2 si desea calcular el perimetro");
        op = lectura.nextInt();
        if(op==1){
            System.out.println("Ingrese la longitud de un lado del decagono");
            calcular.setLado(lectura.nextDouble());
            System.out.println("Ingrese la apotema del decagono");
            calcular.setApotema(lectura.nextDouble());
            calcular.calcularArea(calcular.getLado(), calcular.getApotema());
        } else if(op==2) {
            System.out.println("Ingrese la longitud de un lado del decagono");
            calcular.setLongitud(lectura.nextDouble());
            calcular.calcularPerimetro(calcular.getLongitud());
        }
    }

    public static void Rombo(){
        Scanner lectura = new Scanner(System.in);
        decagono calcular = new decagono();
        triangulo triangulo= new triangulo();
        rombo rombo = new rombo();
        int op;
        System.out.println("Bienvenido a la figura del ROMBO \nseleccione la operacion que desea calcular\nelija 1 si desea realizar el calculo del area\nelija 2 si desea calcular el perimetro");
        op = lectura.nextInt();
        if(op==1)
        {
            System.out.println("Ingrese la base del triangulo");
            triangulo.setBase(lectura.nextDouble());
            System.out.println("Ingrese la altura del triangulo");
            triangulo.setAltura(lectura.nextDouble());
            triangulo.calcularArea(triangulo.getBase(), triangulo.getAltura());
        }
        else if(op==2)
        {
            System.out.println("\nCalculo Perimetro\nIngrese la longitud de un lado");
            triangulo.calcularPerimetro(lectura.nextDouble());
        }
    }

    public static void triangulo(){
        Scanner lectura = new Scanner(System.in);
        decagono calcular = new decagono();
        triangulo triangulo= new triangulo();
        rombo rombo = new rombo();
        int op;
        System.out.println("Bienvenido a la figura del TRIANGULO EQUILATERO \nseleccione la operacion que desea calcular\nelija 1 si desea realizar el calculo del area\nelija 2 si desea calcular el perimetro");
        op = lectura.nextInt();
        if(op==1)
        {
            System.out.println("Ingrese la la diagonal Mayor");
            rombo.setDiagonalMayor(lectura.nextDouble());
            System.out.println("Ingrese la diagonal menor");
            rombo.setDiagonalMenor(lectura.nextDouble());
            rombo.calcularArea(rombo.getDiagonalMayor(),rombo.getDiagonalMenor());
        }
        else if(op==2)
        {
            System.out.println("\nCalculo Perimetro\nIngrese la longitud de un lado");
            rombo.setLongitud(lectura.nextDouble());
            rombo.calcularPerimetro(rombo.getLongitud());
        }
    }
    
}
