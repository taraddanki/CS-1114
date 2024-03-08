
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  The Scavenger Jeroo, fred, is added to the ScavengerHunt class
 *  that extends LongIsland to patrol around the world and nets,
 *  and pick all of the flowers.
 *
 *  @author Taruni Addanki (tarunia)
 *  @version (2021.09.14)
 */
public class ScavengerHunt
    extends LongIsland 
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created ScavengerHunt object.
     */
    public ScavengerHunt()
    {
        super();
        //nothing to initialize
    }


    //~ Methods ...............................................................
    public void myProgram()
    {
        Scavenger fred = new Scavenger();
        this.addObject(fred, 2, 1);
        this.moveForward();
        
    }
}
