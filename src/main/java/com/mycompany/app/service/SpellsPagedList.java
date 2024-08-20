package com.mycompany.app.service;

import com.mycompany.app.model.Spell;
import com.mycompany.app.view.PagedList;

import java.util.List;

public class SpellsPagedList implements PagedList<Spell> {
    @Override
    public List<Spell> listar(int pagina, int tamanhoPagina) {
        return new ApiClient().getSpells(pagina, tamanhoPagina);
    }
}
