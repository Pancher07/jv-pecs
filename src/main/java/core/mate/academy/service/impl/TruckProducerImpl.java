package core.mate.academy.service.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    private List<Truck> trucks;

    public TruckProducerImpl() {
        trucks = new ArrayList<>();
        addTrucks();
    }

    @Override
    public List<Truck> get() {
        return new ArrayList<>(trucks);
    }

    private void addTrucks() {
        trucks.addAll(createTrucks());
    }

    private List<Truck> createTrucks() {
        Truck truck1 = new Truck();
        truck1.setColor("Blue");
        truck1.setName("DAF");

        Truck truck2 = new Truck();
        truck2.setColor("Silver");
        truck2.setName("Mercedes");

        return List.of(truck1, truck2);
    }
}
