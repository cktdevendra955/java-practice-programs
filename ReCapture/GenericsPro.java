class GenericsDef<T> {
    private T field1;
    private T field2;    

    public void setField1(T field1) {
        this.field1 = field1;
    }
    public void setField2(T field2) {
        this.field2 = field2;
    }
    public T getField1() {
        return field1;
    }
    public T getField2() {
        return field2;
    }
}

public class GenericsPro {

    public static void main(String[] args) {
        System.out.println("\n********************** ");
        GenericsDef<String> gs = new GenericsDef<String>();        
        gs.setField1("Ram");
        gs.setField2("Dev");
        System.out.println(gs.getField1());
        System.out.println(gs.getField2());

        System.out.println("\n********************** ");
        GenericsDef<Integer> gs1 = new GenericsDef<>();        
        gs1.setField1(10);
        gs1.setField2(20);
        System.out.println(gs1.getField1());
        System.out.println(gs1.getField2());
    }
}

