import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Impl {

    public static void main(String[] args) {

        Test t1 = new Test("scale",2);
        Test t2 = new Test("pencil",4);
        Test t3 = new Test("Rubber",3);
        Test t4 = new Test("Book",8);

        List<Test> items=new ArrayList<Test>(Arrays.asList(t1,t2,t3,t4));
        System.out.println(items);
        Collections.sort(items);
        System.out.println(items);
    }
}
