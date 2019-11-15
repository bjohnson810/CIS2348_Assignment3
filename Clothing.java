public class Clothing extends Item implements Discount, Tax{
    private String brand;
    private double price;
    private double units;
    private double discount;
    final double taxp = 8.5;

    public Clothing(String n, String ic, String cBrand, double p, double unitNum, double disc){
        super(n, ic);
        brand = cBrand;
        price = p;
        units = unitNum;
        discount = disc;
    }

    public double computeTax(){
        double taxAmt = (price * units) *  (taxp/100);

        return taxAmt;

    }

    public double computeDiscount(){
        double savings = (price * units) * (discount/100);
        //double withDiscount = price - saving;

        return savings;
    }

    public double computeTotalPrice(){
        double total = ( (price*units) - computeDiscount()) + computeTax();
        return total;
    }

    public void displayClothing(){
        display();
        System.out.println("Item Brand: " + brand);
        System.out.println("Number of Units: " + units);
        System.out.println("Subtotal: " + (price*units) );
        System.out.println("Savings: " + computeDiscount());
        System.out.println("Tax amount: " + computeTax());
        System.out.println("Final price " + computeTotalPrice() );
    }
}
