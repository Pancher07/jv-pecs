package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    private final List<Excavator> excavators;

    public ExcavatorProducerImpl() {
        excavators = new ArrayList<>();
        addExcavators();
    }

    @Override
    public List<Excavator> get() {
        return new ArrayList<>(excavators);
    }

    private void addExcavators() {
        excavators.addAll(createExcavators());
    }

    private List<Excavator> createExcavators() {
        Excavator excavator1 = new Excavator();
        excavator1.setColor("Black");
        excavator1.setName("Iron");

        Excavator excavator2 = new Excavator();
        excavator2.setColor("Red");
        excavator2.setName("CAT");

        return List.of(excavator1, excavator2);
    }
}
