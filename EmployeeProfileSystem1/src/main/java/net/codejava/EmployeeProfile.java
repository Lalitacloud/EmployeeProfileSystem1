package net.codejava;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.util.Date;

@Entity
public class EmployeeProfile {
    private Long empcode;
    private String firstName;
    private String lastName;
    private Date dob;
    private Date doj;
    private Email emailid;
    private Long contactnum;
    private float salary;

    protected EmployeeProfile() {
    }

    protected EmployeeProfile(Long empcode,String firstName,String lastName, Date dob,Date doj,Email emailid,Long contactnum,float salary) {
        super();
        this.empcode = empcode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.doj = doj;
        this.emailid = emailid;
        this.contactnum = contactnum;
        this.salary =salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getEmpcode() {
        return empcode;
    }

    public void setEmpcode(Long empcode) {
        this.empcode = empcode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public Date getDoj() {
        return doj;
    }
    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Email getEmailid() {
        return emailid;
    }

    public void setEmailid(Email emailid) {
        this.emailid = emailid;
    }
    public Long getContactnum() {
        return contactnum;
    }

    public void setContactnum(Long contactnum) {
        this.contactnum = contactnum;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

