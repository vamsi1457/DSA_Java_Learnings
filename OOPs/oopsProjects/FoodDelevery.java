package OOPs.oopsProjects;
class customer{
    String name;
    
    public customer(String name){
        this.name = name;
        
    }
}
class foodItem{
    String itemName;
    double price;
    public foodItem(String itemName, double price){
        this.itemName = itemName;
        this.price = price;
    }
    public void displayitem(){
        System.out.println("Item "+itemName + " = "+ price);
    }
}
class order{
    customer c;
    order(customer c){
        this.c = c;
    }
    foodItem[] item = new foodItem[5];
    int countItem = 0;
    public void addItem(foodItem i){
        item[countItem] = i;
        countItem++;
    }
    public double calBill(){
        double tot =0;
        for(int i=0; i<countItem; i++){
            tot = tot+ item[i].price;
        }
        return tot;
    }
    public void displayOrder(){
        System.out.println("----------Order details----------");
        System.out.println("Customer name is: "+ c.name);
        System.out.println("Cart items are: ");
        for(int i=0; i<countItem; i++){
            item[i].displayitem();
        }
        System.out.println("Bill amt is: "+calBill());
        System.out.println("Order arrives in 15min");
    }
}

public class FoodDelevery {
    public static void main(String[] args) {
        customer c1 = new customer("Vamsi");
        foodItem f1 = new foodItem("chicken", 500);
        foodItem f2 = new foodItem("noodles", 80);
        foodItem f3 = new foodItem("cola", 50);
        foodItem f4 = new foodItem("burger", 100);
        order o = new order(c1);
        o.addItem(f1);
        o.addItem(f2);
        o.addItem(f3);
        o.addItem(f4);
        o.displayOrder();
    }
}
