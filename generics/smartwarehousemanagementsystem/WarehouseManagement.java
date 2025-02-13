package org.example.generics.smartwarehousemanagementsystem;

public class WarehouseManagement {
    public static void main(String[] args) {
      Storage<Electronics>  electronicsStorage = new Storage<>();
      Storage<Groceries> groceriesStorage = new Storage<>();
      Storage<Furnitures> furnituresStorage = new Storage<>();

      electronicsStorage.addItem(new Electronics("Washing Machine",27000.0,"24Months"));
      groceriesStorage.addItem(new Groceries("Maggi Noodles",15.0,"4Months"));
      furnituresStorage.addItem(new Furnitures("Sofa",35000.0,"Wood"));

      Storage.getItems(electronicsStorage.displayDetails());
    }
}
