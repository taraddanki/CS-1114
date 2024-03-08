import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import student.micro.jeroo.*;
import static student.micro.jeroo.CompassDirection.*;
import static student.micro.jeroo.RelativeDirection.*;
// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *  As a Hokie, I will conduct myself with honor and integrity at all times.
 *  I will not lie, cheat, or steal, nor will I accept the actions of those 
 *  who do.
 *  Taruni Addanki (tarunia)
 *  @version (2021.09.20)
 */
public class FlowerPickerTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new FlowerPickerTest test object.
     */
    public FlowerPickerTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    
    /**
     * Test the pickLine() method on flower patch A's northwest corner.
     */
    public void testPickLine()
    {
        // 1. Set up initial conditions
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.addObject(picker, 2, 2);

        // 2. Call the method(s) you are testing
        picker.pickLine();

        // 3. Make assertions capturing your expected outcomes
            // the jeroo should end at (6,2)
        assertThat(picker.getX()).isEqualTo(6);
        assertThat(picker.getY()).isEqualTo(2);
        assertThat(picker.isFacing(EAST)).isTrue();
        assertThat(picker.getFlowers()).isEqualTo(5);
        assertThat(island.countFlowers()).isEqualTo(37);
    }
    public void myProgram()
    {
        
    }
}
