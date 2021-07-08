/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;

/**
 *
 * @author phamt
 */
public class Listcandidates {
    ArrayList<candidates> list;
    public Listcandidates(){
        list= new ArrayList();
        
    }
    public boolean Add(candidates S){
        return list.add(S);
    }
    public boolean Display(){
        if(list.isEmpty()) return false;
        for(int i=0; i<list.size(); i++) list.get(i).out();
        return true;
    }
    /// find staff by id
    public int Find(String id){
        for(int i=0; i<list.size(); i++ ) if ( list.get(i).getId().compareTo(id)==0) return i;
            return -1;
    }
    /// SearchStaff by ID tra ve Staff
    public candidates Search(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().compareTo(id)==0) {
                return list.get(i);
            }
        }
        return null;
    }
    //Update by ID Staff
    public boolean UpdateStaff(String id){
        candidates tmp = Search(id);
        if (tmp==null) return false;
        tmp.setId(id);
        tmp.input();
     return true;   
    }
    public boolean Remove(String id){
        candidates tmp= Search(id);
        if(tmp==null) return false;
        return list.remove(tmp);
    }
    
    
}
