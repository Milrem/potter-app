package com.mycompany.app.view;

import com.mycompany.app.util.ConsoleUIHelper;

public abstract class BasicUI {
    protected static final int DEFAULT_COLUMNS = 120;
    protected static final int DEFAULT_ROWS = 24;
    protected int colunas;
    protected int linhas;
    protected String titulo;

    public BasicUI(String titulo) {
        this(DEFAULT_COLUMNS, DEFAULT_ROWS, titulo);
    }

    public BasicUI(int colunas, int linhas, String titulo) {
        this.colunas = colunas;
        this.linhas = linhas;
        this.titulo = titulo;
    }

    public void show() {
        do {
            ConsoleUIHelper.drawHeader(titulo, colunas);
            int linesUsed = 3 + drawContent() + menuLines();

            ConsoleUIHelper.fillVSpace(linhas - linesUsed, colunas);
            ConsoleUIHelper.drawLine(colunas);
            if (!drawMenu()) {
                break;
            }
        } while (true);
    }

    public abstract int drawContent();

    public abstract int menuLines();

    public abstract boolean drawMenu();
}
