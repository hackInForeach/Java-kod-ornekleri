// PascalCase
public class Product {
    //public: dışarıya erişimi açar
    //public class Product = sen bir classsın adında Prodcut
    // private: bu classa özel
    //şuan şablon hazırlanıyor...
    //field: classın alanarı ve cameCase yazılır= aşağıdakiler
    private String name;
    private double unitPrice; // birim fiyat
    private double discount; // indirim oranı
    private String imageUrl; // ürünün resmi(yada resimleri: dizi şeklinde olursa)
    private int unitsInStock; // stokta ki adedi


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
