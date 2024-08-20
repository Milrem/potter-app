package com.mycompany.app.service;

import com.mycompany.app.model.Book;
import com.mycompany.app.view.PagedList;

import java.util.List;

public class BooksPagedList implements PagedList<Book> {
    @Override
    public List<Book> listar(int pagina, int tamanhoPagina) {
        return new ApiClient().getBooks(pagina, tamanhoPagina);
    }
}
