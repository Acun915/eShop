package pl.pm;

import org.junit.Test;
import pl.pm.dao.CustomerDao;
import pl.pm.dao.OrderDao;
import pl.pm.dto.Customer;
import pl.pm.dto.Genders;
import pl.pm.dto.Order;

public class CustomerDaoTest {

    private CustomerDao customerDao = new CustomerDao();
    private OrderDao orderDao = new OrderDao();

    @Test
    public void shouldAddCustomerToDataBase() {
        Customer customer = new Customer("Przemyslaw", "Marciniec", Genders.M, "EMAIL");
        customerDao.addCustomer(customer);
        Order order = new Order(customer);
        orderDao.addOrder(order);
    }

    @Test
    public void shouldDeleteCustomerFromDataBase() {
        customerDao.deleteCustomer(1);
    }
}
