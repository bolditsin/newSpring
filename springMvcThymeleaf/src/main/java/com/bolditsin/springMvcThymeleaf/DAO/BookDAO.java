package com.bolditsin.springMvcThymeleaf.DAO;

import com.bolditsin.springMvcThymeleaf.model.Book;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookDAO {
    private List<Book> books;
    private static int BOOK_COUNT;

    {
        books = new ArrayList<>();

        books.add(new Book(++BOOK_COUNT, "Murdered body","Detective", 1984));
        books.add(new Book(++BOOK_COUNT, "Adventures of arventurer", "novel", 1990));
        books.add(new Book(++BOOK_COUNT,"Fiction in science","Sci-fi",2005));

    }
    public List<Book> index(){
        return books;
    }

    public Book show(int id){

        return books.stream().filter(book-> book.getId()== id).findAny().orElse(null);
    }

    public void save(Book book){
        book.setId(++BOOK_COUNT);
        books.add(book);
    }
}