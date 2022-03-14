package model;

import java.io.Serializable;

public class Seat implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private int row;
    private int column;
    private Spectator spectator;

    public Seat(int row, int column){
    	this.row = row;
    	this.column = column;
    }
    
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }    
    
    public boolean isAvailable() {
    	return (spectator==null);
    }
    
    public Spectator getSpectator() {
		return spectator;
	}

	public void setSpectator(Spectator spectator) {
		this.spectator = spectator;
	}

}
