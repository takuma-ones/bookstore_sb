package jp.kwebs.bookstore.form;

import java.time.LocalDate;
import java.util.List;

public class BookForm {
    private Long id;
    private String title;
    private LocalDate date;
    private Integer price;
    private List<String> mediaType;

    public BookForm() {
    }

    public BookForm(Long id, String title, LocalDate date, Integer price, List<String> mediaType) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.price = price;
        this.mediaType = mediaType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<String> getMediaType() {
        return mediaType;
    }

    public void setMediaType(List<String> mediaType) {
        this.mediaType = mediaType;
    }

}
