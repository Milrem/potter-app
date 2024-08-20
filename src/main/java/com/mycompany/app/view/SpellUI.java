package com.mycompany.app.view;

import com.mycompany.app.model.Spell;
import com.mycompany.app.util.ConsoleUIHelper;

public class SpellUI extends BasicUI {
    private final Spell item;

    public SpellUI(Spell item) {
        super(item.getSpell());
        this.item = item;
    }

    @Override
    public int drawContent() {
        int lines = 0;
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Nome: %s", item.getSpell()), colunas, ' ');
        lines += ConsoleUIHelper.drawWithRightPadding(item.getUse(), colunas, ' ');

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
