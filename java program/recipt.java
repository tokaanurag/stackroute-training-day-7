package carrental;

import java.util.*;

import java.util.logging.Formatter;

public class Receipt {

  private double total = 0;
  private Formatter fr = new Formatter(System.out);
  
  public void printTitle() {
   fr.format("%-15s %5s %10s\n","Item","Qty","Price");
   fr.format("%-15s %5s %10s\n","----","---","-----");
//   total += price;
  }
  public void print(String item, int qty, double price) {
   fr.format("%-15s %5s %10s\n",item, qty, price);
   total += price;
  }
  public void printTotal() {
   fr.format("%-15s %5s %10s\n","Tax","   ",total*0.05);
   fr.format("%-15s %5s %10s\n","----","---","-----");
   fr.format("%-15s %5s %10s\n","Grand Total","   ",total*0.05);
  }
  public static void main (String[] args) {
   Receipt r = new Receipt();
   r.printTitle();
   r.print("Swift", 4, 700000);
   r.print("Tiago", 2, 600000);
   r.print("Ignis", 5, 550000);
   r.printTotal();
  }

}