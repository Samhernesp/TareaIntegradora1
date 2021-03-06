package model;

import java.io.Serializable;

public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
    private String password;

    public Admin(String id, String password){
        this.id=id;
        this.password=password;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return "Id:" + id + "\nPassword" + password;

    }
    
}
