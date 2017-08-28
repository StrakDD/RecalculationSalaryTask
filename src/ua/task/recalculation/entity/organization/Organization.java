package ua.task.recalculation.entity.organization;

/**
 * Created by Denis Starovoitenko on 25.08.2017.
 */
public abstract class Organization {
    private double salaryFound;

    public Organization(double salaryFound) {
        setSalaryFound(salaryFound);
    }

    public double getSalaryFound() {
        return salaryFound;
    }

    public void setSalaryFound(double salaryFound) {
        if (salaryFound < 0){
            throw new IllegalArgumentException();
        }
        this.salaryFound = salaryFound;
    }

    public abstract double getWorkersSalary();
    public abstract void recalculateSalary(String type);
}
