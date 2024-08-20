package com.mycompany.app.view;

import com.mycompany.app.model.Book;
import com.mycompany.app.util.ConsoleUIHelper;

public class BookUI extends BasicUI {
    private final Book book;

    public BookUI(Book book) {
        super(book.getTitle());
        this.book = book;
    }

    @Override
    public int drawContent() {
        int lines = 0;
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Livro nº: %s", book.getNumber()), colunas, ' ');
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Título: %s", book.getTitle()), colunas, ' ');
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Título original: %s", book.getOriginalTitle()), colunas, ' ');
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Publicado em: %s", book.getReleaseDate()), colunas, ' ');
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Quantidade de páginas: %s", book.getPages()), colunas, ' ');
        lines += ConsoleUIHelper.drawWithRightPadding(String.format("Descrição: %s", book.getDescription()), colunas, ' ');

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
