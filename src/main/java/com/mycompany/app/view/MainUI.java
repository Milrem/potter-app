package com.mycompany.app.view;

import com.mycompany.app.service.BooksPagedList;
import com.mycompany.app.service.CharactersPagedList;
import com.mycompany.app.service.HousesPagedList;
import com.mycompany.app.service.SpellsPagedList;
import com.mycompany.app.util.ConsoleUIHelper;

public class MainUI extends BasicUI {
    public MainUI() {
        super("Catálogo do Harry Potter");
    }

    @Override
    public int drawContent() {
        return 0;
    }

    @Override
    public int menuLines() {
        return 6;
    }

    @Override
    public boolean drawMenu() {
        int option = ConsoleUIHelper.askChooseOption(
                "Escolha uma opção",
                "Livros",
                "Personagens",
                "Casas",
                "Feitíços",
                "Sair");
        switch (option) {
            case 0: {
                new BooksPagedListUI(new BooksPagedList()).show();
                break;
            }
            case 1: {
                new CharactersPagedListUI(new CharactersPagedList()).show();
                break;
            }
            case 2: {
                new HousesPagedListUI(new HousesPagedList()).show();
                break;
            }
            case 3: {
                new SpellsPagedListUI(new SpellsPagedList()).show();
                break;
            }
            default: {
                return false;
            }
        }
        return true;
    }
}
