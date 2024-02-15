package lk.ijse.entity;

import jakarta.persistence.*;

public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String title;
    @ManyToOne
    @JoinColumn(name = "id")
    private Author author;


    public String getId() {
        return id;
    }

    public Books() {
    }

    @Override
    public String toString() {
        return "Books{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", publishYear=" + publishYear +
                ", price=" + price +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Books(String id, String title, int publishYear, double price) {
        this.id = id;
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
    }

    private int publishYear;
    private double price;

}
