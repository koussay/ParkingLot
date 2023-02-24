import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Level> levels= List.of(new Level(0,2), new Level(1,2));
        ParkingLot myParking= new ParkingLot(levels);

        System.out.println(myParking.park(new Car("L123")));
        System.out.println(myParking.park(new Car("L124")));
        System.out.println(myParking.park(new Car("L125")));
        System.out.println(myParking.park(new Car("L126")));

        System.out.println(myParking.park(new Car("L127")));
        System.out.println(myParking.park(new Car("L128")));
        System.out.println(myParking.park(new Car("L129")));
        System.out.println(myParking.park(new Car("L130")));
        // This will output False as all parkingslots are occupied !!
        System.out.println(myParking.park(new Car("L131")));
    }
}