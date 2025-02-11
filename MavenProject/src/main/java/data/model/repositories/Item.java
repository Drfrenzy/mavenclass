package data.model.repositories;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private int id;
    private String description;
    private int weightInGrams;
    private List<Item> listOfItems = new ArrayList<>();
    private int count;
    public Item(String name, int id, String description, int weightInGrams) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.weightInGrams = weightInGrams;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }


    public Item save(Item item){
        listOfItems.add(item);
        count++;
        return item;
    }

    public void delete(Item item){
        listOfItems.remove(item);
        count--;
    }

    public int getCount() {
        return count;
    }

    public List<Item> getListOfItems() {
        return listOfItems;
    }
}
