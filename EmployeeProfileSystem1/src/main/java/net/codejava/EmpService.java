package net.codejava;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Transactional;
@Service
public class EmpService {
    @Autowired
    private EmpRepository repo;
    public List<EmployeeProfile> listAll() {
        return repo.findAll();
    }

    public void save(EmployeeProfile employee) {
        repo.save(employee);
    }

    public EmployeeProfile get(long id)
    {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}

