
package genericınterface;

public class GInterfaceDemo <T> implements GInterface<T>{
    private T[] values;

    public GInterfaceDemo(T[] values) {
        this.values = values;
    }
    

    @Override
    public boolean method(T sayi) {
        for (T value : values) {
            if (value.equals(sayi)) {
                return true;
            }
        }
      
        return false;
    }
    
}
