package generic;

public class GenericsType<T> {
    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }

    public static void main(String args[]) {
        GenericsType<String> type1 = new GenericsType<>();
        type1.set("Java"); 
        System.out.println(type1.get()); 

        GenericsType<Integer> type2 = new GenericsType<>();
        type2.set(10); 
        System.out.println(type2.get()); 
    }
}




