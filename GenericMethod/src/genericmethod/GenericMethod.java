
package genericmethod;

public class GenericMethod {

    public static void main(String[] args) {
        System.out.println(Carpma(2,3));
    }
    public static <T extends Number> double Carpma(T value,T key){
        return value.doubleValue()*key.doubleValue();
    }
}
