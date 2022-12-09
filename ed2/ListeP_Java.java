import java.util.*;

public class ListeP_Java extends ListePointAbstract implements Cloneable
{
    private int lg;
    private LinkedList liste = new LinkedList();
    
    public Object clone() throws CloneNotSupportedException{
      return super.clone();  
    }
    
    
    public Object car() throws ListeVideException{
        if(longueur() > 0){
            return liste.getFirst();    
        }else{
            throw new ListeVideException("Liste vide");
        }
    }
    
    public void cdr() throws ListeVideException{
        if(longueur() > 0){
            liste.removeFirst();
            lg--;    
        }else{
            throw new ListeVideException("Liste vide");
        }
    }
    
    public void cons(Object objet){
        liste.addFirst(objet);
        lg++;
    }
    
    
    public void conc(ListePointInterface li) throws ListeVideException {
        if(!listeVide() && li.longueur() > 0){
            //liste.addLast(li);
            ListeP_Java lst = ((ListeP_Java)li);
            while(lst.longueur() > 0){
                liste.add(lst.car());
                lst.cdr();
            }
        }else{
            return;
        }
    }
    
    public void renverse(){
        LinkedList lst = new LinkedList();
        while(!listeVide()){
            lst.push(liste.pollLast());
        }
        
        while(lst.size() != 0){
            liste.push(lst.pop());
        }
    }
    
    public boolean membre(Object objet){
        if(!listeVide()){
            return liste.contains(objet);
        }else{
            return false;    
        }
    }
    
    public boolean listeVide(){
        return liste.isEmpty();
    }
    
    public int longueur(){
        return liste.size();
    }
    
    public Iterator<Object> iterator(){
        return this.liste.iterator();
    }
    
    public String toString(){
        return liste.toString();
    }
    
    public boolean equals(Object obj){
        return liste.equals((ListePointInterface)obj);
    }
    
    //public boolean equals2(Object obj) throws ListeVideException {
        //if(longueur() == ((ListePointInterface)obj).longueur()){
            //ListeP_Java lstTst1 = this;
            //while(lstTst1.longueur() > 0){
              //System.out.println(lstTst1.car());
              //System.out.println(((ListePointInterface)obj).car());
              //  if(lstTst1.car().equals(((ListePointInterface)obj).car())){
              //      continue;
              //  }else{
              //      return false;
              //  }
            //}
            //return true;
        //}
        //return false;
    //}
    
}
