package com.mycompany.app.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.app.model.Book;
import com.mycompany.app.model.Character;
import com.mycompany.app.model.House;
import com.mycompany.app.model.Spell;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

public class ApiClient {
    private static final String BASE_API_URL = "https://potterapi-fedeperin.vercel.app/pt/";
    HttpClient client;

    public ApiClient() {
        this.client = HttpClient.newBuilder().build();
    }

    public List<Book> getBooks(int page, int pageSize) throws ApiClientException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_API_URL.concat("books").concat(String.format("?max=%s&page=%s", pageSize, page))))
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString(Charset.defaultCharset()));
            if (response.statusCode() == 200) {
                ObjectMapper mapper = new ObjectMapper();
                List<Book> books = mapper.readValue(response.body(), new TypeReference<List<Book>>() {
                });
                return books;
            }
        } catch (IOException e) {
            throw new ApiClientException(e);
        } catch (InterruptedException e) {
            throw new ApiClientException(e);
        }
        return Collections.emptyList();
    }

    public List<Character> getCharacters(int page, int pageSize) throws ApiClientException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_API_URL.concat("characters").concat(String.format("?max=%s&page=%s", pageSize, page))))
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString(Charset.defaultCharset()));
            if (response.statusCode() == 200) {
                ObjectMapper mapper = new ObjectMapper();
                List<Character> itens = mapper.readValue(response.body(), new TypeReference<List<Character>>() {});
                return itens;
            }
        } catch (IOException e) {
            throw new ApiClientException(e);
        } catch (InterruptedException e) {
            throw new ApiClientException(e);
        }
        return Collections.emptyList();
    }

    public List<House> getHouses(int page, int pageSize) throws ApiClientException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_API_URL.concat("houses").concat(String.format("?max=%s&page=%s", pageSize, page))))
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString(Charset.defaultCharset()));
            if (response.statusCode() == 200) {
                ObjectMapper mapper = new ObjectMapper();
                List<House> itens = mapper.readValue(response.body(), new TypeReference<List<House>>() {});
                return itens;
            }
        } catch (IOException e) {
            throw new ApiClientException(e);
        } catch (InterruptedException e) {
            throw new ApiClientException(e);
        }
        return Collections.emptyList();
    }

    public List<Spell> getSpells(int page, int pageSize) throws ApiClientException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_API_URL.concat("spells").concat(String.format("?max=%s&page=%s", pageSize, page))))
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString(Charset.defaultCharset()));
            if (response.statusCode() == 200) {
                ObjectMapper mapper = new ObjectMapper();
                List<Spell> itens = mapper.readValue(response.body(), new TypeReference<List<Spell>>() {});
                return itens;
            }
        } catch (IOException e) {
            throw new ApiClientException(e);
        } catch (InterruptedException e) {
            throw new ApiClientException(e);
        }
        return Collections.emptyList();
    }
}
