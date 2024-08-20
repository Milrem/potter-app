package com.mycompany.app.view;

import com.mycompany.app.model.Book;

public class BooksPagedListUI extends PagedListUI<Book> {
    public BooksPagedListUI(PagedList<Book> pageSource) {
        super("Livros do Harry Potter", pageSource);
    }

    @Override
    protected void showItem(Book item) {
        new BookUI(item).show();
    }

    @Override
    protected String drawItem(Book item) {
        return item.getTitle();
    }
}
