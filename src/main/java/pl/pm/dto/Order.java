package pl.pm.dto;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "ord_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "fk_customer")
    private Customer customer;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    public Order() {
    }

    public Order(Customer customer) {
        this.customer = customer;
        this.purchaseDate = LocalDate.now();
    }
}
