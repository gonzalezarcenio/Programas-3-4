import java.util.Scanner;

/**
        FECHA LUNES 8 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : GRADOS CELSIUS S FARENHEIT
 	MATERIA : PROGRAMACION VISUAL
 	NIVEL : CUARTO DE SISTEMAS NOCTURNO
 
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
           float gradosC=0,valor;
        Operaciones obj1= new Operaciones(gradosC);
        
        gradosC=obj1.getGradosC();
        
        System.out.println("Diguite grados celsius : ");
        gradosC=entrada.nextFloat();
        
        valor=obj1.calculo(gradosC);
        System.out.println("grados Faenhet:"+valor);
        
        
        
    }
    
}
