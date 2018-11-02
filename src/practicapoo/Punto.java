/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoo;

/**
 *
 * @author DCP
 */
public class Punto {
    private double x, y;
    private static int contadorPuntos;
    
    //Constructor vacio
    Punto() {
      contadorPuntos++;
    }
   
    //Contructor que recibe los puntos
    Punto(double x, double y) {
      this.x=x;
      this.y=y;
      contadorPuntos++;
    }
    
    //Constructor copia
    Punto (Punto p){
        this.x=p.x;
        this.y=p.y;
        contadorPuntos++;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }
    
    /**         
    * @param y the y to set 
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @return the contadorPuntos
     */
    public static int getContadorPuntos() {
        return contadorPuntos;
    }
    
    //Distancia entre dos puntos    
    public static double distancia(Punto punto1, Punto punto2){
        double distancia=0;
        distancia=Math.sqrt(((punto1.getX()-punto2.getX())*(punto1.getX()-punto2.getX()))+
                ((punto1.getY()-punto2.getY())*(punto1.getY()-punto2.getY())));
        return distancia;
    }
        
    //Distancia entre de un punto sobre otro fijo 0,0  
    public static double distancia_puntofijo(Punto punto1){
        double distancia=0;
        distancia=Math.sqrt((punto1.getX()*punto1.getX())+(punto1.getY()*punto1.getY()));
        return distancia;
    }
    
    //Área de un triángulo formado por tres puntos
    public static double areatriangulo(Punto punto1, Punto punto2, Punto punto3){
        double distancia1=0;
        double distancia2=0;
        double distancia3=0;
        double p=0;
        double area=0;  
        
        distancia1=Math.sqrt(((punto1.getX()-punto2.getX())*(punto1.getX()-punto2.getX()))+
                ((punto1.getY()-punto2.getY())*(punto1.getY()-punto2.getY())));
        distancia2=Math.sqrt(((punto1.getX()-punto3.getX())*(punto1.getX()-punto3.getX()))+
                ((punto1.getY()-punto3.getY())*(punto1.getY()-punto3.getY())));
        distancia3=Math.sqrt(((punto2.getX()-punto3.getX())*(punto2.getX()-punto3.getX()))+
                ((punto2.getY()-punto3.getY())*(punto2.getY()-punto3.getY())));
       
        p=(distancia1+distancia2+distancia3)/2;
        
        area=Math.sqrt(p*(p-distancia1)*(p-distancia2)*(p-distancia3));
        
        return area;
    }

    //Imprimir punto
    public void ImprimePunto(){
        System.out.println("("+x+","+y+")");
    }
    
    //Imprimir sobre punto instanciado
     public String CadenaPunto(){
        String cadenapunto;
        cadenapunto="("+x+","+y+")";
        return cadenapunto;
    }

     //Mismo método con toString
     public String toString(){
         String metodotostring;
         metodotostring="("+x+","+y+")";
         return metodotostring;
     }
     
     //Método estático ImprimeArea
     public static String ImprimeArea(Punto punto1, Punto punto2, Punto punto3){
        String totalarea="";
        double distancia1=0;
        double distancia2=0;
        double distancia3=0;
        double p=0;
        double area=0;  
        
        distancia1=Math.sqrt(((punto1.getX()-punto2.getX())*(punto1.getX()-punto2.getX()))+
                ((punto1.getY()-punto2.getY())*(punto1.getY()-punto2.getY())));
        distancia2=Math.sqrt(((punto1.getX()-punto3.getX())*(punto1.getX()-punto3.getX()))+
                ((punto1.getY()-punto3.getY())*(punto1.getY()-punto3.getY())));
        distancia3=Math.sqrt(((punto2.getX()-punto3.getX())*(punto2.getX()-punto3.getX()))+
                ((punto2.getY()-punto3.getY())*(punto2.getY()-punto3.getY())));
       
        p=(distancia1+distancia2+distancia3)/2;
        
        area=Math.sqrt(p*(p-distancia1)*(p-distancia2)*(p-distancia3));
        
        totalarea="El total del área calculada del triángulo formado por los puntos "+punto1+", "+punto2+" y "+punto3+" cuyos lados miden "+distancia1+", "+distancia2+" y "+distancia3+" es de "+area+" unidades";
        
        return totalarea;
     }

}   