package com.mycompany.app.view;

import java.util.List;

public interface PagedList<T> {
    List<T> listar(int pagina, int tamanhoPagina);
}
