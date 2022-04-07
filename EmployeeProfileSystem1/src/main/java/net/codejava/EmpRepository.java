package net.codejava;

        import org.springframework.data.jpa.repository.JpaRepository;
public interface EmpRepository extends JpaRepository<EmployeeProfile, Long> {
}