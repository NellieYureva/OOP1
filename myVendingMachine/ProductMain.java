package myVendingMachine;

import myVendingMachine.impl.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        Product hotDrink1 = new HotDrink("Чай", 80, LocalDate.now());

        Product hotDrink2 = new HotDrink("Кофе", 100, LocalDate.now(),85);

        VendingMachine vm = new WaterVendingMachine();

        VendingMachine vm1 = new HotDrinkVM();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        vm1.addProducts(List.of(hotDrink1, hotDrink1,hotDrink2, hotDrink2));

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm.getProducts());

        System.out.println(vm1.getProducts());

        vm1.getProduct("Чай");

        System.out.println(vm1.getProducts());
    }
}