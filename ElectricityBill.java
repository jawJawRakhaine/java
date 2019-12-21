import java.util.Scanner;
public class ElectricityBill {
	public static void main(String[] args) {
		
		  Scanner myScanner = new Scanner(System.in);
		  pr("Enter the units of electricity: ");
		  int unit = myScanner.nextInt();
		  prln("\t\t!...Calculating...!\n");
		  if (unit>=1 && unit<=50) {
			  float bill = (float) ((float)unit * 0.50);
			  float vat = (float) (bill * (30.0/100.0));
			  float total_bill = bill + vat;
			  prln("\t\tFirst 50 units per unit 0.50 taka");
			  prln("\t\t----------------------\n");
			  prln("\t\tUnit\tPer Unit (price)\tTotal (Tk)");
			  prln("\t\t"+unit+"\t\t0.50\t\t"+unit*0.50+"\n");
			  prln("\t\t-----------------------\n");
			  prln("\t\tTotal unit used -->> "+unit+" units");
			  prln("\t\tWithout vat -->> "+bill+" Taka");
			  prln("\t\tVat -->> "+vat+" Taka"+" (30% vat on tatal taka)");
			  prln("\t\tTotal Bill -->> "+total_bill+" Taka"+" (including vat)");
			  prln("\t\tYou have used "+unit+ " units and you have to pay "+total_bill+" taka (including vat)");   
			  //show(unit,bill,vat,total_bill);
		  }

		  else if (unit>50 && unit<=150) {
			  float remaining = (float) (unit - 50.0);
			  float bill = (float) (50*0.50 + remaining*0.75);
			  prln("\t\tFirst "+(unit - remaining)+" units per unit 0.50 taka");
			  prln("\t\tThen "+(float)(unit-50) +" units per unit 0.75 taka");
			  prln("\t\t_________________________\n");
			  prln("\t\tUnit\tPer Unit(Price)\tTotal (Tk)");
			  prln("\t\t50.0\t0.50\t\t"+50.0*0.50);
			  prln("\t\t"+remaining+"\t0.75\t\t"+remaining*0.75);
			  prln("\t\t----------------------\t\t");
			  float vat = (float) (bill * (30.0/100.0));
			  prln("\t\t----------------\n");
			  prln("\t\tTotal unit used -->> "+unit+" units");
			  prln("\t\tWithout vat -->> "+bill+" Taka");
			  prln("\t\tVat -->> "+vat+" Taka"+" (30% vat on tatal taka)");
			  float total_bill = bill + vat;
			  prln("\t\tTotal Bill -->> "+total_bill+" Taka"+" (including vat)");
			  prln("\t\tYou have used "+unit+ " units and you have to pay "+total_bill+" taka (including vat) ");
			  //show(unit, bill, vat, total_bill);
		  }

		  else if(unit>150 && unit<=250) {
			  prln("\t\tFirst 50 units per unit 0.50 taka");
			  float remaining = (float) (unit - 50.0);
			  float remaining2 = (float) (remaining - 100.0);
			  prln("\t\tThen "+(remaining-remaining2)+" units per unit 0.75 taka");
			  prln("\t\tThen "+remaining2+" units per unit 1.25 taka");
			  prln("\t\t__________________\t\n");
			  float bill = (float) ((50*0.50) + ((remaining-remaining2) *0.75) + (remaining2*1.25 ));
			  float vat = (float) (bill * (30.0/100.0));
			  prln("\t\tUnit\tPer Unit\tTotal (Tk)");
			  prln("\t\t50\t0.50\t\t"+50.0*0.50);
			  prln("\t\t"+(remaining-remaining2)+"\t0.75\t\t"+(remaining-remaining2)*0.75);
			  prln("\t\t"+remaining2+"\t1.25\t\t"+remaining2*1.25);
			  float total_bill = bill + vat;
			  prln("\t\t----------------------\n");
			  prln("\t\tTotal unit used -->> "+unit+" units");
			  prln("\t\tWithout vat -->> "+bill+" Taka");
			  prln("\t\tVat -->> "+vat+" Taka"+" (30% vat on tatal taka)");
			  prln("\t\tTotal Bill -->> "+total_bill+" Taka"+" (including vat)");
			  prln("\t\tYou have used "+unit+ " units and you have to pay "+total_bill+" taka (including vat) ");
			  //show(unit, bill, vat, total_bill);
			  }
	
			  else {
	
			   float bill = (float) (unit * 1.50);
			   float vat = (float) (bill * (30.0/100.0));
			   prln("\t\t_______________________\n");
			   prln("\t\tAbove 250 units per unit 1.50 taka\n");
			   prln("\t\tUnit\tPer Unit\tTotal (Tk)");
			   prln("\t\t"+unit+"\t1.25\t\t "+unit*1.50+"\n");
			   prln("\t\t-------------------------\n");
			   prln("\t\tTotal unit used -->> "+unit+" units");
			   prln("\t\tWithout vat -->> "+bill+" Taka");
			   prln("\t\tVat -->> "+vat+" Taka"+" (30% vat on tatal taka)");
			   float total_bill = vat + bill;
			   prln("\t\tTotal Bill -->> "+total_bill+" Taka"+" (including vat)");
			   prln("\t\tYou have used "+unit+ " units and you have to pay "+total_bill+" taka (including vat)");
			   //show(unit, bill, vat, total_bill);
		  }
		  prln("\n\t\t\t\tThanks for being with us....!");
		  prln("\t\t\t\t\t-----------");
		  prln("\t\t\t\t\t-----------");
			  
	}
	
	public static void prln(Object anyObject) {
		System.out.println(anyObject);
		
	}
	
	public static void pr(Object anyObject) {
		System.out.print(anyObject);
		
	}
	
//	public static void show(int unit,float bill,float vat,float total_bill) {
//	
//		System.out.println("\t\tFirst 50 units per unit 0.50 taka");
//		System.out.println("\t\t_______________________\n");
//		System.out.println("\t\tAbove 250 units per unit 1.50 taka\n");
//		System.out.println("\t\tUnit\tPer Unit\tTotal (Tk)");
//		System.out.println("\t\t"+unit+"\t1.25\t\t "+unit*1.50+"\n");
//		System.out.println("\t\t-------------------------\n");
//		System.out.println("\t\tTotal unit used -->> "+unit+" units");
//		System.out.println("\t\tWithout vat -->> "+bill+" Taka");
//		System.out.println("\t\tVat -->> "+vat+" Taka"+" (30% vat on tatal taka)");
//		System.out.println("\t\tTotal Bill -->> "+total_bill+" Taka"+" (including vat)");
//		System.out.println("\t\tYou used "+unit+ " units and you have to pay "+total_bill+" taka (including vat)");   
//		System.out.println("\n\t\t\t\tThanks for being with us....!");
//		System.out.println("\t\t\t\t\t-----------");
//		System.out.println("\t\t\t\t\t-----------");
//		  
//	}
	

}
