package com.hillel.gucul.vitaly.imgdifference;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public final class MainDiff {

    private MainDiff (){}


    /**
     *
     * @param img1
     * @param img2
     * @return
     */
    public static BufferedImage getDiffImg(BufferedImage img1, BufferedImage img2){
        //make images to arrays of pixel
        final int width = img1.getWidth();
        final int height = img1.getHeight();
        final int result = Color.RED.getRGB();
        final int [] pixFirst = img1.getRGB(0,0,width,height, null, 0, width);
        final int [] pixSecond = img2.getRGB(0,0,width,height, null, 0, width);
        //comp images pixel by pixel
        for (int i = 0; i < pixFirst.length ; i++) {
            if (pixFirst[i] != pixSecond[i]){
                pixFirst[i] = result;
            }
        }

        final BufferedImage outImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        outImg.setRGB(0,0, width, height, pixFirst, 0, width);
        return outImg;
    }

    /**
     *
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {

        ImageIO.write(
                getDiffImg(
                        ImageIO.read(new File("your_path_to_img1")),
                        ImageIO.read(new File("your_path_to_img2"))),
                "png",
                new File("your_out_path_to_img"));
    }



}
