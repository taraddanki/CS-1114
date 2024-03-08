import student.media.*;
import student.util.Random;
import java.awt.Color;
//-------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Taruni Addanki (tarunia)
/**
 *  SchellingSimulation class that extends Picture 
 *  
 *  @author Taruni Addanki (tarunia)
 *  @version (10.17.2021)
 */
public class SchellingSimulation
    extends Picture
{
    //~ Fields ................................................................
    private double satisfactionThreshold;
    private int redLine;
    
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created SchellingSimulation object.
     * @param width for width of square
     * @param height for height of square
     */
    public SchellingSimulation(int width, int height)

    {
        super(width, height);
        satisfactionThreshold = 0.3;
        redLine = 0;
    }


    //~ Methods ...............................................................
    /**
     * A getter method that returns the satisfaction threshold 
        (a double).
     * @return satisfactionThreshold
     */
    public double getSatisfactionThreshold()
    {
        return satisfactionThreshold;
    }
    /**
     * A setter method that takes a double parameter and changes the 
       satisfaction threshold to the specified value.
     * @param satisfactionThreshold which is set
     */
    public void setSatisfactionThreshold(double satisfactionThreshold)
    {
        this.satisfactionThreshold = satisfactionThreshold;
    }
    /**
     * A getter method that returns the redline value (an int).
     * @return redLine
     */
    public int getRedLine()
    {
        return redLine;
    }
    /**
     * A setter method that takes an integer parameter and changes
       the redline to the specified value.
     * @param redLine which is set
     */
    public void setRedLine(int redLine)
    {
        this.redLine = redLine;
    }
    /**
     * A setter method that takes an integer parameter and changes
       the redline to the specified value.
     * @param blue pixels
     * @param orange pixels
     */
    public void populate(double blue, double orange)
    {
        Random generator = Random.generator();
        for (Pixel pix : this.getPixels())
        {
            double amount = generator.nextDouble();
            if (blue >= amount)
            {
                //sets color to blue if generator is greater than or 
                //equal to 0
                pix.setColor(Color.BLUE);
            }
            else if (blue + orange > amount && (pix.getY() >= redLine))
            {
                //sets color to orange if generator is greater than or 
                //equal to 0
                pix.setColor(Color.ORANGE);
            }
            else 
            {
                //sets remaining to white 
                pix.setColor(Color.WHITE);
            }
        }
    }
    /**
     * Takes two Pixel objects and returns a boolean value indicating 
     * whether the two pixels have the same color.
     * @param pix is the pixel
     * @param pix2 is the second pixel
     * @return true when pixels are the same color
     * 
     */
    public boolean areSameColor(Pixel pix, Pixel pix2)
    {
        return pix.getColor().equals(pix.getColor());
    }
    /**
     * Takes one Pixel object and returns true if its color is Color.
       WHITE, representing an empty location.
     * @param pixel is the pixel
     * @return true when pixel is white
     */
    public boolean isEmpty(Pixel pix)
    {
        return pix.getColor().equals(Color.WHITE);
    }
    /**
     * Takes one Pixel object and a Color value, and returns a 
       boolean result indicating whether an agent of the specified
     * @param pixel the pixel
     * @param color the color 
     * @return it will return boolean value if pixel color is satisfied
     */
    public boolean isSatisfied(Pixel pix, Color col)
    {
        double neighborsame = 0;
        double total = 0;
        for (Pixel neighbor : pix.getNeighborPixels())
        {
            if (neighbor.getColor().equals(col))
            {
                neighborsame += 1;
                total = 1;
            }
            else if (neighbor.getColor().equals(Color.WHITE))
            {
                total += 1;
            }
        }
        if (total == 0)
        {
            return true;
        }
        return neighborsame / total > satisfactionThreshold;
    }
    /**
     * This method tries to move the corresponding agent to a new 
       pixel location.
     * @return value for cycleAgents()
     */
    public boolean maybeRelocate(Pixel pix)
    {
        Random generator = new Random();
        int genX = generator.nextInt(this.getWidth());
        int genY = generator.nextInt(this.getHeight());
        if (pix.getColor().equals(Color.ORANGE) && pix.getY() <= redLine)
        {
            return false;
        }
        Pixel pixelNew = this.getPixel(genX, genY);
        if (isEmpty(pixelNew) && isSatisfied(pixelNew, pix.getColor()))
        {
            pixelNew.setColor(pix.getColor());
            pix.setColor(Color.WHITE);
            return true;
        }
        else 
        {
            return false;
        }
    }
    /**
     * This method uses a loop over all pixels, 
       checking each pixel in turn. 
     * @return value for cycleAgents()
     */
    public int cycleAgents()
    {
        int counter = 0;
        boolean move;
        for (Pixel pixel : this.getPixels())
        {
            if (!this.isEmpty(pixel) && !this.isSatisfied(pixel, pixel.getColor()))
            {
                move = this.maybeRelocate(pixel);
            }
        }
        return counter;
        }
    }
