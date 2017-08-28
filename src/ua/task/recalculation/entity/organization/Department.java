package ua.task.recalculation.entity.organization;

import ua.task.recalculation.entity.salary.FactorySalaryRecalculation;
import ua.task.recalculation.entity.worker.Worker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis Starovoitenko on 23.08.2017.
 */
public class Department extends Organization{
    private List<Worker> workers;

    public Department(double salaryFound) {
        super(salaryFound);
        workers = new ArrayList<>();
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    @Override
    public double getWorkersSalary() {
        double result = 0;

        for (Worker worker : workers) {
            result = result + worker.getSalary();
        }

        return result;
    }



    @Override
    public void recalculateSalary(String type) {
        FactorySalaryRecalculation.getSalaryRecalculation(type).recalculation(workers);
    }

    public void addWorker(Worker worker){
        workers.add(worker);
    }
}
