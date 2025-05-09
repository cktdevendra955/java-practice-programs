class ItemCollections<T> {
    private T id;
    private T name;

    public T getId() {return id; }
    public void setId(T id) {this.id = id; }
    public T getName() {return name; }
    public void setName(T name) {this.name = name; }    
}

public class GenericClass {
    public static void main(String[] args) {
        ItemCollections<String> obj = new ItemCollections<>();
        obj.setName("Devendra");
        obj.setId("st123");

        System.out.println("STRUDENT ID : " + obj.getId());
        System.out.println("STRUDENT NAME : " + obj.getName());
        
    }
    
}