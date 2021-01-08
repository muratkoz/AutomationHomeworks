package com.cybertek.tests.Homeworks.assignment14_oop;

import java.util.ArrayList;
import java.util.List;

public class Q14_TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Q14_Item> regularQ14Items;
    private List<Q14_OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public Q14_TJMaxx() {
        regularQ14Items = new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }

    /**
     * adds an item object to regularItems list
     * @param q14Item
     */
    public void addRegularItem(Q14_Item q14Item) {
        regularQ14Items.add(q14Item);
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(Q14_OnSaleItem item) {
        onSaleItems.add(item);
    }

    /**
     * getter for regularItems
     * @return
     */
    public List<Q14_Item> getRegularItems() {
        //TODO change from null
        return regularQ14Items;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public List<Q14_OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
        //TODO change from -1
        return regularQ14Items.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public List<String> getAllItemNames() {

        ArrayList<String> allItemNames = new ArrayList<>();

        for (Q14_Item regularQ14Item : regularQ14Items) {
            allItemNames.add(regularQ14Item.getName());
        }
        for (Q14_OnSaleItem onSaleItem : onSaleItems) {
            allItemNames.add(onSaleItem.getName());
        }

        return allItemNames;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber) {
        double price = 0.0;
        for (Q14_Item regularQ14Item : regularQ14Items) {
            if (regularQ14Item.getCatalogNumber()==catalogNumber){
                price = regularQ14Item.getPrice();
            }
        }
        for (Q14_OnSaleItem onSaleItem : onSaleItems) {
            if (onSaleItem.getCatalogNumber()==catalogNumber){
                price = onSaleItem.getPrice();
            }
        }
        return price;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public Q14_OnSaleItem getOnSaleItem(String name)
    {
        Q14_OnSaleItem saleItem = null;
        for (Q14_OnSaleItem onSaleItem : onSaleItems) {
            if (onSaleItem.getName().equals(name)){
                saleItem = onSaleItem;
            }
        }
        return saleItem;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        for (Q14_Item regularQ14Item : regularQ14Items) {
            if (regularQ14Item.getCatalogNumber()==catalogNumber){
                regularQ14Items.remove(regularQ14Item);
            }
        }
        for (Q14_OnSaleItem onSaleItem : onSaleItems) {
            if (onSaleItem.getCatalogNumber()==catalogNumber){
                onSaleItems.remove(onSaleItem);
            }
        }
    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {

        for (Q14_Item regularQ14Item : regularQ14Items) {
            if (regularQ14Item.getCatalogNumber()==catalogNumber){
                regularQ14Item.setQuantity(regularQ14Item.getQuantity()-1);
                if (regularQ14Item.getQuantity()==0) regularQ14Items.remove(regularQ14Item);
            }
        }
        for (Q14_OnSaleItem onSaleItem : onSaleItems) {
            if (onSaleItem.getCatalogNumber() == catalogNumber) {
                onSaleItem.setQuantity(onSaleItem.getQuantity()-1);
                if (onSaleItem.getQuantity()==0) onSaleItems.remove(onSaleItem);
            }
        }



    }


}
