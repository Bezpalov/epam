package main.java.com.learning.batlleship.ships.fabric;

import main.java.com.learning.batlleship.ships.concreteships.Ship;
import main.java.com.learning.batlleship.ships.concreteships.ThreeDeckShip;

public class ThreeDeckShipCreator implements ShipFactory {

    @Override
    public Ship createShip() {
        return new ThreeDeckShip();
    }

    @Override
    public Ship[] createSetOfShips() {
        Ship[] ships = {new ThreeDeckShip(), new ThreeDeckShip()};
        return ships;
    }
}
