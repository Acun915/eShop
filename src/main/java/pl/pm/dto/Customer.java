package pl.pm.dto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @Column(name = "cust_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Genders gender;

    @Column(name = "email_address")
    private String emailAddress;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    public Customer(String firstName, String lastName, Genders gender, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.orders = new ArrayList<>();
    }

    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Genders getGender() {
        return gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Genders gender) {
        this.gender = gender;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
