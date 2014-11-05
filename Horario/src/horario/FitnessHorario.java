/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import unalcol.optimization.OptimizationFunction;

/**
 *a
 * @author Jonatan
 */
public class FitnessHorario extends OptimizationFunction<Horario>{
    protected int[] env;
    public FitnessHorario(){
        //env = _env;
    }
    
    public Double apply( Horario g ){
        double f = 0.0;
        
        Boolean[] out = g.getClase();
        String[] nombreClase = g.getNombreClase(); 
        for( int i=0; i<out.length; i++){
        	
            if(out[i]){
            	if(i==out.length-1){
            		break;
            	}
            	for (int j = 0; j < nombreClase.length; j++) {
            		if(nombreClase[i].equals(nombreClase[j])){
                		f++;
                	}	
				}
            	
            }
        }
        //TODO--- EN EL MISMO DIA NO PUEDE HABER LA MISMA CLASE
        
        System.out.println("fitness " + f);
        return f;
    }
}
