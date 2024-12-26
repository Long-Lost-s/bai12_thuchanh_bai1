package com.example.quanlykhachhang.service;

import com.example.quanlykhachhang.model.Customer;

import java.util.*;

public class CustomerServiceImp implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Long", "l@gamil.com", "HaNoi"));
        customers.put(2, new Customer(2, "Manh", "m@gamil.com", "BacNinh"));
        customers.put(3, new Customer(3, "Vuong", "v@gamil.com", "HaNoi"));
        customers.put(4, new Customer(4, "Son", "s@gamil.com", "HaNoi"));
        customers.put(5, new Customer(5, "Dung", "d@gamil.com", "NgheAn"));
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
