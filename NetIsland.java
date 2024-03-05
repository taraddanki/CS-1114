import student.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Taruni Addanki (tarunia)
 *  @version (2021.09.08)
 */
public class NetIsland
    extends NetIslandBase
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created NetIsland object.
     */
    public NetIsland()
    {
        super();
    }
    
    //~ Methods ...............................................................
    /**
     * Introduces Jeroo emily, a NetRemover at 3,1
     * Adds methods from NetRemover subclass for Jeroo emily to follow
     */
    public void myProgram()
    {
        NetRemover emily = new NetRemover();
        this.addObject(emily, 3, 1);
        emily.pickFlowers();
        emily.getToNets();
        emily.avoidWater();
        emily.disableNets();
        emily.avoidWater();
    }
}
