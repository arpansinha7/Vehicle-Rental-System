package model;
import java.io.*;
public class User implements Serializable{
    
    private String userId;
    private String name;
    private String email;
    private String password;

    public User(String userId, String name, String email, String password)
    {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getUserId()
    {
        return userId;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPassword()
    {
        return password;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String toString()
    {
        return "User Id: " + userId + "Name: "+name+"\nEmail id: "+email;
    }

}
