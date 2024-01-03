public class CoordinateTester {

    public static void main(String [] args){
        Coordinate v = Coordinate.fromXY(3,4); // (3,4)
        Coordinate p = Coordinate.fromPolar(7.2, (Math.PI/2)); // (7.2, pi/2)
        System.out.println(v);
        System.out.println(p);
    }

}
