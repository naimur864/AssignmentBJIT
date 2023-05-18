package com.bjit.bookLibrary.service;

import com.bjit.bookLibrary.entity.BookEntity;
import com.bjit.bookLibrary.model.BookRequestModel;
import com.bjit.bookLibrary.model.BookResponseModel;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface BookService {

    public ResponseEntity<Object> create(BookRequestModel bookRequestModel);

    public ResponseEntity<Object> showAll();

    public void delete(Long bookId);

    public void updateBookEntity(Long bookId, BookRequestModel requestModel);
}


