package ua.task.recalculation.entity.salary;


import ua.task.recalculation.entity.worker.Worker;

import java.util.List;

/**
 * Created by Denis Starovoitenko on 23.08.2017.
 */
public interface SalaryRecalculation {
    void recalculation(List<Worker> workers);
}
