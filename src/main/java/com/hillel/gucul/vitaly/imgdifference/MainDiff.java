package com.hillel.gucul.vitaly.imgdifference;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public final class MainDiff {

    private MainDiff (){}


    public static BufferedImage getDiffImg(BufferedImage img1, BufferedImage img2){

        final int width = img1.getWidth();
        final int height = img1.getHeight();
        final int result = Color.RED.getRGB();
        final int [] pixFirst = img1.getRGB(0,0,width,height, null, 0, width);
        final int [] pixSecond = img2.getRGB(0,0,width,height, null, 0, width);

        for (int i = 0; i < pixFirst.length ; i++) {
            if (pixFirst[i] != pixSecond[i]){
                pixFirst[i] = result;
            }
        }

        final BufferedImage outImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        outImg.setRGB(0,0, width, height, pixFirst, 0, width);
        return outImg;
    }

    public static void main(String[] args) throws IOException {

        ImageIO.write(
                getDiffImg(
                        ImageIO.read(new File("C:\\Users\\insomnia\\IdeaProjects\\Testing\\gucul_home_work\\src\\main\\resources\\img\\img1.png")),
                        ImageIO.read(new File("C:\\Users\\insomnia\\IdeaProjects\\Testing\\gucul_home_work\\src\\main\\resources\\img\\img2.png"))),
                "png",
                new File("C:\\Users\\insomnia\\IdeaProjects\\Testing\\gucul_home_work\\src\\main\\resources\\outputImg.png"));
    }



}
