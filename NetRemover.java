
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
public class NetRemover
    extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created NetRemover object.
     */
    public NetRemover()
    {
        super();
    }
    //~ Methods ...............................................................
    public void pickFlowers()
    {
        if (this.seesFlower(RIGHT))
        {
            this.turn(RIGHT);
            this.hop();
            this.pick();
        }
        while (this.seesFlower(AHEAD))
        {
            this.hop();
            this.pick();
        }
    }
    public void getToNets()
    {
            this.turn(LEFT); 
            this.turn(LEFT);
            while (this.isClear(AHEAD))
            {
                this.hop();
            }
            this.turn(RIGHT);
    }
    public void disableNets()
    {
        while (this.isClear(AHEAD))
        {
            this.hop();
        }
        if (this.seesNet(AHEAD))
        {
            this.toss();
            this.hop();
        }
        if (this.seesNet(RIGHT))
        {
            this.turn(RIGHT);
            while (this.seesNet(AHEAD) && (this.hasFlower()))
            {
                this.toss();
                this.hop();
            }
        }
    }
    public void avoidWater()
    {
        while (this.seesWater(RIGHT))
        {
            this.hop();
            if (this.seesWater(AHEAD))
            {
                this.turn(RIGHT);
            }
        }
    }
}
