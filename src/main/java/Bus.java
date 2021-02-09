import jdk.jfr.internal.consumer.RecordingInput;

import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination) {
        this.destination = destination;
        this.capacity = 40;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if(this.getPassengers() < this.capacity){
            this.passengers.add(person);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
