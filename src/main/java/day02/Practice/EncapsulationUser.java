package day02.Practice;

public class EncapsulationUser {
    private int id;
    private String name;
    private String password;
    private String emailId;
    
    // Set the names in get id
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    // Geting from user 
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getEmailId() {
        return emailId;
    }
}

