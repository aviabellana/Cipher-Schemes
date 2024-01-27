/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CipherSchemes_Abellana;

/**
 *
 * @author ANONYTRIX
 */
public class DataItem {
 int data;
    int getItem;
    
    DataItem(){
        data=0;
    }
    
    DataItem(int d){
        data=d;
    }
    
    DataItem (DataItem Item){
        data = Item.data;
    }
    
    public void copyDataItem(DataItem Item){
        this.data = Item.data;
    }
    
    public void setItem(int data){
        this.data = data;
    }
    
    public DataItem getDataItem(){
        return this;
    }
    
    public int getItem(){
        return data;
    }
    
    public boolean equal(DataItem Item){
        return this.data==Item.data;
    }
    
    @Override
    public String toString(){
        return data + "";
    }   
}
