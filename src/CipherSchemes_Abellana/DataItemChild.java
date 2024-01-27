/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CipherSchemes_Abellana;

/**
 *
 * @author avigracx
 */
public class DataItemChild extends DataItem{
    
     DataItemChild next;
     DataItemChild previous;
    
    DataItemChild(){
        super();
        next = null;
        previous = null;
    }
    
    DataItemChild (int data){
        super(data);
        next = null;
        previous = null;
    }
    
    DataItemChild (int data, DataItemChild n, DataItemChild p){
        super(data);
        next = n;
        previous = p;
    }
    
    DataItemChild(DataItemChild dc){
        this.setItem(dc.getItem());
        next = dc.getNext();
        previous = null;
    }
    
    public void setNext(DataItemChild n){
        next = n;
    }
    
    public void setPrevious(DataItemChild p){
        previous = p;
    }
    
    public DataItemChild getNext(){
        return next;
    }
    
    public DataItemChild getPrevious(){
        return previous;
    }
      
}
