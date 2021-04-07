/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab_04;

import java.awt.image.BufferedImage;
import java.util.Arrays;

public class App {


    public static void main(String[] args) {
        BitMap bitMap = new BitMap();
        BufferedImage image1;
        String path = System.getProperty("user.dir") + "/";
        String fileName = "../"+ args[0];
        String outFileName = args[1];
        outFileName = outFileName.contains(".bmp") ?outFileName:outFileName+".bmp";
        String method = args[2];
        String text = "Hello";
        if(args.length > 3){
            text = args[3];
        }
        if(method.equals("invert")){
            System.out.println("inverting...");
            image1 = bitMap.readImage(fileName);
            BufferedImage inverted = bitMap.invert(image1);
            bitMap.writeImage(inverted, outFileName);
            System.out.println("Image save in '" + path + "' as '" + outFileName+"'" );
        }
        else if(method.equals("addWaterMark")){
            System.out.println("adding water mark...");
            image1 = bitMap.readImage(fileName);
            BufferedImage textOn = bitMap.addWaterMark(image1, text);
            bitMap.writeImage(textOn, outFileName);
            System.out.println("Image save in '" + path + "' as '" +outFileName +"'" );
        }
        else if(method.equals("mirror")){
            System.out.println("mirroring ");
            image1 = bitMap.readImage(fileName);
            BufferedImage mirror = bitMap.mirror(image1);
            bitMap.writeImage(mirror, outFileName);
            System.out.println("Image save in '" + path + "' as '" +outFileName +"'" );
        }
        else{
            System.out.println("No Such Method, try again...");

        }


//        String fileName = "image.bmp";
//        BufferedImage image1 = bitMap.readImage(fileName);
//        BufferedImage inverted = bitMap.invert(image1);
//
//        bitMap.writeImage(inverted, "test.bmp");
//
//        image1 = bitMap.readImage(fileName);
//        BufferedImage textOn = bitMap.addWaterMark(image1, "Hello...");
//        bitMap.writeImage(textOn, "textOn.bmp");
//
//
//        image1 = bitMap.readImage(fileName);
//        BufferedImage some = bitMap.rotate(image1);
//        bitMap.writeImage(some, "some.bmp");
    }
}
