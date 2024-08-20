package com.mycompany.app.service;

import com.mycompany.app.model.House;
import com.mycompany.app.view.PagedList;

import java.util.List;

public class HousesPagedList implements PagedList<House> {
    @Override
    public List<House> listar(int pagina, int tamanhoPagina) {
        return new ApiClient().getHouses(pagina, tamanhoPagina);
    }
}
