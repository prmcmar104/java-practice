package interfacedemo.interfaceexample;

/**
 * Created by Jay Vaghani
 */
public class Bike implements Vehicle{
    int speed;
    int gear;

    // to change gear
    @Override
    public void changeGear(int gear){
        this.gear = gear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}
