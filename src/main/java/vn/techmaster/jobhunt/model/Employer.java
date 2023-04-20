package vn.techmaster.jobhunt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Employer {
    public static int ID = 0;
    private int id;
    private String name;
    private String desc;
    private String salary;

    public Employer() {
        this.id = ID;
        ID++;
    }
}
