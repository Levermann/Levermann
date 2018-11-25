/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.levermannanalyse;
 
public class Unternehmen {
 
private int id;
private float jahresueberschuss;
private float eigenkapital;
 
public int id(){
    return id;
}
 
public void setid (int id) {
    this.id = id;
}
 
public float jahresueberschuss(){
    return jahresueberschuss;
}
 
public void setjahresueberschuss (float jahresueberschuss) { //Jahresüberschuss
    this.jahresueberschuss = jahresueberschuss;
}
 
public float eigenkapital(){
     
    return eigenkapital;
}
 
public void seteigenkapital (float eigenkapital) { // Eigenkapital
    this.eigenkapital = eigenkapital;
}
 
}