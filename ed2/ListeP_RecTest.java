

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ListeP_RecTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListeP_RecTest
{
    /**
     * Default constructor for test class ListeP_RecTest
     */
    public ListeP_RecTest()
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
        ListeP_Rec liste = new ListeP_Rec();
        liste.cons("pierre");
        liste.cons("hayek");
        //assertEquals(0,liste.longueur());
        //System.out.println(liste.longueur());
        //System.out.print(liste.listeVide());
        //System.out.print(liste.toString());
        //System.out.print(liste.car());
        //liste.cdr();
        //System.out.print(liste.longueur());
    
        ListeP_Rec liste2 = new ListeP_Rec();
        liste2.cons("docteur");
        liste2.cons("chadi");
        liste2.cons("kallab");
        //liste2.cons("pierre");
        //liste2.cons("hayek");
        
        //liste.conc(liste2);
        //System.out.println(liste2.toString());
        //liste2.renverse();
        //System.out.println(liste2.toString());
        
        //Object obj = "pierre";
        //System.out.println(liste.membre(obj));
        //System.out.println(liste2.membre(obj));
    
        //System.out.print(liste.equals(liste2));
        
        ListeP_Rec listC1 = new ListeP_Rec();
        listC1.cons("pierre");
        listC1.cons("hayek");
        
        //ListeP_Rec listC2 = listC1;
        //listC2.cdr();
        
        ListeP_Rec listC3 = new ListeP_Rec();
        listC3.cons("pierre");
        listC3.cons("hayek");
        
        listC3.cdr();
        
        System.out.print(listC1);
        
    }
    
}

