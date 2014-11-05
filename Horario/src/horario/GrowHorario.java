/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import com.sun.org.apache.xpath.internal.operations.Bool;

import unalcol.evolution.GrowingFunction;
import unalcol.types.collection.bitarray.BitArray;

/**
 *
 * @author Jonatan
 */
public class GrowHorario extends GrowingFunction<BitArray, Horario>{
  /**
   * Generates a thing from the given genome
   * @param genome Genome of the thing to be expressed
   * @return A thing expressed from the genome
   * 
   */
	
	int tamGen=10, tamNombreClase=5, tamNombreSalon=4;
	
  public Horario get(BitArray genome) {
      int s = genome.size()/10;
      
      Boolean[] clase = new Boolean[s];
      String[] nombreClase=new String[s], salon=new String[s];
      
       String nombre = "";
       String nombreSalon = "";
       System.out.println(genome);
      for( int i=0; i<clase.length; i++ ){
    	    
            clase[i] = genome.get((i*tamGen)+tamNombreClase);
            
            for (int j = 0; j < tamNombreClase; j++) {
            	if(genome.get(i*tamGen+j)){
            		nombre = nombre + "1";	
            	}else{
            		nombre = nombre + "0";
            	}
    			
    		}
            nombreClase[i] = nombre;
            
            for (int j = (tamNombreClase+1); j < tamGen; j++) {
            	if(genome.get(i*tamGen+j)){
            		nombreSalon = nombreSalon + "1";	
            	}else{
            		nombreSalon = nombreSalon + "0";
            	}
    			
    		}
            salon[i] = nombreSalon;
      
      
        
      }
/*      System.out.println(clase[0]);
      System.out.println(nombreClase[0]);
      System.out.println(salon[0]);
  */    return new Horario(clase, nombreClase, salon); 
  }

  /**
   * Generates a genome from the given thing
   * @param thing A thing expressed from the genome
   * @return Genome of the thing
   */
  @Override
  public BitArray set(Horario thing) {
     // int size = thing.T.length*6;
      BitArray ans = new BitArray(300, true);
      int k = 0;
      for(int i = 0; i < thing.getClase().length; i++){
        
           
            
            for (int j = 0; j < thing.getSalon()[i].length(); j++) {
            	String asd = thing.getSalon()[i];
            	char cad[];
            	cad = asd.toCharArray();
            	if(cad[j]=='1'){
            		 ans.set(k, true);
                     k++;	
            	}else{
            		 ans.set(k, false);
                     k++;
            	}
			}
            ans.set(k, thing.getClase()[i]);
            k++;
            for (int j = 0; j < thing.getNombreClase()[i].length(); j++) {
            	String asd = thing.getNombreClase()[i];
            	char cad[];
            	cad = asd.toCharArray();
            	if(cad[j]=='1'){
            		 ans.set(k, true);
                     k++;	
            	}else{
            		 ans.set(k, false);
                     k++;
            	}
			}

      }
      
      return ans; 
  }
    
}
