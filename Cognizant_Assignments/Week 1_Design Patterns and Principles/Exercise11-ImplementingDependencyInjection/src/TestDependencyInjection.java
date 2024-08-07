public class TestDependencyInjection {
    public static void main(String[] args) {
        CustomerRepository custRepo=new CustomerRepositoryImpl();

        CustomerService custSer=new CustomerService(custRepo);

        Customer cust=custSer.getCustomrerId("5");

        System.out.println(cust);
    }
}
