package vn.techmaster.jobhunt.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vn.techmaster.jobhunt.model.Employer;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployerRepository {
    private static ArrayList<Employer> employers = new ArrayList<>();

    public void addEmployer(Employer employer) {
        employers.add(employer);
    }

    public ArrayList<Employer> getEmployers() {
        return employers;
    }
}
