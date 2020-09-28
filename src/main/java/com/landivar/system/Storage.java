/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.landivar.system;

import com.landivar.beans.UserBean;

/**
 *
 * @author victo
 */
public class Storage {
    
    private static Storage _instance = null;
    
    public static Storage Instance(){ 
        if(_instance == null){
            _instance = new Storage();
            return _instance;
        }else {
            return null;
        }
    }
    
    public UserBean user = new UserBean();
}
