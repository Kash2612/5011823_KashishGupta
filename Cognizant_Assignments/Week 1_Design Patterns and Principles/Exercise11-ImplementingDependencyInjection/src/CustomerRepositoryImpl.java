public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer findCustomerById(String custId){
        return new Customer(custId,"Jay Rajput", "jay.raj@abc.com");
    }

}
