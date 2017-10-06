public class Complex
{
  private float x,y;
  public Complex (float real, imagine)
  {
      x = real;
      y = imagine;
  }

  public Complex Addition (Complex a, Complex b)
  {
      Complex fin = new Complex(a.getReal()+ b.getReal(), a.getImag() + b.getImag());
      return fin;
  }

  public Complex Multiply (Complex a, Complex b)
  {
      Complex fin = new Complex(a.getReal()*b.getReal() - a.getImag()*b.getImag(), a.getImag()*b.getImag() + a.getReal()*b.getReal());
      return fin;
  }

  public float getReal()
  {
    return x;
  }
  public float getImag()
  {
    return y;
  }
}
