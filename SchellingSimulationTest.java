import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import student.media.*;
import java.awt.Color;
// -------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Taruni Addanki (tarunia)
/**
 *  Testing class for SchellingSimulation
 *
 *  @author Taruni Addanki (tarunia)
 *  @version (10.17.2021)
 */
public class SchellingSimulationTest
    extends TestCase
{
    //~ Fields ................................................................
    private SchellingSimulation simulation;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SchellingSimulationTest test object.
     */
    public SchellingSimulationTest()
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
        simulation = new SchellingSimulation(2, 2);
        Pixel x = simulation.getPixel(1, 1);
        x.setColor(Color.BLUE);
        Pixel y = simulation.getPixel(2, 1);
        y.setColor(Color.ORANGE);
        Pixel z = simulation.getPixel(2, 2);
        z.setColor(Color.ORANGE);
        Pixel p = simulation.getPixel(1, 2);
        p.setColor(Color.WHITE);
    }


    // ----------------------------------------------------------
    /**
     * Tests IsEmpty()
     */
    public void testIsEmpty()
    {
        // 1. initial conditions are already provided in setUp(),
        //    so there's nothing to do here.
        // 2. call the method to test
        // 3. check expected behavior
        assertThat(simulation.getPixel(1, 2).getColor()).isEqualTo(Color.WHITE);
    }
    /**
     * Tests maybeRelocate()
     */
    public void testMaybeRelocate()
    {
        // 1. initial conditions are already provided in setUp(),
        //    so there's nothing to do here.
        // 2. call the method to test
        // 3. check expected behavior
        assertThat(simulation.getPixel(0, 0).getColor()).isEqualTo(Color.WHITE);
        assertThat(simulation.getPixel(1, 1).getColor()).isEqualTo(Color.BLUE);
    }
}
