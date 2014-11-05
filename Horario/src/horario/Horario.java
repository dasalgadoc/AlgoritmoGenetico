/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

/**
 *
 * @author Jonatan
 */
public class Horario {
   private Boolean[] clase;
    private String[] nombreClase;
    private String[] salon;
    
    public Horario( Boolean[] _clase, String[] _nombreClase, String[] _salon){
      setClase(_clase);
      setNombreClase(_nombreClase);
      setSalon(_salon);
      
    }
    
    public int[] simulate(int[] in ){
    	System.out.println("tamano " +in.length);
    	 /*int state = 0;
         int[] out_x = new int[in.length-1];
         for(int i=0; i<out_x.length; i++){
        	 clase[i]
             out_x[i] = out[state][in[i]];
             state = T[state][in[i]];
         }*/
         return null;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

	public Boolean[] getClase() {
		return clase;
	}

	public void setClase(Boolean[] clase) {
		this.clase = clase;
	}

	public String[] getNombreClase() {
		return nombreClase;
	}

	public void setNombreClase(String[] nombreClase) {
		this.nombreClase = nombreClase;
	}

	public String[] getSalon() {
		return salon;
	}

	public void setSalon(String[] salon) {
		this.salon = salon;
	}
}
