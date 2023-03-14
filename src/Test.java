public class Test implements Comparable<Test> {
    String name;
    int price;

    public Test() {
    }

    public Test(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Test o) {
        // write logic to compare name properties
        // return
        return this.name.compareTo(o.getName());
        //return this.price-o.getPrice();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
