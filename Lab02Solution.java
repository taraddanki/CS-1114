import student.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  This is a superclass which introduces the objects, Jeroos, and 
 *  the flowers they are harvesting and planting. Its purpose is 
 *  to have the different types of Jeroos be able to harvest, 
 *  skip, and plant.
 * 
 *
 *  @author (Taruni Addanki tarunia)
 *  @version (2021.09.01)
 */
public class Lab02Solution
    extends PlantationIsland
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Lab02Solution object.
     */
    public Lab02Solution()
    {
        super();
    }
    
    //~ Methods ...............................................................
    /**
     * Introduces a jeroo harvester, Sally at (2,3)
     * Sally has to harvest a row of flowers
     * Introduces a skipping harvester, Mary at (2,5)
     * Mary has to harvest a row of flowers
     * Introduces a planting harvester, John at (2,7)
     * John has to harvest a row of flowers AND plant
     */
    public void myProgram()
    {
        Harvester sally = new Harvester();
        this.addObject(sally, 2, 3);
        sally.harvestRow();
        SkippingHarvester mary = new SkippingHarvester();
        this.addObject(mary, 2, 5);
        mary.harvestRow();
        PlantingHarvester john = new PlantingHarvester();
        this.addObject(john, 2, 7);
        john.harvestRow();
    }
}



