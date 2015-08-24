/**
 * Created by monicas on 24/08/15.
 */

import java.util.Scanner;

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
        float itemPrice;
        String name;
        String itemCategory;
        System.out.println("enter the number of items: ");
        Scanner user_input = new Scanner( System.in );
        n = user_input.nextInt();

        for (int i = 0 ; i < n; i++){
            System.out.println("enter the item name: ");
            name = user_input.next();
            System.out.println("enter the item category: ");
            itemCategory = user_input.next();
            System.out.println("enter the item price: ");
            itemPrice = user_input.nextFloat();
        }

        if()



    }
}
