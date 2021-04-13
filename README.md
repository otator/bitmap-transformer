# Bitmap Transformer
## In today lab we start dealing with bmp images using BufferedImage class to read the image then creating methods to read,write and modifying in the image as we need
> ### To run code or test it in your images  you need to go inside the this directory after you clone the repo then run this command  :  `./gradlew run --args 'image.bmp output.bmp invert'`
* where the first argument is the file you want to use in program(this file must be in the project directory in order for the java code to find it)

* the second argument is the file name that will be saved after the program executes

* the last argument is the functionality(method) you want to be applied on the image file you want.

the available methods are (mirro, addWaterMark, invert)

for the **addWaterMark** the default text is "Hello", if you want a specific text you cant pass it as fourth argument as below

`./gradlew run --args 'image.bmp my_design addWaterMark pay me to get the original design`

if the file could not be found -> a message in red color will tell you the error.

if the file is found -> the method name will be printed in the cli and after that you will get a message tells you where the file is saved and what its name as shown below

**Image saved in** _'c/Users/user1/401/bitmap-transformer/lab_04/app/' as 'my_design.bmp'_

### methods in the project
**class BitMap**
* `readImage(String <fileName>)` method that takes in a file name and read it using `fileInputStream`, and read this file using the `read` method of class `ImageIO` and returns an object of type `BufferedImage` to use later in code.
* `writeImage(BufferedImage <sourceFile>, String <destination>)` method that takes in the source file of type BufferedImage and a destination path to save/write the image in it.
* `invert(BufferedImage image)` method to invert the colors of the input image.
* `addWaterMark(BufferedImage sourceImage, String text)` mwthod to add text (water mark) to an image
* `mirror(BufferedImage image)` method to mirror the image upside down 
 
 