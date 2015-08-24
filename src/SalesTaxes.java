/**
 * Created by monicas on 24/08/15.
 */

import java.util.Scanner;
import java.util.*;
public class SalesTaxes {

    /*
    public class calculateTax{
        int items;
        float sales_tax;

    };
    */
/*
    public class Item {

        float itemPrice;
        String name;
        String itemCategory;

        public String getItemDescription() {
            return name;
        }

        public void setItemDescription(String itemName){
            name = itemName;
        }

        public String getItemCategory() {
            return itemCategory;
        }

        public void setItemCategory(String category) {
            itemCategory = category;

        }

        public float getItemPrice() {
            return itemPrice;
        }

        public void setItemPrice(float price) {
            itemPrice = price;

        }
    };
*/


    public static void main(String[] args) {
        //System.out.print("hello");
        int n;
        String name;
        String itemCategory = null;
        boolean isImported = false;
        float tot_tax = 0;
        float tot_price = 0;

        System.out.println("enter the number of items: ");
        Scanner user_input = new Scanner( System.in );
        n = user_input.nextInt();
        double [] sales_tax = new double[n];
        float []itemPrice = new float[n];

        for (int i = 0 ; i < n; i++){
            System.out.println("enter the item name: ");
            name = user_input.next();
            System.out.println("enter the item category: ");
            itemCategory = user_input.next();
            System.out.println("enter the item price: ");
            itemPrice[i] = user_input.nextFloat();
            System.out.println("is the item imported? (true/false): ");
            isImported = user_input.nextBoolean();

            if( itemCategory == "books" || itemCategory == "food" || itemCategory == "medical"){
                if(isImported == true) {
                    sales_tax[i] = (0.5) * itemPrice[i];
                }
                else{
                    sales_tax[i] = 0;
                }
            }
            else{
                if(isImported == true){
                    sales_tax[i] = (0.15) * itemPrice[i];
                }
                else{
                    sales_tax[i] = (0.10) * itemPrice[i];
                }
            }

        }

        for (int i = 0; i < n; i++){
            tot_tax += sales_tax[i];
        }
        for (int i = 0; i < n; i++){
            tot_price += itemPrice[i];
        }
        System.out.println("Sales Tax: " + Math.round(tot_tax * 20.0)/20.0);
        System.out.println("Total: " + Math.round(tot_price * 20.0)/20.0);



    }
}
