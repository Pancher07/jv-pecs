package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.impl.BulldozerProducerImpl;
import core.mate.academy.service.impl.ExcavatorProducerImpl;
import core.mate.academy.service.impl.TruckProducerImpl;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            MachineProducer<Bulldozer> producer = new BulldozerProducerImpl();
            return (List<T>) producer.get();
        } else if (type == Excavator.class) {
            MachineProducer<Excavator> producer = new ExcavatorProducerImpl();
            return (List<T>) producer.get();
        } else if (type == Truck.class) {
            MachineProducer<Truck> producer = new TruckProducerImpl();
            return (List<T>) producer.get();
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
