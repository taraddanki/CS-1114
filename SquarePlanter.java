
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Taruni Addanki (tarunia)
/**
 *  This is a subclass of Jeroo made to initialize a SquarePlanter
    and implement methods plantOneSide() and plantSquare().
 *  
 *  @author Taruni Addanki (tarunia)
 *  @version (2021.09.21)
 */
public class SquarePlanter
    extends Jeroo
{
    //~ Fields ................................................................
    private int flowersPerSide;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created SquarePlanter object with a parameter 
       value that represents the number of flowers to use on one side of 
       the square.
     */
    public SquarePlanter(int k)
    {
        super(4 * k);
        flowersPerSide = k;
    }


    //~ Methods ...............................................................
    /**
     * Plants a 4*K square of flowers
     */
    public void plantSquare()
    {
        this.plantOneSide();
        this.plantOneSide();
        this.plantOneSide();
        this.plantOneSide();
    }
    /**
     * Plants one side of flowers - 1 on each side to complete
       the square
     */
    public void plantOneSide()
    {
        int hopsToTake = flowersPerSide;
        while (hopsToTake > 0)
        {
            this.hop();
            this.plant();
            hopsToTake = hopsToTake - 1; // One less hop
        }
        this.turn(RIGHT);
    }
}
