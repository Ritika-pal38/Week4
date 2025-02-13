package org.example.generics.smartwarehousemanagementsystem;

public  abstract class WarehouseItem {
    protected String name;
    protected double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public  abstract void displayDetails();

}
 class   Electronics extends WarehouseItem {

      private String Warranty;

      public Electronics(String name,double price ,String Warranty){
          super(name, price);
          this.Warranty = Warranty;

      }


        @Override
        public void displayDetails(){
            System.out.println("Electronics: "+name+",Price: "+price+" ,Warranty Period: "+Warranty);
        }

    }

    class Groceries extends WarehouseItem{
      private String expiryDate;

      public Groceries(String name,double price,String expiryDate){
          super(name, price);
          this.expiryDate = expiryDate;
      }

      @Override
        public void displayDetails(){
          System.out.println("Groceries name: "+name+" ,Price: "+price+" ,Expiry Date: "+expiryDate);
      }
    }

    class Furnitures extends WarehouseItem{
     private String material;

     public Furnitures(String name,double price,String material){
         super(name, price);
         this.material = material;
     }

     @Override
        public void displayDetails(){
         System.out.println("Furniture type: "+name+" ,Price: "+price+" ,Material type: "+material);
     }
    }

