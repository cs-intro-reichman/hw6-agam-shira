import java.awt.Color;

/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and two integers that specify the width and the
 * height of the scaled, output image. For example, to scale/resize ironman.ppm to a width
 * of 100 pixels and a height of 900 pixels, use: java Editor2 ironman.ppm 100 900
 */
public class Editor2 {

	public static void main (String[] args){
		String fileName = args[0];
		int height = Integer.parseInt(args[1]);
		int width = Integer.parseInt(args[2]);
		Color[][] sourceImage = Runigram.read(fileName);	
		Color[][] outputImage = null;
		outputImage = Runigram.scaled(sourceImage, height, width);
		Runigram.setCanvas(sourceImage);
		Runigram.display(sourceImage);
		StdDraw.pause(3000);
		Runigram.setCanvas(outputImage);
		Runigram.display(outputImage);		
	}
}
