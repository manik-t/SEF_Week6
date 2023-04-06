package ProductSpec;

interface productInter{

}

public class Product {
    private int productId;
    private String productName;
    private int crYear;
    private String description;
    private String website;
    private double price;

    public void Product(int id, String pn, int cr){

    }
    public void updateDescription(String d){

    }

    public void updateWebsite(String w){

    }

    public void setPrice(double p){

    }

    private boolean checkURL(String url){

    }
}
class ShoppingCart implements productInter{
    private int cartId;
    private double totalValue;

    public double calculateValue(){

    }
}