
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  Adds The ScavengerJeroo, fred, to the Scavenger class that 
 *  extends Jeroo to patrol around the world and nets, and pick 
 *  all of the flowers.
 *
 *  @author Taruni Addanki (tarunia)
 *  @version (2021.09.14)
 */
public class Scavenger
    extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Scavenger object.
     */
    public Scavenger()
    {
        super();
        // nothing to initialize
    }


    //~ Methods ...............................................................
    public void collectFlowers()
    {
        
    }   
        public void moveForward()
    {
        this.hop();
        this.hop();
    }
    public void crossOverNet()
    {
    // cross over the net 
    } 
    public void collectNorthShoreFlowers()
    {
    // pick flowers north of the water
    } 
    public void harvestRow()
    {
    // pick and hop a row of flowers
    } 
    public void patrolWall()
    {
    // hop through the parameter of the LongIsland
    } 
    public void turnCorner()
    {
    // turn right 4 times
    } 
}
