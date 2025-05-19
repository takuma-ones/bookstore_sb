package jp.kwebs.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.kwebs.bookstore.form.BookForm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/book")
public class BookController {

    @GetMapping("create")
    public String bookForm(Model model) {
        var bookForm = new BookForm();
        model.addAttribute("bookForm", bookForm);
        return "book/book-create";
    }

    @PostMapping("/create")
    public String display(BookForm bookForm) {
        return "book/book-result";
    }
    

}
