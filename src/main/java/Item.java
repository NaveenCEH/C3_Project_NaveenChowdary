public class Item {
    private String name;
    private int price;
    private boolean check;

    public Item(String name, int price, boolean check) {
        this.name = name;
        this.price = price;
        this.check = check;
    }

    public String getName() {
        return name;
    }
    
    public boolean isCheck() {
        return check;
    }
    
    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }
}
