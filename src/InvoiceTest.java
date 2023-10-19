import java.util.Scanner;

public class InvoiceTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Invoice invoice = new Invoice("13557941450", "Human named: Guilherme Vinícius Nigro Braga",
                12, 50120.56);

        System.out.printf("Creature number %s.%nDescription: %s.%nQuantity founded: %d.%nPrice: %.2f.%nStatus: Removed.%n%n",
                invoice.getNumber(), invoice.getDescription(), invoice.getQuantity(), invoice.getItemPrice());

        System.out.print("Enter the item's id: ");
        String id = input.nextLine();
        invoice.setNumber(id);

        System.out.print("Enter the item's description: ");
        String description = input.nextLine();
        invoice.setDescription(description);

        System.out.print("Enter the item's quantity founded: ");
        int quantity = input.nextInt();
        invoice.setQuantity(quantity);

        System.out.print("Enter the item's Price: ");
        double itemPrice = input.nextDouble();
        invoice.setItemPrice(itemPrice);

        System.out.printf("%n%nNew item added.%nItem id: %s%nItem description: %s%nItem quantity comprada: %d%nItem price: %.2f%n%n",
                invoice.getNumber(), invoice.getDescription(), invoice.getQuantity(), invoice.getItemPrice());
        System.out.printf("Calculating invoice...%n");
        System.out.printf("Invoice value: %s", invoice.getInvoiceAmount());

        input.close();
    }
}
