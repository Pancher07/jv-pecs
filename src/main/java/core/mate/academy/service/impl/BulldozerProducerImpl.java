package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozers;

    public BulldozerProducerImpl() {
        bulldozers = new ArrayList<>();
        addBulldozers();
    }

    @Override
    public List<Bulldozer> get() {
        return new ArrayList<>(bulldozers);
    }

    private void addBulldozers() {
        bulldozers.addAll(createBulldozers());
    }

    private List<Bulldozer> createBulldozers() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setColor("Yellow");
        bulldozer1.setName("Jack");

        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setColor("Green");
        bulldozer2.setName("CAT");

        return List.of(bulldozer1, bulldozer2);
    }
}
