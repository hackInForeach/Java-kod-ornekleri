public class Main {
    public static void main(String[] args) {
        // inheritance: 2 nesne arasında miras bırakma yani kendi özelliklerini başkalarınında kullana bilmesi
        // ortak kodları extend ederk tek biryerden heerkesin kullanmasını sağlarsan sürdürülebilirkin açısından iyi olur (temel olarak)


        Customer customer = new Customer();
        Employee employee  = new Employee();
        customer.email="asdasd€gmail.com";
        employee.salary=8545;


        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        employeeManager.bestEmloye();
        customerManager.added();



    }
}