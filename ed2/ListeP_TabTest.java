

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ListeP_TabTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListeP_TabTest
{
    /**
     * Default constructor for test class ListeP_TabTest
     */
    public ListeP_TabTest()
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
    public void test() throws ListeVideException
    {
        ListeP_Tab listeTab = new ListeP_Tab();
        listeTab.cons("pierre");
        listeTab.cons("georges");
        listeTab.cons("hayek");
        
        assertEquals("hayek",listeTab.car());
        
        //System.out.print(listeTab.toString());
        //System.out.print(listeTab.car());
        //listeTab.cdr();
        //System.out.print(listeTab.toString());
        //System.out.println();
        
        //assertEquals(3, listeP_T2.longueur());
        
        
        ListeP_Tab listeTab2 = new ListeP_Tab();
        listeTab2.cons("pierre");
        listeTab2.cons("georges");
        listeTab2.cons("hayek");
        assertEquals("hayek", listeTab2.car());
        //System.out.print(listeTab2.toString());
        
        //listeTab.conc(listeTab2);
        //System.out.print(listeTab);
        
        //System.out.print(listeTab);
        //listeTab.renverse();
        //System.out.println();
        //System.out.print(listeTab);
        
        //System.out.print(listeTab.membre("pierre"));
        //System.out.print(listeTab.membre("pierrea"));
        
        //System.out.print(listeTab.iterator().hasNext());
        
        
        ListeP_Tab listC1 = new ListeP_Tab();
        listC1.cons("pierre");
        listC1.cons("hayek");
        
        //ListeP_Tab listC2 = listC1;
        //listC2.cdr();
        
        ListeP_Tab listC3 = new ListeP_Tab();
        listC3.cons("pierre");
        listC3.cons("hayek");
        listC3.cdr();
        
        System.out.print(listC1.toString());
        
    }
}




