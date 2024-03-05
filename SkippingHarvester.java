
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This is a subclass of the Harvester that introduces the skipping
 *  Jeroos,which hop and pick, then hops again to collect flowers 
 *  indiviually and in rows.
 *
 *  @author (Taruni Addanki tarunia)
 *  @version (2021.09.01)
 */
public class SkippingHarvester
    extends Harvester
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created SkippingHarvester object.
     */
    public SkippingHarvester()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Creates a hop and pick method to hop, pick, and hop
     * without picking flowers.
     */
    public void hop2AndPick()
    {
        this.hopAndPick();
        this.hop();
    }
}
