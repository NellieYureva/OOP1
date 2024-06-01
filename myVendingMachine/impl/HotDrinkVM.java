package myVendingMachine.impl;

import myVendingMachine.Product;
import myVendingMachine.VendingMachine;

import java.util.List;

public class HotDrinkVM extends VendingMachine {

    public HotDrinkVM() {
        super();
    }

    public HotDrinkVM(List<Product> products) {
        super(products);
    }

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name, int temperature) {
        for (Product product : products) {

            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }
        System.out.println("No such product: " + name);
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }
    }

