public class Invoice
{
    private String number,
                   description;
    private int quantity;
    private double itemPrice;

    public Invoice(String number, String description, int quantity, double itemPrice)
    {
        this.number = number;
        this.description = description;
        if (quantity > 0)
            this.quantity = quantity;
        if (itemPrice > 0.0)
            this.itemPrice = itemPrice;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }
    public String getNumber()
    {
        return number;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescription()
    {
        return description;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public int getQuantity()
    {
        return quantity;
    }

    public void setItemPrice(double itemPrice)
    {
        this.itemPrice = itemPrice;
    }
    public double getItemPrice()
    {
        return itemPrice;
    }

    public double getInvoiceAmount()
    {
        if (quantity < 0)
            return 0;
        if (itemPrice < 0.0)
            return 0.0;
        return quantity * itemPrice;
    }
}
