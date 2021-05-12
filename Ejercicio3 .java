import  java.util.Scanner ;
class  Resolucion3AGVM {
 entrada de escáner estático = nuevo  escáner ( System . in);
public  static  void  main ( String [] args ) {

int sexo;
int edades;

Sistema . fuera . println ( " Si es hombre (1), Si es mujer (2) " );
sexo = entrada . nextInt (); // tengo resultados 1-2

if (sexo >   0   && sexo < 3 ) { // validando si eres o no eres
   Sistema . fuera . println ( " ¿cuántos años tiene? " );
  edades = entrada . nextInt (); // tengo resultados 1-100

  if (edades >  0  && edades <  16 ) {
  Sistema . fuera . println ( " su vacuna es de tipo A " );
  }

  if (edades >  15  && edades <  70 ) {

      si (sexo ==  1 ) {
      Sistema . fuera . println ( " su vacuna es de tipo A " );
      }

      si (sexo ==  2 ) {
        Sistema . fuera . println ( " su vacuna es de tipo B " );
      }

  }
  if (edades > 70 ) { // ¿?
  Sistema . fuera . println ( " su vacuna es de tipo C " );
  }

} más {
  Sistema . fuera . println ( " opcion no encontrada " );
}
}
}