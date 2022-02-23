import java.util.ArrayList;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 2222;
        MyName myName;
        myName = (x) -> x + "Kun";
        System.out.println(myNum.getValue());
        System.out.println(myName.getCallingName(3));
        
        //Lambda Block
        
        getCustomers().forEach(customer -> {
            if (customer.getAge() > 25) {
                System.out.println(customer);
            }
        });

        //Method Reference
        //getCustomers().forEach(System.out::println);
    }

    private static List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<Customer>();
         
        customers.add(new Customer(1000l,"John","Smith",25));
        customers.add(new Customer(1001l,"Jane","Doe",36));
        customers.add(new Customer(1002l,"Jerry","Tyne",20));
        customers.add(new Customer(1003l,"Glenn","First",29));
        customers.add(new Customer(1004l,"Beth","Abbey",35));
 
        return customers;
    }
}

interface MyNumber {
    double getValue();
}

interface MyName {
    abstract String getCallingName(int x);

    private static String getStaticString() {
        return "Static String";
    }

    static String getName() {
        return "XXXXX";
    }

    static String getName2() {
        return "XXXXX2";
    }
}
