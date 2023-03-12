public class Customer {
    private int id;// id bir data yı bir diyerinden ayımak için kullanılır
    private String customerNumber;
    private String phone;
    // not: işlem yapmadığın sayıları string olarak hafızada tut!!!


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
