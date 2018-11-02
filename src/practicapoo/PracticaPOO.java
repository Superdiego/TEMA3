/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoo;
import java.util.Scanner;
/**
 *
 * @author DCP
 */
public class PracticaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaramos seis objetos de la clase Punto
        Punto p1,p2,p3,p4,p5,p6;
        
        //Imprimir el punto(3.0,4.0) con el método ImprimePunto
        p1=new Punto();
        p1.setX(3);
        p1.setY(4);
        p1.ImprimePunto();
     
        //Imprimir cadena punto instanciado
        p2=new Punto(7,4);
        String puntoinstanciado=p2.CadenaPunto();
        System.out.println(puntoinstanciado);
        
        //Utilizando toString
        p3=new Punto(p1);
        p3.setX(3);
        p3.setY(7);
        System.out.println (p3.toString());
        
        //Llamada al método "distancia"
        double distancia=Punto.distancia(p1, p2);
        System.out.println("La distancia entre "+p1+" y "+p2+" es de "+distancia+ " unidades");
        
        //Creamos tres puntos introducidos por teclado
        p4=new Punto();
        p5=new Punto();
        p6=new Punto();
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduzca primer punto (X)=  ");
        double A=0;
        A= sc.nextDouble();
        p4.setX(A);
        System.out.print("Introduzca primer punto (Y)=  ");
        double B=0;
        B= sc.nextDouble();
        p4.setY(B);
        System.out.println("");
        System.out.print("Introduzca segundo punto (X)=  ");
        double C=0;
        C= sc.nextDouble();
        p5.setX(C);
        System.out.print("Introduzca segundo punto (Y)=  ");
        double D=0;
        D= sc.nextDouble();
        System.out.println("");
        p5.setY(D);
        System.out.print("Introduzca tercer punto (X)=  ");
        double E=0;
        E= sc.nextDouble();
        p6.setX(E);
        System.out.print("Introduzca tercer punto (Y)=  ");
        double F=0;
        F= sc.nextDouble();
        p6.setY(F);
        
        
        
        //Llamada al método ImprimeArea
        String totalarea=Punto.ImprimeArea(p4,p5,p6);
        System.out.println(totalarea);
        
       
        //double areatriangulo ()
      }
    
  
}
