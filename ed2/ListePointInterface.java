public interface ListePointInterface 
{
    Object car() throws ListeVideException;
    void cdr() throws ListeVideException;
    public void cons(Object obj);
    public void conc(ListePointInterface lst) throws ListeVideException;
    public void renverse();
    public boolean membre(Object objet);
    public boolean listeVide();
    public int longueur();
}

//class ListeVideException extends Exception{
//        public ListeVideException(String m){super(m);}
//   }






