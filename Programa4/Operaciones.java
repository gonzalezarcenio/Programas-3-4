/**
        FECHA MIERCOLES 8 DE JULIO DEL 2019
 	INSTITUTO TECNOL�ICO SUPERIOR RUMI�AHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : SUMA DE N NUMEROS
 	MATERIA : PROGRAMACION VISUAL
 	NIVEL : CUARTO DE SISTEMAS NOCTURNO
 */
public class Operaciones {
   private int numero;

    public Operaciones(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
   
   public int sumarV(int numero){
       
       int suma=0;
       for (int i = 0; i <=numero; i++) {
           suma=suma+i;
           
       }
       return suma;
       
   }
}
