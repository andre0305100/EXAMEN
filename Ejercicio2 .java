import  java.util.Scanner ;
class  Resolucion2 {
 entrada de escáner estático = nuevo  escáner ( System . in);
public  static  void  main ( String [] args ) {

int salario;
int puntos;

flotador bono1;
flotador bono2;
flotador bono3;
Sistema . fuera . println ( " ¿cual es el monto del salario? " );
salario = entrada . nextInt (); // 1000

Sistema . fuera . println ( " ¿cuántos puntos obtuviste el profesor? " );
puntos = entrada . nextInt (); // 151
  // si puntos es mayor que: 49 YY puntos es menor que: 101 ENTONCES
if (puntos >  49   &&   puntos <  101 ) {
bono1 = ( 10f / 100f ) * salario;
Sistema . fuera . println ( " el bono es: " + bono1);
}

if (puntos >  100   &&   puntos <  151 ) {
bono2 = ( 40f / 100f ) * salario;
Sistema . fuera . println ( " el bono es: " + bono2);
}

if (puntos >  150 ) {
bono3 = ( 70f / 100f ) * salario;
Sistema . fuera . println ( " el bono es: " + bono3);

}


}