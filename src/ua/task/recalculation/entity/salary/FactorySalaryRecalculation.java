package ua.task.recalculation.entity.salary;

/**
 * Created by Denis Starovoitenko on 25.08.2017.
 */
public class FactorySalaryRecalculation {
    public static SalaryRecalculation getSalaryRecalculation(String type){
        if(type.equalsIgnoreCase("uniform")){
            return new UniformRecalculation();
        }else if (type.equalsIgnoreCase("proportional")){
            return new ProportionalRecalculation();
        }

        return new UniformRecalculation();
    }
}
