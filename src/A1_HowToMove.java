public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.pausetime = 2;
        plane.startingAngle(180);
        plane.setColor(230,100,54);
        plane.isTrail = true;
        for (int i =0; i<180; i++){
            plane.move(2);
            plane.moveLeft(-1);
        }
        plane.isTrail = false;
        plane.move(50);
        plane.isTrail = true;
        plane.startingAngle(285);
        plane.move(350);
        plane.startingAngle(75);
        plane.move(350);
        plane.moveLeft(180);
        plane.move(200);
        plane.startingAngle(180);
        plane.move(75);
        plane.startingAngle(90);
        plane.isTrail = false;
        plane.move(193.1851653);
        plane.startingAngle(0);
        plane.move(180);
        plane.isTrail = true;
        plane.startingAngle(270);
        plane.move(338.0740392);
        plane.startingAngle(0);
        for (int i =0; i<180; i++){
            plane.move(1);
            plane.moveLeft(1);
        }
        plane.startingAngle(45);
        plane.move(150);
        plane.startingAngle(0);
        plane.isTrail = false;
        plane.move(50);
        plane.startingAngle(-90);
        plane.move(338.0740392);
        plane.startingAngle(0);
        plane.move(100);
        plane.startingAngle(180);
        plane.isTrail = true;
        for (int i =0; i<180; i++) {
            plane.move(1);
            plane.moveLeft(-1);
        }
        for (int i =0; i<180; i++) {
            plane.move(1);
            plane.moveLeft(1);
        }
        plane.isTrail = false;
        plane.startingAngle(-25);
        plane.move(250);
        plane.startingAngle(-90);
        plane.isTrail = true;
        plane.move(330);
        plane.startingAngle(180);
        plane.move(75);
        plane.moveLeft(180);
        plane.move(150);
        plane.isTrail = false;
        plane.move(50);
        plane.isTrail = true;
        plane.startingAngle(90);
        plane.move(330);
        plane.startingAngle(0);
        plane.move(50);
        plane.isTrail = false;
        plane.startingAngle(-90);
        plane.move(165);
        plane.startingAngle(180);
        plane.isTrail = true;
        plane.move(50);
        plane.isTrail = false;
        plane.startingAngle(-90);
        plane.move(165);
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.move(50);
        plane.isTrail = false;
        plane.move(50);
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.move(330);
        plane.moveLeft(180);
        plane.move(330);
        plane.startingAngle(75);
        plane.move(375);
        plane.startingAngle(-90);
        plane.move(330);


    }

}


/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/