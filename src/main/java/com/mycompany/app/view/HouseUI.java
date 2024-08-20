package com.mycompany.app.view;

import com.mycompany.app.model.House;
import com.mycompany.app.util.ConsoleUIHelper;

public class HouseUI extends BasicUI {
    private final House item;

    public HouseUI(House item) {
        super(item.getHouse());
        this.item = item;
    }

    @Override
    public int drawContent() {
        int lines = 0;
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Fundador: %s", item.getFounder()), colunas, ' ');
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Anima: %s", item.getAnimal()), colunas, ' ');
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Emoji: %s", item.getEmoji()), colunas, ' ');

        return lines;
    }

    @Override
    public int menuLines() {
        return 2;
    }

    @Override
    public boolean drawMenu() {
        int option = ConsoleUIHelper.askChooseOption(
                "Escolha uma opção",
                "Voltar");
        return option != 0;
    }
}
