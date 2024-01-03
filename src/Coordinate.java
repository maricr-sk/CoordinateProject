// use of static factory methods in place of conStructors

public class Coordinate {

    private final double x;
    private final double y;

    public static Coordinate fromXY(double x, double y){
        return new Coordinate(x,y);
    }

    public static Coordinate fromPolar(double r, double theta){
        double tempX = r * Math.cos(theta);
        double tempY = r * Math.sin(theta);
        return new Coordinate(tempX, tempY);
        //do not need second constructor any longer
    }

    private Coordinate(double x, double y){ //made this private to force the user to use the static methods
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        System.out.println();
        return "(" + this.x + ", " + this.y + ")";
    }

    /*
    public Coordinate(double x, double y){
        this.x = x;
        this.y = y;
    }


    public Constructor(double r, double theta){
        this.x = r * Math.cos((theta * (Math.pi()*180));
        this.y = r * Math.sin((theta * (Math.pi()*180));
    }

    //write getters/setters for x, y, r and theta


    public double getX(){  return x; }

    public double getY(){   return y; }

    public double getR(){ return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2)); }

    public double getTheta(){ return Math.atan(this.y/this.x);  }

    */
}
