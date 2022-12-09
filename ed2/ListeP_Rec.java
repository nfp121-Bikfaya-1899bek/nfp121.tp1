import java.util.*;

public class ListeP_Rec extends ListePointAbstract implements Cloneable
{
  private int lg;
  private Maillon elem;
  
  public Object clone() throws CloneNotSupportedException{
      return super.clone();  
  }
  
  
  public Object car() throws ListeVideException{
      if(lg > 0){
          return elem.valeur();      
      }else{
          throw new ListeVideException("liste vide");  
      }  
  }    
  
  public void cdr() throws ListeVideException{
      if(lg > 0){
          elem = elem.suite();
          lg--;      
      }else{
           throw new ListeVideException("liste vide"); 
      }
  }
  
  public void cons(Object obj){
        if(obj != null){
            if(!listeVide()){
                Maillon maill = new Maillon(obj);
                maill.modifSuite(elem);
                elem = maill;
                lg++;
            }else{
                Maillon maill = new Maillon(obj);
                elem = maill;
                lg++;
            }
        }else{
            return;
        }
  }
  
  public void conc(ListePointInterface liste){
        if(!liste.listeVide()){
            if(elem.suite() == null){
                elem.modifSuite(((ListeP_Rec)liste).elem);
            }else{
                Maillon nxt = elem;
                while(nxt.suite() != null){
                    nxt = nxt.suite();
                }
                nxt.modifSuite(((ListeP_Rec)liste).elem);    
            }
        }else{
            return ;
        }
  }
  
  public void renverse(){
      if(lg == 0){
            return;
      }else{
          if(lg == 1){
                this.elem = elem;
          }else{
              Maillon next = null,prev = null;
              while(this.elem != null){
                    next = this.elem.suite();
                    this.elem.modifSuite(prev);
                    prev = this.elem;
                    this.elem = next;
              }
              this.elem = prev;
            }
        }  
  }
  
  public boolean membre(Object obj){
      if(obj instanceof Object){
          while(elem != null){
              if(elem.valeur().equals(obj)){
                    return true;
              }else{
                  elem = elem.suite();  
              }
          }
          return false;      
      }else{
         return false;   
      }
  }
  
  public boolean listeVide(){
      return lg == 0;  
  }
  
  public int longueur(){
      return lg;  
  }
  
  public String toString(){
      String s = "[";
      if(lg == 0){
            return s;
      }else{ 
          while(elem != null){
                if(elem.suite() == null){
                    s+= elem.valeur();
                }else{
                    s+= elem.valeur()+", ";
                }
                elem = elem.suite();
          }
          s+= "]";
      }
      return s;
  }
  
  public boolean equals(Object obj){
        if(!(obj instanceof ListePointInterface)){
            return false;
        }
        
        if(lg != ((ListePointInterface)obj).longueur()){
           return false; 
        }
        
        while(elem != null && ((ListeP_Rec)obj).elem != null){
            if(!(elem.valeur()).equals(((ListeP_Rec)obj).elem.valeur())){
                return false;
            }
            elem = elem.suite();
            ((ListeP_Rec)obj).elem = ((ListeP_Rec)obj).elem.suite();
        }
        return true;
  }
  
  public Iterator<Object> iterator(){
        return new Iterator<Object>(){
            Maillon temp=elem;
            public boolean hasNext(){
                if(temp.suite() != null){
                    return true;
                }
                return false;
               }
               public Object next(){
                   if(hasNext()){
                       return temp.suite();     
                   }else{
                       return null;     
                   }
               }
               public void remove(){
                   throw new UnsupportedOperationException();
               }
           };
       }
}
  
  

 
