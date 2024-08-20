package com.mycompany.app.view;

import com.mycompany.app.model.Character;
import com.mycompany.app.util.ConsoleUIHelper;

public class CharacterUI extends BasicUI {
    private final Character item;

    public CharacterUI(Character item) {
        super(item.getNickname());
        this.item = item;
    }

    @Override
    public int drawContent() {
        int lines = 0;
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Nome: %s", item.getFullName()), colunas, ' ');
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Apelido: %s", item.getNickname()), colunas, ' ');
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Casa: %s", item.getHogwartsHouse()), colunas, ' ');
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Interpretado por: %s", item.getInterpretedBy()), colunas, ' ');
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Nascido em: %s", item.getBirthdate()), colunas, ' ');

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
