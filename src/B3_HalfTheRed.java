public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());

        for (int row = 1; row < 600; row = row + 1) {
            for (int col = 1; col < 600; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                //plane.teleport(col, 488 - row);

                if(red>100 && red<160 && green>130 && col>399 && row<201) {
                    plane.setPixelColor(0, 100, 100);
               }
                if(red>200 && green<50 && col>199 && col<400 && row<201) {
                    plane.setPixelColor(100, 0, 100);
                }
                if(red<100 && green>150 && blue>160 && col>0 && col<201 && row<201) {
                    plane.setPixelColor(100, 100, 0);
                }
                if(red>190 && green>50 && green<100 && blue>110 && col>0 && col<201 && row<401 && row>199) {
                    plane.setPixelColor(50, 100, 0);
                }
                if(red>220 && green>50 && green<120 && blue>120 && col>199 && col<401 && row<401 && row>200) {
                    plane.setPixelColor(100, 25, 30);
                }
                if(red>130 && red<200 && green>180 && green<255 && blue>180 && col>399 && row<401 && row>200) {
                    plane.setPixelColor(50, 30, 100);
                }
                if(red>200 && red<250 && green>165 && green<220 && blue>180 && col>0 && col<201 && row>399) {
                    plane.setPixelColor(80, 100, 20);
                }
                if(red>5 && red<50 && green>5 && green<50 && blue>5 && col>199 && col<401 && row>399) {
                    plane.setPixelColor(30, 10, 200);
                }
                if(red>-1 && red<20 && green>140 && green<200 && blue>150 && col>399 && row>399) {
                    plane.setPixelColor(200, 10, 50);
                }

            }
        }
    }
}


/* 

// Below is a list of the variables in plane and how to set them:

   plane.anglefacing=90 ;     // Sets the angle the plane is facing
	plane.xpos=100;            // Sets the xposition of the plane
	plane.ypos=100;            // Sets the yposition of the plane
   plane.isTrail=false;       // Sets if the plane has a trail
   plane.trailWidth=1;        // Sets the width of the trail from the plane
   plane.pausetime=1;         // Sets how long the plane pauses each time it moves, 
                                 make this bigger to watch the drawing happen
   
// Below are all the methods the plane can use:

   System.out.println("fun" + variable);  // Prints text to the window + the value of the variable
   plane.drawWords("this is fun");  // Prints text to the applet at the location of the plane
   plane.circle(10);                // Draws a circle of radius 10
   plane.square(50);                // Draws a square with side length 50, 
                                      the plane finishes in the same direction it starts  
   plane.house(100);                // Draws a house with a bottom edge of 100
   plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
   plane.move(100);                 // Moves the plane forward (the direction it is facing) 100 pixels
   plane.teleport(111, 222);        // Relocates the plan to the x position 111 and the y position 222, 
                                      there is no trail with teleport
   plane.turn(90);                  // Turns the plan 90 degrees counterclockwise
   plane.setColor(255, 255, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
   plane.setPixelColor(255, 255, 255);  // Sets the pixel color at the plane's location to Red, Green, Blue; max value of 255, min 0
   plane.howMuchBlue();             // Returns a number between 0 and 255 describing how much blue there is
   plane.howMuchGreen();            // Returns a number between 0 and 255 describing how much green there is
   plane.howMuchRed();              // Returns a number between 0 and 255 describing how much red there is
   plane.random(0, 100);            // Returns an integer on the interval 0 to 99
   
*/