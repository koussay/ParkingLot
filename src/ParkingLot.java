import java.util.List;

public class ParkingLot {
    public List<Level> levels;

    public ParkingLot(List<Level> levels) {
        this.levels = levels;
    }
    public boolean park(Car car){
        for (Level level: levels){
            if (level.park(car)){
                return true;
            }

        }
        return false;
    }
}
