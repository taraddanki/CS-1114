
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This is a subclass of the Jeroos that introduces the harvesting 
 *  Jeroos, which hop and pick flowers indiviually and in rows.
 *
 *  @author (Taruni Addanki tarunia)
 *  @version (2021.09.01)
 */
public class Harvester
    extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Harvester object.
     */
    public Harvester()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Creates a hop and pick method to hop and pick flowers.
     */
    public void hopAndPick()
    {
        this.hop();
        this.pick();
    }
    /**
     * Creates a hop and pick method to hop and pick flowers twice.
     */
    public void hop2AndPick()
    {
        this.hopAndPick();
        this.hopAndPick();
    }
    /**
     * Creates a hop and pick method to hop and pick flowers
     * 6 times, a row of flowers.
     */
    public void harvestRow()
    {
        this.hop2AndPick();
        this.hop2AndPick();
        this.hop2AndPick();
    }
}
