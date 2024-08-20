package com.mycompany.app.service;

import com.mycompany.app.model.Character;
import com.mycompany.app.view.PagedList;

import java.util.List;

public class CharactersPagedList implements PagedList<Character> {
    @Override
    public List<Character> listar(int pagina, int tamanhoPagina) {
        return new ApiClient().getCharacters(pagina, tamanhoPagina);
    }
}
