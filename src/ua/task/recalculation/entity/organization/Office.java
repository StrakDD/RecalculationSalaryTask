package ua.task.recalculation.entity.organization;

import ua.task.recalculation.entity.salary.FactorySalaryRecalculation;
import ua.task.recalculation.entity.worker.Worker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis Starovoitenko on 23.08.2017.
 */
public class Office extends Organization{
    private List<Department> departments;


    public Office(double salaryFound) {
        super(salaryFound);
        departments = new ArrayList<>();
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public double getWorkersSalary() {
        double result = 0;

        for (Department department : departments) {
            result = result + department.getWorkersSalary();
        }

        return result;
    }

    @Override
    public void recalculateSalary(String type) {
        List<Worker> allWorkers = new ArrayList<>();

        for (Department department : departments) {
            allWorkers.addAll(department.getWorkers());
        }

        FactorySalaryRecalculation.getSalaryRecalculation(type).recalculation(allWorkers);
    }

    public void addWorker(Worker worker, Department department){
        for (Department department1 : departments) {
            if (department1.equals(department)){
                department1.addWorker(worker);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

}
