/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.levermannanalyse;
 
public class Unternehmen {
 
private int id;
private String name;
private float jahresueberschuss;
private float eigenkapital;

public Unternehmen (){
}

public Unternehmen (int id, String name, float jahresueberschuss, float eigenkapital){
    
    this.id= id;
    this.name= name;
    this.eigenkapital= eigenkapital;
    this.jahresueberschuss = jahresueberschuss;
}

public int getid(){
    return id;
}
 
public void setid (int id) {
    this.id = id;
  }

public String getname(){
    return name;
}
 
public void setname (String name) {
    this.name = name;
  }
    
 
public float getjahresueberschuss(){
    return jahresueberschuss;
}
 
public void setjahresueberschuss (float jahresueberschuss) { //Jahresüberschuss
    this.jahresueberschuss = jahresueberschuss;
}
 
public float geteigenkapital(){
     
    return eigenkapital;
}
 
public void seteigenkapital (float eigenkapital) { // Eigenkapital
    this.eigenkapital = eigenkapital;
}
    
 @Override
    public String toString() {
        return "Unternehmen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jahresueberschuss='" + jahresueberschuss + '\'' +
                ", eigenkapital='" + eigenkapital + '\'' +'}';
    }




}