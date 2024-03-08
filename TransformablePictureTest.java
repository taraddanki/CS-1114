import student.*;
import student.media.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Taruni Addanki (tarunia)
/**
 *  Unit tests for Transformable Picture in Lab 06.
 *
 *  @author Taruni Addanki (tarunia)
 *  @version (2021.09.29)
 */
public class TransformablePictureTest
    extends TestCase
{
    //~ Fields ................................................................
    private TransformablePicture image;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new TransformablePictureTest test object.
     */
    public TransformablePictureTest()
    {
        //n/a
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        image = new TransformablePicture(new TestImage2x2());
    }


    // ----------------------------------------------------------
    /**
     * Tests maxRed()
     */
    public void testMaxRed()
    {
        // 1. initial conditions are already provided in setUp(),
        //    so there's nothing to do here.
        // 2. call the method to test
        image.maxRed();
        // 3. check expected behavior
        assertThat(image.getPixel(0, 0).getRed()).isEqualTo(255);
    }
    /**
     * Tests maxGreen()
     */
    public void testMaxGreen()
    {
        // 1. initial conditions are already provided in setUp(),
        //    so there's nothing to do here.
        // 2. call the method to test
        image.maxGreen();
        // 3. check expected behavior
        assertThat(image.getPixel(0, 0).getGreen()).isEqualTo(255);
    }
    /**
     * Tests maxBlue()
     */
    public void testMaxBlue()
    {
        // 1. initial conditions are already provided in setUp(),
        //    so there's nothing to do here.
        // 2. call the method to test
        image.maxBlue();
        // 3. check expected behavior
        assertThat(image.getPixel(0, 0).getBlue()).isEqualTo(255);
    }
    /**
     * Tests brighten()
     */
    public void testBrighten()
    {
        // 1. initial conditions are already provided in setUp(),
        //    so there's nothing to do here.
        // 2. call the method to test
        image.brighten(10);
        // 3. check expected behavior
        assertThat(image.getPixel(0, 0).getRed()).isEqualTo(110);
        assertThat(image.getPixel(0, 0).getGreen()).isEqualTo(110);
        assertThat(image.getPixel(0, 0).getBlue()).isEqualTo(110);
    }
}
