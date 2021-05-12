paquete  Examen ;

import  java.util.Scanner ;
class  Ejercicio05 {
   escáner estático teclado = nuevo  escáner ( System . in);
  static  void  ejercicio05AGVM () {
    // Inicio
    Sistema . fuera . println ( " Hola bienvenido " );
    // Datos de entrada
    Opción de cuerda ;
    Sistema . fuera . println ( " Por favor elija el a ejecutar, escriba la letra proceso correspondiente: \ n A = Calcular promedio de Fundamentos de Programacion \ n B = Bono de profesores de acuerdo al salario mínimo y puntos obtenidos \ n C = Proceso de selección de vacuna \ n D = Calcular operaciones matematicas basicas con maximo de 2 constantes " );
    opcion = teclado . Siguiente();
    // Proceso
    cambiar (opcion . toUpperCase ()) {  
      caso  " A " : {
        Sistema . fuera . println ( " Buenos dias " );
        // DefinirVariables
        
        doble promedio, nota1, nota2, nota3, nota4 = 0 ;
        prueba {
        // Datos de entrada
        Sistema . fuera . println ( " Por favor ingrese su nota de la primera unidad: " );
        nota1 = teclado . nextDouble ();
        Sistema . fuera . println ( " Por favor ingrese su nota de la segunda unidad: " );
        nota2 = teclado . nextDouble ();
        Sistema . fuera . println ( " Por favor ingrese su nota de la tercera unidad: " );
        nota3 = teclado . nextDouble ();
        Sistema . fuera . println ( " Por favor ingrese la nota de su trabajo final: " );
        nota4 = teclado . nextDouble ();
        // Proceso
        promedio = (nota1 * 0.20 ) + (nota2 * 0.15 ) + (nota3 * 0.15 ) + (nota4 * 0.50 );
        Sistema . fuera . println ( " Su promedio en el curso de fundamentos de programacion es de: \ n " + promedio);
        } captura ( Excepción e) {
          Sistema . fuera . println ( " Error en el ingreso de datos !!! Por favor vuelva a intertarlo " );
        }
        } romper ;
      caso  " B " : {
        Sistema . fuera . println ( " Buenos dias " );
        // Definición de variables
        doble nota, salariominimo, bonototal;
        prueba {
        // Datos de entrada
        Sistema . fuera . println ( " Ingrese la nota obtenida: " );
        nota = teclado . nextDouble ();
        Sistema . fuera . println ( " Ingrese su salario mínimo: " );
        salariominimo = teclado . nextDouble ();
        // Proceso
        si (nota < 50 ) {
          bonototal = 0 ;
        } else  if (nota > = 50  && nota <= 100 ) {
          bonototal = salariominimo * 0,10 ;
        } else  if (nota > = 101  && nota <= 150 ) {
          bonototal = salariominimo * 0.40 ;
        } más {
          bonototal = salariominimo * 0.70 ;}
        Sistema . fuera . println ( " De acuerdo a la nota obtenida, su bono es de: " + bonototal);
        } captura ( Excepción e) {
          Sistema . fuera . println ( " Error en el ingreso de datos !!! \ n Por favor vuelva a intertarlo ... " );
        }
        } romper ;
      caso  " C " : {
        Sistema . fuera . println ( " Buenos días, bienvenido a la campaña de vacuancion " );
        // Introduccion de datos
        String sexo, vacuna;
        int años;
        prueba {  
        Sistema . fuera . println ( " Por favor introdusca en mayuscula la letra que defina su sexo: \ n A = Hombre \ n B = Mujer " );
        sexo = teclado . Siguiente();
        Sistema . fuera . println ( " Por favor introdusca su edad: " );
        años = teclado . nextInt ();
        // Proceso
        if (sexo . es igual a ( " A " ) && años > = 70 ) {
          vacuna = " C " ;
        } más  si (sexo . es igual a ( " B " ) && años > = 70 ) {
          vacuna = " C " ;
        } más  si (sexo . es igual a ( " A " ) && años <= 69  && años > = 16 ) {
          vacuna = " A " ;
        } else  if (sexo . equals ( " A " ) && años < 16 ) {
          vacuna = " A " ;
        } else  if (sexo . equals ( " B " ) && años < 16 ) {
          vacuna = " A " ;
        } más {
          if (sexo . equals ( " B " ) && años <= 69  && años > = 16 ) {
            vacuna = " B " ;
          } más {
            vacuna = " Error en la definición de sexo, por favor vuelva a intertarlo usando la letra mayuscula ... " ;
          }
          }
          Sistema . fuera . println ( " De acuerdo a los datos ingresados ​​usted recibió la vacuna tipo: " + vacuna);
          } captura ( Excepción e) {
          Sistema . fuera . println ( " Error en el ingreso de datos !!! \ n Por favor vuelva a intertarlo ... " );
          }
          } romper ;
      caso  " D " : {  
        Sistema . fuera . println ( " Hola, buenos dias " );
        // Introduccion de datos
        Operación de cuerdas ;
        doble numero1, numero2, resultado = 0 ;
        Sistema . fuera . println ( " Ingrese el primer digito a operar: " );
        numero1 = teclado . nextDouble ();
        Sistema . fuera . println ( " Ingrese el segundo digito a operar: " );
        numero2 = teclado . nextDouble ();
        Sistema . fuera . println ( " Ingrese el signo a operar: \ n Suma = + \ n Resta = - \ n Multiplicacion = * \ n Division = / \ n Potencia = ^ op " );
        operacion = teclado . Siguiente();
        // Proceso
        switch (operacion) {
          caso  " + " : {
            resultado = (numero1) + (numero2);
            operacion = " Suma " ;
            } romper ;
          caso  " - " : {
            resultado = (numero1) - (numero2);
            operacion = " Resta " ;
            } romper ;
          caso  " * " : {
            resultado = (numero1) * (numero2);
            operacion = " Multiplicacion " ;
            } romper ;
          caso  " / " : {
            resultado = (numero1) / (numero2);
            operacion = " División " ;
            } romper ;
          // Profesor lo hice asi, por que potencia es un proceso mas largo
          // No introducir resultados muy largos, solo uso el double.
          caso  " p " : {
            operacion = " Potencia " ;
            resultado = numero1;
            para ( doble i =  1 ; i < numero2; i ++ ) {
              resultado = resultado * numero1;
            }

            } romper ;
          caso  " ^ " : {
            operacion = " Potencia " ;
            resultado = numero1;
            para ( doble i =  1 ; i < numero2; i ++ ) {
              resultado = resultado * numero1;
            }
            
    
          // Datos de salida
          Sistema . fuera . println ( " Su resultado es: " + resultado +  " \ n Y la operacion realizada es: " + operacion);
          } romper ;
        predeterminado : { System . fuera . println ( " Error en la introduccion de datos !!!! \ n Por favor vuelva a intertarlo ... " );} break ;
        }
      }
  
  public  static  void  main ( String [] arg ) {

    ejercicio05AGVM ();
  }
}