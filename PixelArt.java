/*
* This is the class file with pixel art programs
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2022-1-11
*/

/**
* This is the class file to hold all the pixel art.
*/
public class PixelArt {

    /**
    * Constant for two.
    */
    private static int TWO = 2;

    /**
    * Unicode for changing text color and background color back
    * to its original form.
    */
    private static String RESET = "\033[0m";

    /**
    * The size of one block in the pixel function.
    */
    private static String onePixel = "    ";
    /**
    * The size of three quarters of a block in the pixel function.
    */
    private static String threeQuarterPixel = "   ";
    /**
    * The size of half of a block in the pixel function.
    */
    private static String halfPixel = "  ";
    /**
    * The size of a quarter of a block in the pixel function.
    */
    private static String quarterPixel = " ";

    /**
    * An empty constructor.
    */
    public PixelArt() {
    }

    /**
    * Pixel art for "YOU WIN".
    * The comments on the art go up by twos (1,3,5) because I print each
    * "block" of the letter on two seperate lines to make it bigger.
    *
    * @param title the title of the pixel art you want to print
    * @param backgroundColor the background color
    * @param textColor the color of the text
    */
    public void pixelArt(final String title, final String backgroundColor, final String textColor) {
        if (title.equals("you win")) {
            pixelArt("you", backgroundColor, textColor);
            pixelArt("win", backgroundColor, textColor);
        }

        if (title.equals("you lose")) {
            pixelArt("you", backgroundColor, textColor);
            pixelArt("lose", backgroundColor, textColor);
        }

        if (title.equals("win")) {
            for (int counter = 0; counter < TWO; counter++) {
                // Top of W / Top of I / Top of N
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + textColor + onePixel + onePixel + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + textColor + onePixel + halfPixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + halfPixel + textColor + onePixel);
            } 
            for (int counter = 0; counter < TWO; counter++) {
                // Third to top of W / Third to top of I / Third to top of N
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + quarterPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + halfPixel + textColor + onePixel + halfPixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + halfPixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + quarterPixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) { 
                // 5th to top of W / 5th to top of I / 5th to top of N
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + textColor + onePixel + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + halfPixel + textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) { 
                // 7th to top of W / 7th to top of I / 7th to top of N
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + threeQuarterPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + halfPixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(halfPixel + onePixel + onePixel + onePixel + onePixel + onePixel + quarterPixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) { 
                // 9th to top of W / 9th to top of I / 9th to top of N
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(halfPixel + textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) {
                // 11th to top of W / 11th to top of I / 11th to top of N
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + quarterPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(halfPixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(quarterPixel + onePixel + onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) {
                // 13th to top of W / 13th to top of I / 13th to top of N
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + halfPixel + textColor + onePixel + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + textColor + onePixel + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(halfPixel + onePixel + onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) { 
                // 15th to top of W / 15th to top of I / 15th to top of N
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + threeQuarterPixel + textColor + onePixel + halfPixel);
                System.out.print(backgroundColor);
                System.out.print(halfPixel + onePixel + onePixel + textColor + onePixel + halfPixel);
    
                System.out.print(backgroundColor);
                System.out.print(threeQuarterPixel + onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel + onePixel + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
            }

            // Buffer lines
            System.out.print(backgroundColor);
            System.out.println("\n");
        }

        if (title.equals("lose")) {
            for (int counter = 0; counter < TWO; counter++) {
                // Top of L / Top of O / Top of S / Top of E
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + textColor + onePixel + onePixel + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel + onePixel + onePixel + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) {
                // Third to top of L / Third to top of O / Third to top of S / Third to top of E
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) {
                // 5th to top of L / 5th to top of O / 5th to top of S / 5th to top of E
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) {
                // 7th to top of L / 7th to top of O / 7th to top of S / 7th to top of E
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + halfPixel + textColor + onePixel + onePixel + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel + onePixel + onePixel + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) {
                // 9th to top of L / 9th to top of O / 9th to top of S / 9th to top of E
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel +  textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) {
                // 11th to top of L / 11th to top of O / 11th to top of S / 11th to top of E
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel +  textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) {
                // 13th to top of L / 13th to top of O / 13th to top of S / 13th to top of E
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel +  textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) {
                // 15th to top of L / 15th to top of O / 15th to top of S / 15th to top of E
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel + onePixel + onePixel + onePixel + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + textColor + onePixel + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + textColor + onePixel + onePixel + onePixel);

                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel + onePixel + onePixel + onePixel);
            }






            // Buffer lines
            System.out.print(backgroundColor);
            System.out.println("\n");
        }

        if (title.equals("you")) {
            // Starting buffer of magenta
            System.out.println(backgroundColor);
            for (int counter = 0; counter < 23; counter++) {
                System.out.println(quarterPixel);
            }
            for (int counter = 0; counter < TWO; counter++) {
                // Top of Y / Top of O / Top of U
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + textColor + onePixel + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) { 
                // Third to top of Y / Third to top of O / Third to top of U 
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + quarterPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + halfPixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + threeQuarterPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) { 
                // 5th to top of Y / 5th to top of O / 5th to top of U 
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) {
                // 7th to top of Y / 7th to top of O / 7th to top of U 
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + threeQuarterPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + halfPixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(halfPixel + onePixel + onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + threeQuarterPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) { 
                // 9th to top of Y / 9th to top of O / 9th to top of U 
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(textColor + onePixel + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + threeQuarterPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(halfPixel + onePixel + onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + threeQuarterPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) { 
                // 11th to top of Y / 11th to top of O / 11th to top of U 
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) {
                // 13th to top of Y / 13th to top of O / 13th to top of U 
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + halfPixel + textColor + onePixel);
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel +  textColor + onePixel);
            }
            for (int counter = 0; counter < TWO; counter++) {
                // 15th to top of Y / 15th to top of O / 15th to top of U 
                System.out.println(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + onePixel + onePixel + textColor + onePixel + onePixel);
    
                System.out.print(backgroundColor);
                System.out.print(onePixel + onePixel + onePixel + onePixel + textColor + onePixel);
                System.out.print(onePixel + onePixel + onePixel + textColor + onePixel);
            }

            // Buffer lines
            System.out.print(backgroundColor);
            System.out.println("\n\n\n");

        }

        // Resets all the colors and background colors
        System.out.print(RESET);
    }
}
