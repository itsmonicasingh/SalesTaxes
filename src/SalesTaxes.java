/**
 * Created by monicas on 24/08/15.
 */
public class SalesTaxes {

    public class calculateTax{
        int items;
        float sales_tax;

    };

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


    public static void main(String[] args) {
        //System.out.print("hello");
        System.out.println("enter the number of items: ");
        
        System.out.println("enter the item and its category: ");


    }
}
