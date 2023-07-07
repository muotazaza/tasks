package tasks;

public class Invoice {
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;

    }

    public String getPartNumber() {
        return partNumber;
    }



    public String getPartDescription() {
        return partDescription;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;

        }else
            this.quantity=0;

    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem>0.0){
        this.pricePerItem = pricePerItem;
    }else {
           this.pricePerItem=0.0;
        }
    }
    public double getInvoiceAmount(){
        return quantity*pricePerItem;
    }

}
