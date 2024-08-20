package com.mycompany.app.view;

import com.mycompany.app.model.Spell;

public class SpellsPagedListUI extends PagedListUI<Spell> {
    public SpellsPagedListUI(PagedList<Spell> pageSource) {
        super("Feitiços do Harry Potter", pageSource);
    }

    @Override
    protected void showItem(Spell item) {
        new SpellUI(item).show();
    }

    @Override
    protected String drawItem(Spell item) {
        return item.getSpell();
    }
}
