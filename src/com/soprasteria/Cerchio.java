package com.soprasteria;

public class Cerchio implements Poligoni {
	 public final float raggio;
	    
	    
	    public Cerchio (float raggio) {
	        this.raggio = raggio;
	    }
	    
	    
	    
	    public float calcoloArea() {
	        return (float) (raggio*raggio*3.14);
	    }
	    
	    
	    public float calcoloPerimetro() {
	        return (float) (raggio*2*3.14);
	    }
}
