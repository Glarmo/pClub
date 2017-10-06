public class RBG
{
    private float red;
    private float green;
    private float blue;

    public RBG (float r, float g, float b)
    {
      setRed(r);
      setBlue(b);
      setGreen(g);
    }

    //Get methods
    public float getRed()
    {
       return red;
    }
    public float getBlue()
    {
       return blue;
    }
    public float getGreen()
    {
       return green;
    }

    //Set methods
    public void setRed(float val)
    {
       red = val;
    }
    public void setBlue(float val)
    {
       blue = val;
    }
    public void setGreen(float val)
    {
       green = val;
    }
}
