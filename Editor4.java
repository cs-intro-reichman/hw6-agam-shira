import java.awt.Color;
public class Editor4 {
    public static void main (String[] args) {
		String source = args[0];
		Color[][] sourceImage = Runigram.read(source);
		Color[][] grayImage = Runigram.grayScaled(sourceImage);
        int n = Integer.parseInt(args[1]);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, grayImage, n);
	}
}

