public class demoDepartmentBilling {
    public static void main(String[] args){
        Grocery gItem1 = new Grocery("Bread", "11", 1.50,2,0,0);
        Grocery gItem2 = new Grocery("Apple", "12", .75,6,1,0);

        Clothing cItem1 = new Clothing("Jeans", "21", "Levis", 35, 1, 0);
        Clothing cItem2 = new Clothing("Dress Shirt", "22", "Izod", 25, 2, 10);

        gItem1.displayGrocery();
        System.out.println();

        gItem2.displayGrocery();
        System.out.println();

        cItem1.displayClothing();
        System.out.println();

        cItem2.displayClothing();
        System.out.println();

        double finalBill = gItem1.computeTotalPrice() + gItem2.computeTotalPrice() + cItem1.computeTotalPrice() + cItem2.computeTotalPrice();
        System.out.println("Total for all items: " + finalBill);
    }
}
