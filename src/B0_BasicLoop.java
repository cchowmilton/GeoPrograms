public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        gridOfSmallSquares();
        //columnOfSmallSquares();
        //plane.isTrail=true;
        //for(int x=0;x<500;x=x+100)
        //{
        //System.out.println(x);
        //plane.teleport((x+10), 300);
        //plane.square(100);

        //}
    }

    public void rowOfSmallSquares (int y) {
        plane.trailWidth = 5;
        plane.isTrail = true;
        for (int x = 0; x < 100; x = x + 10) {
            System.out.println(x);
            plane.teleport((x + 10), y);
            plane.square(10);
        }
        //in this method, create a long row of 10 pixel by 10 pixel squares


        //put your loop here

    }

    public void columnOfSmallSquares(int x){
        //in this method, create a long column of 10 pixel by 10 pixel squares
        plane.trailWidth=5;
        plane.isTrail = true;
        plane.teleport(300,0);
        for (int y=0; y<500; y=y+10){
            System.out.println(y);
            plane.teleport(x, (y+10));
            plane.square(10);
        }

        //put your loop here

    }
    public void gridOfSmallSquares() {
        plane.trailWidth = 5;
        for (int x = 0; x < 80; x += 10) {
            for (int y = 0; y < 50; y += 10) {
                plane.setColor(255-x*3, y*5, 100+y*3);
                System.out.println("x: " + x + ", y: " + y);
                plane.teleport(x, y);
                plane.square(10);
            }
        }
        plane.teleport(200,500);
    }

    public void fitness() {
        for (int s = 0; s < 5; s = s + 1) {//sprints
            System.out.println("sprint" + s);
            for (int p = 0; p < 10; p = p + 1) { //push ups
                System.out.println("pushup" + p);
            }
        }
    }
}
