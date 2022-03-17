package my.animal;

import my.plant.Rose;

public class
Cat {
    String color;
    public Cat(String catColor){
        washFace();
        this.color = catColor;
    }


    Rose getFavoriteFlower(){
        return new Rose("yellow");
    }

    private void washFace(){
        System.out.println("Wash face");
    }

}
