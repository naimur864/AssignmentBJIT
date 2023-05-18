package com.bjit.bookLibrary.controller;

import com.bjit.bookLibrary.model.BookRequestModel;
import com.bjit.bookLibrary.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("/create")
    public ResponseEntity<Object> create(@RequestBody BookRequestModel requestModel) {
        return bookService.create(requestModel);
    }

    @PutMapping("/update/{bookId}")
    public void updateBookEntity(@PathVariable Long bookId, @RequestBody BookRequestModel requestModel) {
        bookService.updateBookEntity(bookId, requestModel);
    }



    @GetMapping("/showAll")
    public ResponseEntity<Object> showAll() {
        return bookService.showAll();
    }

    @DeleteMapping("/delete/{bookId}")
    public String delete(@PathVariable Long bookId) {
        bookService.delete(bookId);
        return "User has been Deleted";
    }








}