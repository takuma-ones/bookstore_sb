package jp.kwebs.bookstore.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private LocalDate date;
    private Integer price;
    @ElementCollection
    private List<String> mediaType;

    public Book() {
    }

    public Book(Long id, String title, LocalDate date, Integer price, List<String> mediaType) {
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
