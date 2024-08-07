public class CustomerService {
    private CustomerRepository custRepo;
    public CustomerService(CustomerRepository custRepo){
        this.custRepo=custRepo;

    }

    public Customer getCustomrerId(String custId){
        return custRepo.findCustomerById(custId);
    }
}
