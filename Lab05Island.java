
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Taruni Addanki (tarunia)
/**
 *  This is a subclass of Island made to introduce a SquarePlanter 
    and call the method plantSquare().
 *
 *  @author Taruni Addanki (tarunia)
 *  @version (2021.09.21)
 */
public class Lab05Island
    extends Island
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Lab05Island object.
     */
    public Lab05Island()
    {
        super();
    }


    //~ Methods ...............................................................
    public void myProgram()
    {
        SquarePlanter carly = new SquarePlanter(3);
        this.addObject(carly, 1, 1);
        carly.plantSquare();
    }

}
