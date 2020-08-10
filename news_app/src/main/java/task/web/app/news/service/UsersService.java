/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.web.app.news.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import task.web.app.news.entity.UsersEntity;
import task.web.app.news.repo.UserRepo;

/**
 *
 * @author mostafa
 */
@Service
public class UsersService {
    @Autowired
   private  UserRepo  userRepo;
    
   

  

    public UsersEntity addUser(UsersEntity usersEntity) {
        return userRepo.save(usersEntity);
    }

    public UsersEntity updateUser(UsersEntity usersEntity) {
        return userRepo.save(usersEntity);
    }
     public void removeUser(int id) {
        userRepo.deleteById(id);
    }

   
    
    
    
}
