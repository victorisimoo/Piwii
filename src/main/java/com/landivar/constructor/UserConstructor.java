/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.landivar.constructor;

import com.landivar.beans.UserBean;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author victo
 */
public class UserConstructor {
    
    public UserBean getUserByUsername(String username) throws FileNotFoundException, IOException, ParseException{
        UserBean searchUser;
        //Evaluación de la existencia de la carpeta
        File directory = new File("C:\\MEIA\\");
        if(!directory.exists()){
            directory.mkdir();
            System.out.println("El usuario no existe debido a que la carpeta no existe");
            return null;
        }else {
            File file = new File("C:\\MEIA\\usuarios.txt");
            if(file.exists()){
                FileReader reader = new FileReader(file);
                BufferedReader bffer = new BufferedReader(reader);
                String lineReader;
                while((lineReader = bffer.readLine())!= null){
                   searchUser = new UserBean();
                   String parts[] = lineReader.split("\\|");
                   if(parts[0].equals(username)){
                       searchUser.setUsername(parts[0]);
                       searchUser.setName(parts[1]);
                       searchUser.setLastname(parts[2]);
                       searchUser.setPassword(parts[3]);
                       searchUser.setRolUser(Integer.parseInt(parts[4]));
                       searchUser.setBirth(parts[5]);
                       searchUser.setMail(parts[6]);
                       searchUser.setPhone(parts[7]);
                       searchUser.setPathPhoto(parts[8]);
                       searchUser.setStatus(Integer.parseInt(parts[9]));
                       return searchUser;
                   }
                }
            }else {
                System.out.println("El usuario no existe debido a que el archivo no existe");
            }
        }
        return null;
    }
    
    public UserBean loginUser(String username, String password){
    
        return null;
    }
    
        
    
        
}
