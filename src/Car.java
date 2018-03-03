/**
 * A simple Car implementation
 */
public class Car  {
    double TANK_CAPACITY = 50.0;       // capacity of gas tank in litres
    double LITRES_PER_100KM = 10.0;    // gas consumption in litres per 100km
    boolean potholes = false;

    double fuel = TANK_CAPACITY;
    public String condition;
    private int totalDistanceTravelled;

    static {

    }

    // EFFECTS: a new car with a full tank, not moving, in a working condition
    public Car() {
        fuel = TANK_CAPACITY;
        condition = "working";
        totalDistanceTravelled = 0;
    }

    // EFFECTS: returns how much fuel is left in a tank of the car
    public double getFuel() {
        return fuel;
    }

    // EFFECTS: sets the fuel to be curFuel
    public void setFuel(int curFuel) {
        this.fuel = curFuel;
    }

    // EFFECTS: returns the condition of the car
    public String getCondition() {
        return condition;
    }

    // EFFECTS: sets the condition to cond
    public void setCondition(String cond) {
        this.condition = cond;
    }

    // EFFECTS: returns total distance travelled in km
    public int getTotalDistanceTravelled() {
        return totalDistanceTravelled;
    }

    // MODIFIES: this
    // EFFECTS: sets the condition to broken if there is the ditance travelled is too big
    // for this model assume that 1000 is enough to break a car
    public void broken() {
        //TODO: implement the method
        fuel = 0;
        condition = "broken";
        totalDistanceTravelled = 1000;
    }

    // MODIFIES: this
    // EFFECTS: fixes the car and sets the condition to "working"
    public void repair() {
        //TODO: implement the method
        fuel = TANK_CAPACITY;
        condition = "working";
        totalDistanceTravelled = 2;
    }

    // EFFECTS: returns maximum distance (in kms) that car can be driven (rounded to nearest km)
    // until gas tank is empty
    public int getDistanceUntilEmpty() {
        return (int) (fuel / LITRES_PER_100KM * 100);
    }

    // REQUIRES: amount > 0
    // MODIFIES: this
    // EFFECTS: adds amount litres of gas to tank; if there is insufficient space in tank to hold
    // the given amount, any excess is assumed to overflow and not be added.
    public void addGasToTank(double amount) {
        if (fuel > 0) {
            fuel += 13.0;
        }
        if (fuel > TANK_CAPACITY){
            fuel = TANK_CAPACITY;
        }

        //TODO: implement the method
    }

    // REQUIRES: condition is "working"
    // distance > 0 AND distance <= getDistanceUntilEmpty()
    // MODIFIES: this
    // EFFECTS: move the car at a specified speed for given time
    public void drive(int speed, int time) {
        // assume the acceleration is uniform and car moves at a constant speed km/h
        int distance;
        distance = speed / time;
        //TODO: implement the method
    }
    //TODO: ADD TWO MORE METHODS CREATED BY YOU. ONE OF THEM MUST INCLUDE A FOR LOOP.
    public void SpendGas(){
        setFuel((int) fuel - 1);
    }
    public void BrokeFaster() {
        if (potholes = true) {
            totalDistanceTravelled += 1;
        }
    }
}