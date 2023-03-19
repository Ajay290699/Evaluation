package sorting;

public class Product {

    static int discount;
    String name;
    int price;
    int quantity;

    Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    Product(int discount) {
        this.discount = discount;
    }

    public static int getDiscount() {
        return discount;
    }


    public void calcTotal() {
        int totalPrice = price * quantity;
        int discountedPrice = 0;
        if (discount == 0) {
            discountedPrice = totalPrice;
            System.out.println(discountedPrice);
        } else {
            discountedPrice = totalPrice - (totalPrice / discount);
            System.out.println(discountedPrice);
        }
    }
}
