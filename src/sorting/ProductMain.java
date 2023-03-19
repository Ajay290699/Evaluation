package sorting;

public class ProductMain {

    public static void main(String[] args) {
        Product p1 = new Product("scale", 10, 5); // name, price, qty
        Product p2 = new Product("eraser", 5, 20); // name, price, qty
        Product p3 = new Product("exam pad", 40, 15); // name, price, qty
        Product p4 = new Product("notebook", 25, 15); // name, price, qt
        Product p5 = new Product("pen", 15, 5); // name, price, qty

        p1.calcTotal(); //50
        p2.calcTotal(); //100
        p3.calcTotal(); //600
        p4.calcTotal(); //375
        p5.calcTotal(); //75

        //p1.discount=10; // this discount should reflect in all objects
        Product.discount = 10;

        // wich type variable will be single copy in in memory thruout all objects : static

        p1.calcTotal(); //45
        p2.calcTotal(); //90
        p3.calcTotal(); //540
        p4.calcTotal(); //33xx
        p5.calcTotal(); //67.5

        System.out.println(Product.getDiscount()); //10
//        System sa = new System();

    }
}
