package invoice;
import java.text.DecimalFormat;

public class Adamson_Computers {
	
	private static String pattern;

	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		float totalPricePencil = 80.00f, totalPriceDuster=500.00f,totalPricePens=270.00f,totalPriceCrayon=800.00f;
		float subTotal = totalPricePencil + totalPriceDuster + totalPricePens + totalPriceCrayon;
		float vat = 16.00f,vatTax=(vat * subTotal)/100,totalAmount=vatTax + subTotal;
		String vatFormat=decimalFormat.format(vatTax),subTotalFormat=decimalFormat.format(subTotal),totalAmountFormat=decimalFormat.format(totalAmount);
		
		
System.out.println("*************************Adamson Computers Ltd*************************");				
System.out.println("#99 ACS Building Gilmore Ave. New Mla. .Quezon City *  Tel. No:123-4567");
System.out.println("                 VAT REG. TIN 098-765-4321-0000");		
System.out.println("                          SALES INVOICE");		
System.out.println("Sold to: C026-01-0979/2022			        Date:28/04/2020");
System.out.println("Address: GIDEON NYAKUNDI			        Phone number:0100100100");
System.out.println("================================================================================");
System.out.println("   Qty		|  Item Description             | 	Unit  	 |PriceAmount  ");
System.out.println("================================================================================");
System.out.println("   4		|  Pencil	 		| 	20 	 |80.00   ");
System.out.println("--------------------------------------------------------------------------------");
System.out.println("  10		|  Duster 			| 	50  	 |500.00  ");
System.out.println("--------------------------------------------------------------------------------");
System.out.println("   9		|  pens				| 	30 	 |270.00  ");
System.out.println("--------------------------------------------------------------------------------");
System.out.println("  10		|  crayon			| 	80  	 |800.00  ");
System.out.println("================================================================================");
System.out.println("   						|Sub Total	 |" +subTotalFormat);
System.out.println("				       		================================ ");
System.out.println("   						|VAT(16%) 	 |"+vatFormat);
System.out.println("				       		================================ ");
System.out.println("    			       			|Total amount    |"+totalAmountFormat);
System.out.println("				       		================================ ");

	}
	
}
