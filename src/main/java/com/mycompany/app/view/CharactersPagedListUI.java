package com.mycompany.app.view;

import com.mycompany.app.model.Character;

public class CharactersPagedListUI extends PagedListUI<Character> {
    public CharactersPagedListUI(PagedList<Character> pageSource) {
        super("Personagens do Harry Potter", pageSource);
    }

    @Override
    protected void showItem(Character item) {
        new CharacterUI(item).show();
    }

    @Override
    protected String drawItem(Character item) {
        return item.getNickname();
    }
}
