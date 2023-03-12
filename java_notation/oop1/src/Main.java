import java.net.IDN;

public class Main {
    public static void main(String[] args) {
/*        //oop= object oriented programming: nesne yönenimli programlama

//    2 tip class var:
//        1- operasyon tutucu
//        2- özelliltutucu olanlar
//        not: class isimleri PascalCase yazılır Her kelimenin ilk harfi büyük ve boşluk bırakılmaz



        Product product1 = new Product();// bir class böyle tanımlanır
        //set value: değerleri set ettik : ayarladık
        product1.name = "Delongi Kahve makinesi";
        product1.unitPrice = 15420.99;
        product1.discount = 7;
        product1.unitsInStock = 3;
        product1.imageUrl = "bilmemne.jpg";
        //get : eldet etmek, okumak(read)
        //System.out.println(product.name);

        Product product2 = new Product();// bir class böyle tanımlanır
        //set value: değerleri set ettik : ayarladık
        product2.name = "Smeg Kahve makinesi";
        product2.unitPrice = 50420.99;
        product2.discount = 12;
        product2.unitsInStock = 5;
        product2.imageUrl = "bilmemne2.jpg";

        Product product3 = new Product();// bir class böyle tanımlanır
        //set value: değerleri set ettik : ayarladık
        product3.name = "Kichen Aid Kahve makinesi";
        product3.unitPrice = 95420.99;
        product3.discount = 5;
        product3.unitsInStock = 4;
        product3.imageUrl = "bilmemne3.jpg";


        Product[] products = {
                product1,product2,product3
        };

        System.out.println("<ul>");
        for (Product product:products){
            System.out.println(product.name);
        }
        System.out.println("</ul>");

*/








        Product product1 = new Product();
        product1.setName("Delangi Kahve Makinesi");
        product1.setUnitPrice(7500.42);
        product1.setDiscount(7);
        product1.setImageUrl("bilmemne1.jpg");
        product1.setUnitsInStock(3);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(5315.21);
        product2.setDiscount(8);
        product2.setImageUrl("bilmemne2.jpg");
        product2.setUnitsInStock(5);

        Product product3 = new Product();
        product3.setName("Kichen Aid Kahve Makinesi");
        product3.setUnitPrice(54214.23);
        product3.setDiscount(9);
        product3.setImageUrl("bilmemne1.jpg");
        product3.setUnitsInStock(4);

        // okurken get metodu, yazarken set metodu kullanılır

        Product[] products = { product1,product2,product3
        };

        for (Product product:products){
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("5346214665554");
        individualCustomer.setPhone("56478544785");
        individualCustomer.setFirstName("Doğukan");
        individualCustomer.setLastName("Öztürk");

        CorporateCustomer corporateCustomer =new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("4615541365");
        corporateCustomer.setPhone("4615615653");
        corporateCustomer.setCompanyName("Empty Cop.");
        corporateCustomer.setTaxNumber("16848764");

        Customer[] customers = {
                corporateCustomer,individualCustomer
        };
        for (Customer customer:customers){
            System.out.println(customer.getId());
            System.out.println(customer.getCustomerNumber());
            System.out.println(customer.getPhone());
        }











    }
}