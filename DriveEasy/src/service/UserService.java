package service;

import model.User;
import util.FileUtil;
import java.util.*;

public class UserService {
    
    private ArrayList<User>users;

    public UserService()
    {
        users = FileUtil.loadFile("data/users.dat");
    }

    public void registerUser(User user)
    {
        for(User u : users)
        {
            if(u.getEmail().equals(user.getEmail()))
            {
                System.out.println("User Already Exists");
                return;
            }
        }

        users.add(user);
        FileUtil.saveData("data/users.dat", users);
    }


    public User loginUser(String email, String password)
    {
        for(User u : users)
        {
            if(u.getEmail().equals(email) && u.getPassword().equals(password))
                return u;
        }
        return null;
    }

    public User findUserById(String userId)
    {
        for(User u : users)
        {
            if(u.getUserId().equals(userId))
                return u;

        }
        return null;
    }
}
