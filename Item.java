public class Item {
    private String name;
    private String itemCode;

    public Item(String n, String code){
        name = n;
        itemCode = code;
    }

    public void display(){
        System.out.println("Item name: " + name);
        System.out.println("Item code: " + itemCode);
    }
}
