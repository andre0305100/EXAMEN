paquete  Examen ;

import  java.util.Scanner ;
class  Ejercicio04 {
   escáner estático teclado = nuevo  escáner ( System . in);
  static  void  ejercicio04AGVM () {
    // Inicio
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
         
       } romper ;
      predeterminado : { System . fuera . println ( " Error en la introduccion de datos !!!! por favor vuelva a intertarl " ); } romper ;
     }
      // Datos de salida
      Sistema . fuera . println ( " Su resultado es: " + resultado +  " \ n Y la operacion realizada es: " + operacion);
      }
      
      public  static  void  main ( String [] arg ) {
      ejercicio04AGVM ();
      }
      }