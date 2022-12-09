import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ListeP_JavaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListeP_JavaTest
{
    /**
     * Default constructor for test class ListeP_JavaTest
     */
    public ListeP_JavaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void test() throws ListeVideException{
        ListeP_Java liste = new ListeP_Java();
        assertEquals(0,liste.longueur());
        //System.out.print(liste.longueur());
        
        liste.cons("pierre");
        liste.cons("hayek");
        
        if(liste.longueur() > 0){
            //System.out.print(liste.car()); //last Element    
        }else{
            assertEquals(0,liste.longueur());
        }
        
        if(liste.longueur() > 0){
            //System.out.print(liste.toString());
            //liste.cdr();    
            //System.out.print(liste.toString());
        }else{
            assertEquals(0,liste.longueur());
        }
        
        ListeP_Java liste2 = new ListeP_Java();
        liste2.cons("charbel");
        liste2.cons("hayk");
        
        //liste.conc(liste2);
        //System.out.print(liste);
        
        //System.out.print(liste.toString());
        //liste.renverse();
        //System.out.print(liste.toString());
        
        //System.out.println(liste.membre("pierre"));
        //System.out.println(liste.membre("charbel"));
        //System.out.print(liste.membre("hayek"));
        
        ListeP_Rec listeR = new ListeP_Rec();
        listeR.cons("pierre");
        listeR.cons("hayek");
        
        //System.out.println(liste.toString());
        //System.out.println(listeR.toString());
        //System.out.print(liste.equals2(listeR));
        
        ListeP_Java listC1 = new ListeP_Java();
        listC1.cons("pierre");
        listC1.cons("hayek");
        
        //ListeP_Java listC2 = listC1;
        //listC2.cdr();
        
        ListeP_Java listC3 = new ListeP_Java();
        listC3.cons("pierre");
        listC3.cons("hayek");
        listC3.cdr();
        
        System.out.print(listC1);
        
        
    }
    
}
