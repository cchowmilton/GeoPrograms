import com.sun.rowset.internal.Row;

public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        //set colour is a method that changes the colour
        plane.setColor(200, 0, 0);
       RowOfSquares();


//for( starting value; end condition; counting interval)
        //for (int i = 2; i < 13; i = i + 2) {

           // System.out.println(i);
            //plane.startingAngle(0);
            //plane.triangle(i);
        }


//start i=30
        // end i<120

    public void fives() {
       for (int i = 5; i < 36; i = i+5) {
           System.out.println(i);
       }
    }

    public void countDown() {
        for (int i = 7; i > 1; i = i - 1) {
            System.out.println(i);
        }
    }

public void RowOfSquares() {
    for (int i = 0; i < 9; i = i + 1) {
        DrawASquare();
        plane.turn(-90);
        plane.isTrail = false;
        plane.move(20);
    }
}

    public void DrawASquare(){
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 10;
            for (int i = 0; i < 5; i = i + 1) {
                plane.move(111);
                plane.turn(90);
            }
        }


    public void triangle(){
        for (int i = 0; i <3; i = i+1) {
            plane.move(111);
            plane.turn(120);
        }
    }

    public void house(){
        DrawASquare();
        plane.teleport(201, 248);
        plane.startingAngle(0);
        triangle();
    }

    //right here add more methods
    //want these to be helpful to drawing a scene
    //draw a car, bird, tree, start etc, bush

    //define them here and then call them in the go method
}


/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/