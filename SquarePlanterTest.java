import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import student.micro.jeroo.*;
import static student.micro.jeroo.CompassDirection.*;
import static student.micro.jeroo.RelativeDirection.*;
// -------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Taruni Addanki (tarunia)
/**
 *  This is a testing class for SquarePlanter to test the methods
    plantOneSide() and plantSquare(). Objectives are to make sure 
    the jeroo correctly plants the square, 4*K, has correct amount
    of flowers, and returns to 1,1. 
 *
 *  @author Taruni Addanki (tarunia)
 *  @version (2021.09.21)
 */
public class SquarePlanterTest
    extends TestCase
{
    //~ Fields ................................................................
    private Island island;
    private SquarePlanter jeroo;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SquarePlanterTest test object.
     */
    public SquarePlanterTest()
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
        island = new Island();
        jeroo = new SquarePlanter(3);
        island.addObject(jeroo, 1, 1);
    }


    // ----------------------------------------------------------
    /**
     * Tests plantOneSide()
     */
    public void testPlantOneSide()
    {
        //call the method
        jeroo.plantOneSide();
        //check expected results
        assertThat(jeroo.getX()).isEqualTo(4);
        assertThat(jeroo.getY()).isEqualTo(1);
        assertThat(island.countFlowers()).isEqualTo(3);
        assertThat(jeroo.getHeading()).isEqualTo(SOUTH);
    }
    /**
     * Tests plantSquare()
     */
    public void testPlantSquare1()
    {
        //call the method
        jeroo.plantSquare();
        //check expected results
        assertThat(jeroo.getX()).isEqualTo(1);
        assertThat(jeroo.getY()).isEqualTo(1);
        assertThat(island.countFlowers()).isEqualTo(12);
        assertThat(jeroo.getHeading()).isEqualTo(EAST);
    }
    /**
     * Tests plantSquare() for a different sized square
     */
    public void testPlantSquare2()
    {
        //remove the jeroo created by setUp()
        jeroo.remove();
        //create a new jeroo
        jeroo = new SquarePlanter(4);
        island.addObject(jeroo, 1, 1);
        //call the method
        jeroo.plantSquare();
        //check expected results
        assertThat(jeroo.getX()).isEqualTo(1);
        assertThat(jeroo.getY()).isEqualTo(1);
        assertThat(island.countFlowers()).isEqualTo(16);
        assertThat(jeroo.getHeading()).isEqualTo(EAST);
    }
}
