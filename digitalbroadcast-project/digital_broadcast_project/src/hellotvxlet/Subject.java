/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class Subject implements SubjectInterface{
    
    ArrayList subscribers=new ArrayList();

    public void register(ObserverInterface ob) {
        subscribers.add(ob);
    }

    public void unregister(ObserverInterface ob) {
        subscribers.remove(ob);
    }
    
    public void update_observers(int index){
        System.out.println("update_observers");
        for(int i = 0; i < subscribers.size(); i++){
             ((ObserverInterface)subscribers.get(i)).update(index);
        }
    }

}
