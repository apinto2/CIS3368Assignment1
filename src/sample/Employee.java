package sample;

import java.util.UUID;

public class Employee implements Worker {
    public String firstName;
    public String lastName;
    public UUID id;
    public boolean isActive;

    @Override
    public String toString(){
        return this.firstName+ " "+ this.lastName; //use this for class properties  especially if parameter
    }


    @Override
    public void hire() {
        isActive= true; //default is false

    }

    @Override
    public void fire() {
        isActive=false;

    }
}
