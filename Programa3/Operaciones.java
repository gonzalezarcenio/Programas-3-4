/**
        FECHA LUNES 8 DE JULIO DEL 2019
 	INSTITUTO TECNOL�ICO SUPERIOR RUMI�AHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : GRADOS CELSIUS S FARENHEIT
 	MATERIA : PROGRAMACION VISUAL
 	NIVEL : CUARTO DE SISTEMAS NOCTURNO
 */
public class Operaciones {
    private float gradosC;

    public Operaciones(float gradosC) {
        this.gradosC = gradosC;
    }

    public float getGradosC() {
        return gradosC;
    }

    public void setGradosC(float gradosC) {
        this.gradosC = gradosC;
    }
    
    public float calculo(float gradosC){
        float gradosF;
        gradosF=gradosC*1.8f+32;
        return gradosF;
    }
    
    
}
