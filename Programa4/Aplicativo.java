import java.util.Scanner;

/**
        FECHA MIERCOLES 8 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : SUMA DE N NUMEROS
 	MATERIA : PROGRAMACION VISUAL
 	NIVEL : CUARTO DE SISTEMAS NOCTURNO
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numero=0,valor;
        Operaciones obj1=new Operaciones(numero);
        
        numero=obj1.getNumero();
       
        System.out.println("Diguite un numero  entero : ");
        numero=entrada.nextInt();
        
        valor=obj1.sumarV(numero);
        System.out.println("la suma es "+valor);
      
    }
    
}
