import student.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  A Jeroo that walks every cell in on an island and uses delegation
 *  to instruct a second jeroo to follow its motions and plant a flower
 *  anywhere it finds one.
 *
 *  @author Taruni Addanki (tarunia)
 *  @version (2021.10.11)
 */
public class CopyingJeroo
    extends Jeroo
{
    //~ Fields ................................................................
    private Jeroo copier;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created CopyingJeroo object.
     * @param emily copier jeroo
     */
    public CopyingJeroo(Jeroo emily)
    {
        super();
        copier = emily;
    }

    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Walk a pattern over every grid location on the current island.
     */
    public void walkIsland()
    {
        this.hopToWater();
        this.turnRight();
        this.checkForFlower();
        this.hopToWater();
        this.turnLeft();
        this.checkForFlower();
        this.hopToWater();
        this.turnRight();
        this.checkForFlower();
        this.hopToWater();
        this.turnLeft();
        this.checkForFlower();
        this.hopToWater();
        this.turnRight();
        this.checkForFlower();
        this.hopToWater();
        this.turnLeft();
        this.checkForFlower();
        this.hopToWater();
        this.turnRight();
        this.checkForFlower();
    }
    
    
    // ----------------------------------------------------------
    /**
     * Hop forward until we reach the water.
     */
    public void hopToWater()
    {
        while (!this.seesWater(AHEAD))
        {
            this.checkForFlower();
            this.hop();
        }
    }
    /**
     * Turns to next row from right
     */
    public void turnRight()
    {
        this.turn(RIGHT);
        this.checkForFlower();
        this.hop();
        this.turn(RIGHT);
    }
    /**
     * Turns to next row from left
     */
    public void turnLeft()
    {
        this.turn(LEFT);
        this.checkForFlower();
        this.hop();
        this.turn(LEFT);
    }
    /**
     * Checks for flower to copy the pattern
     */
    public void checkForFlower()
    {
        if (this.seesFlower(HERE))
        {
            copier.plant();
        }
    }
    /**
     * Overrides hop() that copier copies
     */
    public void hop()
    {
        super.hop();
        copier.hop();
    }
    /**
     * Overrides turn() that copier copies
     * @param direction turning to a relative direction
     */
    public void turn(RelativeDirection direction)
    {
        super.turn(direction);
        copier.turn(direction);
    }
}
