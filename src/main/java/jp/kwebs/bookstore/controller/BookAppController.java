package jp.kwebs.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import jp.kwebs.bookstore.entity.Book;
import jp.kwebs.bookstore.form.BookForm;
import jp.kwebs.bookstore.service.BookService;

@Controller
@RequestMapping("/book-app")
public class BookAppController {

    private BookService bs;

    public BookAppController(BookService bs) {
        this.bs = bs;
    }

    @GetMapping("/list")
    public String lString(Model model) {
        model.addAttribute("books", bs.readAllBooks());
        return "book-app/book-list";
    }

    @GetMapping("create")
    public String bookForm(Model model) {
        model.addAttribute("bookForm", new BookForm());
        return "book-app/book-create";
    }

    @PostMapping("/create")
    public String create(@Valid BookForm bookForm, BindingResult result) {
        if (result.hasErrors()) {
            return "book-app/book-create";
        }
        bs.createBook(bookForm);
        return "redirect:/book-app/list";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        Book book = bs.readBookById(id);
        model.addAttribute("bookForm", bs.toForm(book));
        return "book-app/book-edit";
    }

    @PostMapping("/edit")
    public String update(@Valid BookForm bookForm, BindingResult result) {
        if (result.hasErrors()) {
            return "book-app/book-edit";
        }
        bs.updateBook(bookForm);
        return "redirect:/book-app/list";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        bs.deleteBook(id);
        return "redirect:/book-app/list";
    }

}
