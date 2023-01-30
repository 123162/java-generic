
package genericınterface;

public class GenericInterface {

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 6, 7, 9, 10};
      
        GInterfaceDemo<Integer> interfaceDemo = new GInterfaceDemo<>(integers);
      
        System.out.println("sonuc : " + interfaceDemo.method(5));
        System.out.println("sonuc : " + interfaceDemo.method(7));
    }
    
}
