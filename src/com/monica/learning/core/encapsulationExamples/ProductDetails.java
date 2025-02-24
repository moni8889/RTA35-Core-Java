package com.monica.learning.core.encapsulationExamples;

  public class ProductDetails {

     private String productName;
     private double productPrice;
     private int stockQuantity;

     //constructor created to initialize objects
     public ProductDetails(String productName, double productPrice, int stockQuantity) {
         this.productName = productName;
         this.productPrice = productPrice;
         this.stockQuantity = stockQuantity;
     }

     //getters and setters
     public String getProductName() {
         return productName;
     }

     public void setProductName(String productName) {
         this.productName = productName;
     }

     public double getProductPrice() {
         return productPrice;
     }

     public void setProductPrice(double productPrice) {
         this.productPrice = productPrice;
     }

     public int getStockQuantity() {
         return stockQuantity;
     }

     public void setStockQuantity(int stockQuantity) {
         this.stockQuantity = stockQuantity;
     }

     public void updatePrice(double newPrice) {
         if (newPrice > 0) {
             this.productPrice = newPrice;
             System.out.println("The price of " +  productName  + " is :" + newPrice);
         } else {
             System.out.println(" Price must be greater than zero");
         }
     }

     //checking units of products with number of stocks
     public void checkingStock(int stockQuantity, int productQuantity) {
         if (stockQuantity > 0 && productQuantity <= stockQuantity) {
             this.stockQuantity = stockQuantity;
         } else {
             System.out.println("Stocks are not available");
         }
     }

     public void purchaseProduct(int productQuantity) {
         if (productQuantity > 0 && productQuantity <= stockQuantity) {
             System.out.println(" Purchase successful." +  productQuantity  + " " + productName + " purchased.");
         } else {
             System.out.println(" Invalid purchase! Not enough stock available.");
         }
     }


     public static void main(String[] args) {

         //creating objects using constructor
         ProductDetails productWatchDetails = new ProductDetails("Watch", 499.99, 50);
         ProductDetails productBicycleDetails = new ProductDetails("Bicycle", 299.99, 20);
         ProductDetails productDroneDetails = new ProductDetails("Drone", 799.99, 10);

         productWatchDetails.purchaseProduct(2);
         productWatchDetails.updatePrice(499.99);
         productWatchDetails.checkingStock(50, 2); //checking units of a product with number of stocks
         System.out.println("\n");

         productBicycleDetails.purchaseProduct(1);
         productBicycleDetails.updatePrice(299.99);
         productBicycleDetails.checkingStock(20, 1);
         System.out.println("\n");

         productDroneDetails.purchaseProduct(3);
         productDroneDetails.updatePrice(799.99);
         productDroneDetails.checkingStock(10, 3);
         System.out.println("\n");


     }
 }


