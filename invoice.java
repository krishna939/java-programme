# java-programming-public double getInvoiceAmount(){
             double invoiceAmount = 0.0;
            // Write your logic here
            if (quantity < 0) {
                invoiceAmount = 0;
            }
            else if (price < 0.0) {
                invoiceAmount = 0.0;
            }
            else {
                invoiceAmount = price * quantity;
            }
            return invoiceAmount;
   }
} public class Main{ public static void main(String []args){ 
Invoice myInvoice; 
myInvoice = new Invoice("19BQ1A05P1", "My First Invoice :)", 5, 2.0);
 myInvoice.setPrice(5.0); 
System.out.println("Number: " + myInvoice.getNumber());
 System.out.println("Descriptio: " + myInvoice.getDescription()); 
System.out.println("Quantity: " + myInvoice.getQunatity());
 System.out.println("Price:" + myInvoice.getPrice());
 System.out.println("invoiceAmount: " + myInvoice.getInvoiceAmount());
 }