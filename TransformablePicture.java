import student.media.*;

//-------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Taruni Addanki (tarunia)
/**
 *  A picture that supports basic color transformations for Lab 06.
 *
 *  @author Taruni Addanki (tarunia)
 *  @version (2021.09.29)
 */
public class TransformablePicture
    extends Picture
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created TransformablePicture object as a copy
       of another image.
     */
    public TransformablePicture(Picture original)
    {
        super(original);
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Turns the red intensity of every pixel in this image up to
       the maximum value.
     */
    public void maxRed()
    {
        for (Pixel pix : this.getPixels())
        {
            pix.setRed(255);
        }
    }
    /**
     * Turns the green intensity of every pixel in this image up to
       the maximum value.
     */
    public void maxGreen()
    {
        for (Pixel pix : this.getPixels())
        {
            pix.setGreen(255);
        }
    }
    /**
     * Turns the blue intensity of every pixel in this image up to
       the maximum value.
     */
    public void maxBlue()
    {
        for (Pixel pix : this.getPixels())
        {
            pix.setBlue(255);
        }
    }
    /**
     * Brightens every pixel in this image by int amount.
     */
    public void brighten(int amount)
    {
        for (Pixel pix : this.getPixels())
        {
            pix.setColor(pix.getRed() + amount, pix.getGreen() + amount, 
            pix.getBlue() + amount);
        }
    }
}
