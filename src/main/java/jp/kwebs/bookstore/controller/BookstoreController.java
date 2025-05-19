package jp.kwebs.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
public class BookstoreController {
    @GetMapping("/book")
    public String display() {
        return "bookstore/bookstore";
    }

    @PostMapping("/book")
    public String bookForm(@RequestParam String title, Model model) {
        // 受け取ったデータをモデルに追加
        model.addAttribute("title", title);
        
        return "bookstore/book-result";
    }
    
    

}
