package ua.task.recalculation.entity.worker;

import java.time.LocalDateTime;

/**
 * Created by Denis Starovoitenko on 23.08.2017.
 */
public class Worker {
    private FullName fullName;
    private LocalDateTime birthday;
    private LocalDateTime hireDate;
    private double salary;

    public Worker(FullName fullName, LocalDateTime birthday, LocalDateTime hireDate, double salary) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDateTime hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
