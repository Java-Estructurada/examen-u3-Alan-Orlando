 import java.util.Scanner;

 public class solucionU3{

    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

    int opc=0;

     while (opc != 3) {
    
    System.out.println();
    System.out.println("-----Sistema de Auditoria Tech-----");
    System.out.println("1. Auditar Facturas");
    System.out.println("2. Calculadora de Impuestos");
    System.out.println("3. Cerrar Turno");

    System.out.print("Elige una opcion: ");
    opc =scan.nextInt();
    
     int ttCobrado=0, suma=0;   
    if (opc == 1) {
       
    System.out.print("¿Cuantas Facturas se emitieron durante el dia? :");
    int facalDia =scan.nextInt() ;

    /*Primera opcion */
    for (int i = 0; i < facalDia; i++){
    System.out.print("Monte de la Factura: ");
    ttCobrado =scan.nextInt();
    suma = suma + ttCobrado;
    }   
    System.out.println("Corte de caja Total: "+ suma);
    }
    
    if (opc == 2) {

    System.out.print("Escribe el precio bruto de un coponente: ");
    int pBrutoC = scan.nextInt();
    } else {
        
    }

   
       
       
        
    }  
    }
   





     /* while (x == 1) {

   System.out.print("¿Cuantas Facturas se emitieron durante el dia? :");
    int facalDia =scan.nextInt() ;

    for (int i = 0; i <= facalDia; i++){

    System.out.print("Total cobrado: ");
    int ttCobrado =scan.nextInt();
    int suma = ttCobrado + suma;
    System.out.println("Corte de caja Total: "+ suma);
    }
    
        
    }*/
    }


