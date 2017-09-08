package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args) {
        DistributionInfo dist1 = new DistributionInfo("ExtraFoodShop", "cheese",
                20.0, 2.5);
        DistributionInfo dist2 = new DistributionInfo("HealthyShop", "tomato",
                10, 0.6);
        DistributionInfo dist3 = new DistributionInfo("GlutenFreeShop", "gluten free bread",
                20, 1.0);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        boolean extraFS = extraFoodShop.process(dist1);
        boolean healthyS = healthyShop.process(dist2);
        boolean glutenFS = glutenFreeShop.process(dist3);

        System.out.println("Status of distribution for providers:" +
                "\nExtra Food Shop - " + getStatus(extraFS) +
                "\nHealthy Shop - " + getStatus(healthyS) +
                "\nGluten Free Shop - " + getStatus(glutenFS));
    }

    public static String getStatus(boolean isTrue) {
        if(isTrue) {
            return "Succeeded";
        }else {
            return "Failed";
        }
    }
}
