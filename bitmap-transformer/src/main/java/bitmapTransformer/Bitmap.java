package bitmapTransformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {
    // instance variables
    String infile;
    String outfile;
    String transform;
    // access the bitmap file
    BufferedImage image;
    BufferedImage transformed;
    File savedImage;

    // define the constructor
    public Bitmap(String infile, String outfile, String transform) {
        this.infile = infile;
        this.outfile = outfile;
        this.transform = transform;
        // read the input bitmap file
        try {
            this.image = ImageIO.read(new File("assets/" + infile));
        } catch (IOException e) {
            System.out.println("invalid file name " + e);
        }
        try {
            BufferedImage bi = getTransformMethod();
            savedImage = new File("assets/" + outfile);
            ImageIO.write(bi, "bmp", savedImage);
        } catch (IOException e) {
            System.out.println("could not make new file" + e);
        }
    }
    // parse the bitmap's data into a Bitmap object

    // helper methods
    // practice transform
    public BufferedImage getTransformMethod() {
        if (transform.equals("gray")) {
            toGrayScale();
        } else if (transform.equals("upSideDown")) {
            upSideDown();
        } else if (transform.equals("watermark")) {
            watermark();
        }
        return transformed;
    }

    public void toGrayScale() {
        // transform image happens here
        // loop over image and change stuff, save it to transformed and return transformed
        int width = image.getWidth();
        int height = image.getHeight();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Color c = new Color(image.getRGB(j,i));
                int red = (int)(c.getRed() * 0.299);
                int green = (int)(c.getGreen() * 0.587);
                int blue = (int)(c.getBlue() * 0.114);
                Color newColor = new Color(red + green + blue, red + green + blue, red + green + blue);
                image.setRGB(j, i, newColor.getRGB());
            }
        }

        transformed = image;
    }

    public BufferedImage upSideDown() {
        // transform image happens here
        // loop over image and change stuff, save it to transformed and return transformed
        return transformed;
    }

    public BufferedImage watermark() {
        // transform image happens here
        // loop over image and change stuff, save it to transformed and return transformed
        return transformed;
    }

    // verified we are accessing CLI arguments
//    public String printUserInputs() {
//        return infile + outfile + transform;
//    }

}
