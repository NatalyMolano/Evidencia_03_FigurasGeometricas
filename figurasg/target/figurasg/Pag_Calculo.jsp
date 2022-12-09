<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
    <head>
        <meta charset="utf-8">
        <a name="Calculo"></a>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Calcular</title>
        <link rel="stylesheet" href="diseño.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    
    </head>
    <body>
        <div class="container-fluid p-5 bg-secondary text-white text-center">
            
            <h1>Calcular perimetro y area</h1>
            <h6><br>Calculo de perimetro y area de las figuras<br>Dacágono     Rombo   Triangulo</h6>
        </div>
        
        <div class="borde">
            <form action="" method="get">
                <fieldset>
                    <a name="area_decagono"></a>
                    <div class="area">
                        <label for="lado">AREA DECÁGONO<br>Ingrese un Lado del Decágono:</label><br>
                        <input type="text" id="lado" name="lado" required placeholder="Ingrese un Lado del Decágono">
                        <br><br><button class="btn btn-primary" type="button"><a href="Pag_1.jsp#Decágono">Anterior Pagina</a></button> 
                    </div>
                    <a name="perimetro_decagono"></a>
                    <div class="perimetro">
                        <label for="longitud">PERIMETRO DECÁGONO<br>Ingrese la Longitud de un lado del Decágono</label><br>
                        <input type="text" id="longitud" name="longitud" required placeholder="Ingrese la Longitud de un lado">
                        <br><br><button class="btn btn-dark" type="button"><a href="Pag_1.jsp#Decágono">Anterior Pagina</a></button> 
                    </div>
                </fieldset>
            </form>

            <form action="" method="get">
                <fieldset>
                    <a name="area_rombo"></a>
                    <div class="area"> 
                        <label for="ladoM">AREA ROMBO<br>Ingrese la diagonal mayor del Rombo</label><br>
                        <input type="text" id="ladoM" name="ladoM" required placeholder="Ingrese la diagonal mayor"><br>
                        <label for="ladom">Ingrese la diagonal menor del Rombo</label><br>
                        <input type="text" id="ladom" name="ladom" required placeholder="Ingrese la diagonal menor">
                        <br><br><button class="btn btn-primary" type="button"><a href="Pag_2.jsp#Rombo">Anterior Pagina</a></button> 
                    </div>
                    <a name="perimetro_rombo"></a>
                    <div class="perimetro">
                        <label for="longitudR">PERIMETRO ROMBO<br>Ingrese la Longitud de un lado del Rombo</label><br>
                        <input type="text" id="longitudR" name="longitudR" required placeholder="Ingrese la Longitud de un lado">
                        <br><br><button class="btn btn-dark" type="button"><a href="Pag_2.jsp#Rombo">Anterior Pagina</a></button> 
                        
                    </div>
                </fieldset>
            </form>
            
            <form action="" method="get">
                <fieldset>
                    <a name="area_triangulo"></a>
                    <div class="area"> 
                        <label for="Base">AREA TRIANGULO EQUILÁTERO<br>Ingrese la Base del triangulo</label><br>
                        <input type="text" id="Base" name="Base" required placeholder="Ingrese la Base del triangulo"><br>
                        <label for="Altura">Ingrese la Altura del Triangulo</label><br>
                        <input type="text" id="Altura" name="Altura" required placeholder="Ingrese la Altura del Triangulo">
                        <br><input  class="btn btn-dark" type="button" onClick="calcularArea()" Value="Calcular" />
                     </form>
                     
                     <p style="color:white;">El area del triangulo es: <br>
                       <span id = "result"></span>
                     </p>
                     <script>
                       function calcularArea() 
                       { 
                        base = document.getElementById(
                            "Base").value;
                          altura = document.getElementById(
                            "Altura").value;
                          document.getElementById(
                            "result").innerHTML = base * altura;
                       }
                    </script>
                    <a name="perimetro_t"></a>
                    <div class="perimetro">
                        <label for="longitudR">PERIMETRO TRIANGULO<br>Ingrese la Longitud de un lado del Triangulo</label><br>
                        <input type="text" id="longitudR" name="longitudR" required placeholder="Ingrese la Longitud de un lado">
                        <br><br><button class="btn btn-dark" type="button"><a href="Pag_3.jsp#Triangulo">Anterior Pagina</a></button> 
                        
                    </div><br>
                </fieldset>
            </form>
            <div class="d-grid gap-2 col-6 mx-auto">
                <button class="btn btn-primary" type="button"><a href="index.jsp">Pagina De Inicio</a></button>
            </div>
            
        
        </div>
        <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    </body>
</html>