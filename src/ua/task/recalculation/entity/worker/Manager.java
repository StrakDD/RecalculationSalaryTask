package ua.task.recalculation.entity.worker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis Starovoitenko on 23.08.2017.
 */
public class Manager extends Worker {
    private List<Worker> manageWorkers;

    public Manager(FullName fullName, LocalDateTime birthday, LocalDateTime hireDate, double salary) {
        super(fullName, birthday, hireDate, salary);
        manageWorkers = new ArrayList<>();
    }

    public List<Worker> getManageWorkers() {
        return manageWorkers;
    }

    public void setManageWorkers(List<Worker> manageWorkers) {
        this.manageWorkers = manageWorkers;
    }
}
