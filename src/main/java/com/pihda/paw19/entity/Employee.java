package com.pihda.paw19.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Employee")
public class Employee {

    private @Id
    @GeneratedValue
    @Column(name = "id")
    Long id;

    protected Employee() {

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

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    //    public enum Role {
//        MANAGER,
//        JANITOR,
//        OFFICE_BOY,
//        SECRETARY
//    }
    @Column(name = "role")
    private String role;

    public Employee(Long id, String firstName, String lastName, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && role == employee.role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, role);
    }
}
