
import java.io.*;

public class PPM
{
   private int width;
   private int height;

   private RBG pixels[][];

   public PPM (int w, int h)
   {
     this.width = w;
     this.height = h;
     this.pixels = new RBG[w][h];
     for (int i = 1; i < height; i++)
     {
       for (int j = 1; j < width; j++)
       {
         pixels[0][0] = new RBG(0f, 0f, 0f);
         float last  = (pixels[i-1][j-1].getRed()*pixels[i-1][j-1].getRed());
         pixels[i][j] = new RBG(last, last, last);
       }
     }
   }
   public static void main (String[] args) throws IOException
   {
      PPM ppm = new PPM(200, 200);
      ppm.write(new File( "test.ppm"));
   }

   public void write( File file ) throws IOException
   {
      PrintWriter pw = new PrintWriter( file );
      write( pw );
      pw.close();
   }
   private int quant( float c ) {
     return (int)(c*255);
   }
   public void write(PrintWriter pw) throws IOException
   {
      pw.println( "P3" );
      pw.println( width + " " + height );
      pw.println( "255" );

      for (int i = 0; i < height; i++)
      {
        for (int j = 0; j < width; j++)
        {
          RBG p = pixels[i][j];
          pw.print(quant(p.getRed()) + " " + quant(p.getGreen()) + " " + quant(p.getBlue()) + "\t");
        }
        pw.println(" ");
      }
   }
}
