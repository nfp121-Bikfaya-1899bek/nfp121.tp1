class Maillon implements Iterable
{
   private Object valeur;
   private Maillon suite;
   
   
   public Maillon(Object valeur){
       this.valeur = valeur;
       this.suite = null;
   }
   
   public Maillon(Object valeur, Maillon suite){
       this.valeur = valeur;
       this.suite = suite;
   }
   
   
   public Object valeur(){
       return valeur; 
   }
   
   public Maillon suite(){
       return suite; 
   }
   
   
   public void modifSuite(Maillon m){
        suite = m;
   }
   
   public boolean equals(){
       return false; 
   }

   public String toString(){
       return ""; 
   }
   
   public java.util.Iterator iterator(){
    return new java.util.Iterator(){
        Maillon temp = new Maillon(valeur, suite);
        public boolean hasNext(){
            return false;
        }
        
        public Object next(){
            return null;
        }
        
        public void remove(){
            throw new UnsupportedOperationException();
        }
    };
}
   
}