package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Customer;

public class MainCustomer {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setVatRegistrationNo("123456789");

        Customer anna = new Customer(2, "Anna", "G.", "234671234", "69999999", "Attica", "Central Attica", "Athens",
                "Patision", "76", "10434");

        System.out.println("Anna's Vat: " + anna.getVatRegistrationNo());
        System.out.println("Customer ΑΦΜ: " + customer.getVatRegistrationNo());
    }
}
