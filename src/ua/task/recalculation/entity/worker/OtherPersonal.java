package ua.task.recalculation.entity.worker;

import java.time.LocalDateTime;

/**
 * Created by Denis Starovoitenko on 23.08.2017.
 */
public class OtherPersonal extends Worker {
    private String description;

    public OtherPersonal(FullName fullName, LocalDateTime birthday, LocalDateTime hireDate, double salary) {
        super(fullName, birthday, hireDate, salary);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
