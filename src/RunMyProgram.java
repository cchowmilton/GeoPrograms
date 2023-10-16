

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new B3_HalfTheRed() );
        run.planeIcon = "plane.png";
        run.pictureFileName="Marilyn-Suite-1024x1024.jpeg";
        run.HEIGHT=600;
        run.WIDTH=600;
        run.Refresh();

        //new Thread(run).start();
    }
}
