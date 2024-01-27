/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CipherSchemes_Abellana;

/**
 *
 * @author avigracx
 */
public class DoublyLinkedList {
     DataItemChild head;  
     DataItemChild tail;
     int size;

    DoublyLinkedList(){
        makeEmpty();
    }
    
    public int size() {
        return size;
    }
    
    public void printList() {
        if (size>0){
        DataItemChild nav = head.getNext();
        System.out.println();
        
        while (nav != tail) {
            System.out.print(nav.getItem() + ", ");
            nav = nav.getNext();
        }
       }
         System.out.println();
    }
     public void makeEmpty() {
        head = new DataItemChild();
        tail = new DataItemChild();
        size = 0;
        head.setNext(tail);
        head.setPrevious(null);
        tail.setPrevious(head);
        tail.setNext(null);
    }
     
    public int findbyValue(DataItemChild dc) {
        if(size>0){
            int x=0, y=size-1;
            DataItemChild nav1 = head.getNext();
            DataItemChild nav2 = tail.getPrevious();
            while(x <= y){
                if(nav1.equals(dc)) return x;
                if(nav2.equals(dc)) return y;
               nav1 = nav1.getNext();
               nav2 = nav2.getPrevious();
               x++;
               y--;
            }
            if(nav1.getItem() == dc.getItem()) return x;
            else if (nav2.getItem() == dc.getItem()) return y;
            else return -1;
        }
        return -1;
    }

    public DataItemChild findbyIndex(int location) {
        if (size > 0 && location < size) {
            int x=0, y=size-1;
            DataItemChild nav1 = head.getNext();
            DataItemChild nav2 = tail.getPrevious();
            while (nav1 != nav2) {
                if (x == location) return nav1;
                if (y == location) return nav2;
                
                nav1 = nav1.getNext(); 
                nav2 = nav2.getPrevious();
                x++;
                y--;
            }
        }
        return null;  // Return null for invalid location.
    }

    public boolean insert(DataItemChild newdc, int location) {
        DataItemChild nav = findbyIndex(location);
        if(nav != null){
            newdc.setNext(nav);
            newdc.setPrevious(nav.getPrevious());
            nav.getPrevious().setNext(newdc);
            nav.setPrevious(newdc);
            size++;
            return true;
        }
        
        if(location == size){
            newdc.setNext(tail);
            newdc.setPrevious(tail.getPrevious());
            tail.getPrevious().setNext(newdc);
            tail.setPrevious(newdc);
            size++;
            return true;
        }
        return false;
    }

    public void insert(DataItemChild newdc) {
        insert(newdc, size);
    }

    public void delete(int index) {
        DataItemChild temp = findbyIndex(index);
        if (temp != null) {
            temp.getNext().setPrevious(temp.getPrevious());
            temp.getPrevious().setNext(temp.getNext());
        }
    }

    public void delete(DataItemChild dc) {
        int temp = findbyValue(dc);
            delete(temp);
        
    }


}
