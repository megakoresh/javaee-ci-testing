/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolia.javaee1;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author staniss
 */
@Named(value = "managedBean")
@Dependent
public class MyManagedBean {

    /**
     * Creates a new instance of ManagedBean
     */
    public MyManagedBean() {
       
    }
    
    public String getMemes(){
        return "swag";
    }
    
}
