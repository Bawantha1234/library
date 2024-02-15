package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Author {
    @Id
    private String id;

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                ", country='" + country + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Books> getBook() {
        return book;
    }

    public Author(String id, List<Books> book, String country, String name) {
        this.id = id;
        this.book = book;
        this.country = country;
        this.name = name;
    }

    public void setBook(List<Books> book) {
        this.book = book;
    }

    public String getCountry() {
        return country;


    }
    @OneToMany(mappedBy = "author")
    private List<Books> book;

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    private String country;

    private String name;

    public Author() {
    }


}
