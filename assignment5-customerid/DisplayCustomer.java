
class Customer {
    final int customerid;
    final String name;

    public Customer() {
        customerid = 54;
        name = "Vikas Kumar Verma";
    }

}
 public class DisplayCustomer{
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println("Customer name:" + customer1.name);
        System.out.println("Customer ID :" + customer1.customerid);
    }
}
