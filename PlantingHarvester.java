
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This is a subclass of the Harvester that introduces the 
 *  planting Jeroos,which hop and pick and plant flowers 
 *  indiviually and in rows.
 *
 *  @author (Taruni Addanki tarunia)
 *  @version (2021.09.01)
 */
public class PlantingHarvester
    extends Harvester
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created PlantingHarvester object.
     */
    public PlantingHarvester()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Creates a hop, pick, and plant method to hop and pick 
     * flowers as well as plants.
     */
    public void hop2AndPick()
    {
        this.hopAndPick();
        this.hop();
        this.plant();
    }
}
