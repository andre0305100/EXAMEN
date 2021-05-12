import  java.util.Scanner ;
class  Ejercicio01 {
   escáner estático teclado = nuevo  escáner ( System . in);
  static  void  ejercicio01AGVM () {
    // Inicio
    Sistema . fuera . println ( " Buenos dias " );
    // Definir Variables
    
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
  }
  public  static  void  main ( String [] arg ) {
  ejercicio01AGVM ();
  }

  }