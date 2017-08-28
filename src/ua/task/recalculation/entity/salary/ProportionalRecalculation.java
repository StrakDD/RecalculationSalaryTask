package ua.task.recalculation.entity.salary;

import ua.task.recalculation.entity.worker.Worker;

import java.util.List;

/**
 * Created by Denis Starovoitenko on 23.08.2017.
 */
public class ProportionalRecalculation implements SalaryRecalculation {

    @Override
    public void recalculation(List<Worker> workers) {
        System.out.println("Proportional recalculation among all workers");
    }
}
