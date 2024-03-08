
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
/**
 *  A subclass of Jeroo that introduces a runner to follow the
    methods clearMaze, collectFlowers, disableNets, and returnToStart.
 *  @author Taruni Addanki (tarunia)
 *  @version (2021.09.26)
 */
public class MazeRunner
    extends Jeroo
{
    //~ Fields ................................................................
    //private TestingIsland island;
    //private MazeRunner runner;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created MazeRunner object.
     */
    public MazeRunner()
    {
        super(EAST, 10);
    }


    //~ Methods ...............................................................
    /**
     * Collects all flowers, disables all nets, and returns
       to its starting position
     */
    public void clearMaze()
    {
        //implement later
    }
    /**
     * Collects all flowers
     */
    public void collectFlowers()
    {
        //while (this.seesFlower(HERE))
        //{
            //this.pick();
        //}
        //if (this.seesFlower(AHEAD))
            //{
                //this.hop();
                //this.pick();
            //}
            //else 
            //{
                //this.moveForeward();
            //}
        //this.moveForeward();
    }
    /**
     * Disables all nets
     */
    public void disableNets()
    {
        //while (this.hasFlower())
        //{
           //this.pick();
        //}
        //if (this.seesNet(HERE))
        //{
            //this.toss();
        //}
        //else if (this.seesNet(AHEAD))
        //{
            //this.hop();
            //this.toss();
        //}
        //else if (!this.hasFlower())
        //{
            //this.turn(RIGHT);
        //} 
    }
    /**
     * Returns to starting position
     */
    public void returnToStart()
    {
        //implement later`
    }
    /**
     * Moves foreward
     */
    public void moveForeward()
    {
        //while (this.isClear(AHEAD))
        //{
            //this.hop();
        //}
    }
    /**
     * Turns to avoid water
     */
    public void avoidWater()
    {
        //while (this.seesWater(AHEAD))
        //{
            //this.turn(RIGHT);
        //}
    }
}