/**
 * Created by monicas on 24/08/15.
 */
public class SalesTaxes {

    public class calculateTax{
        int items;
        float sales_tax;

    };

    public class Item {

        protected float itemPrice;
        private String name;

        public String getItemDescription() {
            return name;
        }

        public void setItemDescription(String itemName){
            name = itemName;
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

    }
}
