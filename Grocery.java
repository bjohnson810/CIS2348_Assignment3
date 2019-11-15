public class Grocery extends Item implements Discount, Tax{
    double price;
    double units;
    double discount;
    double tax;

    public Grocery(String n, String ic, double p, double u, double d, double t){
        super(n, ic);
        price = p;
        units = u;
        discount = d;
        tax = t;
    }
    public double computeDiscount(){
        double savings = (price * units) * (discount/100);

        return savings;
    }

    public double computeTax(){
        double taxAmt = (price * units) *  (tax/100);
        return taxAmt;
    }

    public double computeTotalPrice(){
        double total = ( (price*units) - computeDiscount()) + computeTax();
        return total;
    }

    public void displayGrocery(){
        display();
        System.out.println("Number of Units: " + units);
        System.out.println("Savings: " + computeDiscount());
        System.out.println("Subtotal: " + (price*units) );
        System.out.println("Tax amount: " + computeTax());
        System.out.println("Final price " + computeTotalPrice() );
    }

}
