public class Main {
    public static void main(String[] args) {

//        Product product = new Product(
//                1,
//                "Asus Laptop",
//                "Laptop",
//                2000,
//                15
//        );

        Product product= new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(920000.99);
        product.setStockAmount(12);



        ProductManager produxtManager = new ProductManager();
        produxtManager.add(product);

        System.out.println("Ürün kodu = "+product.getCode());
    }
}