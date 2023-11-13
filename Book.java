public class Book {
    private String title;
    private String author;
    private String isdn;
    private double price;
    private double discount;
    private int editionNo;

    

    public Book(String title, String author, double price, String isdn, int editionNo,   double discount ){
        this.title = title;
        this.author = author;
        this.isdn = isdn;
        this.price = price;
        this.discount = discount;
        this.editionNo = editionNo;

    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getISDN(){
        return isdn;
    }
    
    public double getPrice(){
        return price;
    }

    public Double getDiscount(){
        return discount;
    }

    public int getEditionNo(){
        return editionNo;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setISDN(String isdn){
        this.isdn = isdn;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    public void setEditionNo(int editionNo){
        this.editionNo = editionNo;
    }

    public void changePrice(double discountRate){
        double discountValue = discount * discountRate;
        discount +=discountValue;
    }

    public void increasedEditionNo(){
        editionNo++;
    }

    public void decreasedEditionNo(){
        editionNo--;
    }

    public void createBook(){
        
    }

    public String toString(){
        String st = "\n";
        st += "Book title: ";
        st += title;

        st += "- Author: ";
        st += author;
        st += "\n";

        st += "ISDN: ";
        st += isdn;
        st += " - Edition Number: ";
        st += editionNo;
        st += "\n";

        st += "Full Price: ";
        st += price;

        st += "- Discount: ";
        st += discount + "%";

        st += " - Retail Price: ";
        double retailPrice = price - (price * discount /100);
        st += retailPrice;
        st += "\n";

        return st;

    }
   


}
