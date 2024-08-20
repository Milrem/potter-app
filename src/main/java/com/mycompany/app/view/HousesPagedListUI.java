package com.mycompany.app.view;

import com.mycompany.app.model.House;

public class HousesPagedListUI extends PagedListUI<House> {
    public HousesPagedListUI(PagedList<House> pageSource) {
        super("Casas do Harry Potter", pageSource);
    }

    @Override
    protected void showItem(House item) {
        new HouseUI(item).show();
    }

    @Override
    protected String drawItem(House item) {
        return item.getHouse();
    }
}
