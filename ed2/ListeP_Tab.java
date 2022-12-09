import java.util.Iterator;
import java.util.Arrays;

public class ListeP_Tab extends ListePointAbstract implements Cloneable
{
  private Object[] tabImplantation;
  private int nbreElements;
  
  public Object clone() throws CloneNotSupportedException{
      return super.clone();  
  }
  
  public ListeP_Tab(){
      tabImplantation = new Object[3];
  }
  
  public Object car() throws ListeVideException{
      if(nbreElements > 0){
         return tabImplantation[nbreElements - 1];
      }else{
          throw new ListeVideException("list empty");
      }  
  }
  
  public void cdr() throws ListeVideException{
      if(nbreElements > 0){
          tabImplantation[nbreElements - 1] = null;
          nbreElements--;
      }else{
          throw new ListeVideException("list empty");
      }
  }
  
  public void cons(Object objet){
      tabImplantation[nbreElements] = objet;
      nbreElements++;
  }
  
  public void conc(ListePointInterface lst){
      Object[] tabImp = new Object[longueur()+lst.longueur()];
      System.arraycopy(((ListeP_Tab)lst).tabImplantation,0,tabImp,0,lst.longueur());
      System.arraycopy(tabImplantation,0,tabImp,lst.longueur(),longueur());
      nbreElements = nbreElements + lst.longueur();
      tabImplantation = tabImp;
  }
  
  public void renverse(){
      if(nbreElements != 0 && nbreElements != 1){
            Object[] temp = new Object[nbreElements];
            for(int i = 0 ; i < nbreElements ; i++){
                temp[i] = tabImplantation[nbreElements - 1 - i];
            }
            tabImplantation = temp;
      }  
  }
  
  public boolean membre(Object objet){
      if(objet instanceof Object){
         for(int i = 0 ; i < nbreElements ; i++){
              if(tabImplantation[i].equals(objet)){
                  return true;
              }
          }
          return false;
      }else{
          return false;
      }
  }
  
  
  public boolean listeVide(){
      return nbreElements == 0;
  }
  
  public int longueur(){
      return nbreElements;
  }
  
  public String toString(){
      if(nbreElements == 0) return "[]";
      String s = "[";
      for(int i = nbreElements - 1 ; i > 0 ; i--){
          s += tabImplantation[i].toString() + ",";
      }
      return s + tabImplantation[0] + "]";
  }
  
  public boolean equals(Object liste){
      if(!(liste instanceof ListePointInterface)){
          return false;
      } 
      
      if(nbreElements != ((ListePointInterface)liste).longueur()){
            return false;
      }
      
      for(int i = 0 ; i < nbreElements ; i++){
            if(!(((ListePointInterface)liste).membre(tabImplantation[i]))){
                return false;
            }
      }
      return true;
  }
  
  //public Iterator iterator(){
    //return this.iterator();
  //}
  
  public Iterator<Object> iterator(){
        return new Iterator<Object>(){
            Iterator<Object> it = Arrays.asList(tabImplantation).iterator();
            public boolean hasNext(){
                if(it != null){
                    return true;
                }
                return false;
               }
               public Object next(){
                   if(hasNext()){
                       return it.next();     
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


