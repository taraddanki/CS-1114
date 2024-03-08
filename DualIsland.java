import student.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  DualIsland class is a clone of Iland that extends DualIslandBase
 *
 *  @author Taruni Addanki (tarunia)
 *  @version (2021.10.11)
 */
public class DualIsland
    extends DualIslandBase
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created DualIsland object.
     */
    public DualIsland()
    {
        this(false);
    }


    // ----------------------------------------------------------
    /**
     * Initializes a newly created DualIsland object.
     * @param random If true, use a random arrangement of flowers, instead of
     *        the default triangle shape.
     */
    public DualIsland(boolean random)
    {
        super(random);
    }


    //~ Methods ...............................................................

    public void myProgram()
    {
        Jeroo slave = new Jeroo(1000);
        this.addObject(slave, 10, 1);

        CopyingJeroo master = new CopyingJeroo(slave);
        this.addObject(master, 1, 1);

        master.walkIsland();
    }
}
