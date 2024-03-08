import student.micro.*;
import student.micro.jeroo.*;
import static student.micro.jeroo.CompassDirection.*;
import static student.micro.jeroo.RelativeDirection.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Testing class for CopyingJeroo
 *
 *  @author Taruni Addanki (tarunia)
 *  @version (2021.10.11)
 */
public class CopyingJerooTest
    extends TestCase
{
    //~ Fields ................................................................
    private Island island;
    private CopyingJeroo jeroo;
    private Jeroo copier;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new CopyingJerooTest test object.
     */
    public CopyingJerooTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        island = new DualIsland();
        copier = new Jeroo(1000);
        jeroo = new CopyingJeroo(copier);
        island.addObject(jeroo, 1, 1);
        island.addObject(copier, 10, 1);
    }


    // ----------------------------------------------------------
    /**
     * Check hopToWater(), assuming that setUp() places the
     * jeroo at (1, 1) facing east.
     */
    public void testHopToWater()
    {
        //1.call method
        jeroo.hopToWater();
        //2.check results
        assertThat(jeroo.getX()).isEqualTo(8);
        assertThat(jeroo.seesWater(AHEAD)).isTrue();
        assertThat(copier.getX()).isEqualTo(17);
        assertThat(copier.seesWater(AHEAD)).isTrue();
    }
    /**
     * Check turnRight(), assuming that setUp() places the
     * jeroo at (1, 1) facing east.
     */
    public void testTurnRight()
    {
        //1.call method
        jeroo.hopToWater();
        jeroo.turnRight();
        //2.check results
        assertThat(jeroo.getY()).isEqualTo(2);
        assertThat(jeroo.isFacing(WEST)).isTrue();
        assertThat(copier.getY()).isEqualTo(2);
        assertThat(copier.isFacing(WEST)).isTrue();
    }
    /**
     * Check turnLeft(), assuming that setUp() places the
     * jeroo at (1, 1) facing east.
     */
    public void testTurnLeft()
    {
        //1.call method
        jeroo.hopToWater();
        jeroo.turnRight();
        jeroo.hopToWater();
        jeroo.turnLeft();
        //2.check results
        assertThat(jeroo.getY()).isEqualTo(3);
        assertThat(jeroo.isFacing(EAST)).isTrue();
        assertThat(copier.getY()).isEqualTo(3);
        assertThat(copier.isFacing(EAST)).isTrue();
    }
    /**
     * Check checkForFlower(), assuming that setUp() places the
     * jeroo at (1, 1) facing east.
     */
    public void testCheckForFlower()
    {
        //1.call method
        jeroo.checkForFlower();
        //2.check results
        assertThat(jeroo.getX()).isEqualTo(1);
        assertThat(jeroo.getY()).isEqualTo(1);
        assertThat(copier.seesFlower(HERE)).isFalse();
    }
    /**
     * Check hop()
     */
    public void testHop()
    {
        //1.call method
        jeroo.hop();
        //2.check results
        assertThat(copier.getX()).isEqualTo(11);
    }
    /**
     * Check turn()
     */
    public void testTurn()
    {
        //1.call method
        jeroo.turn(LEFT);
        //2.check results
        assertThat(copier.isFacing(NORTH)).isTrue();
    }
    /**
     * Check turn()
     */
    public void testWalkIsland()
    {
        //1.call method
        jeroo.walkIsland();
        //2.check results
        assertThat(copier.isFacing(WEST)).isTrue();
    }
}
