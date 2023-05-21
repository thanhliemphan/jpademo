package entity;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column (name = "name")
    private String name;

    @Column (name = "author")
    private String author;

//    @Column (name = "category")
//    private String category;

//    @Column (name = "isbn")
//    private String isbn;
//
//    @Column (name = "price")
//    private double price;
//
//    @Column (name = "numberPage")
//    private int numberOfPage;
//
//    @Column (name = "publishDate")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private LocalDate publishDate;

    @ManyToOne
    @JoinColumn(name= "categoryId")
    private CategoryEntity category;

    @OneToOne(cascade = {CascadeType.ALL})
    @PrimaryKeyJoinColumn
    private BookDetailsEntity bookDetails;

    public  BookEntity(){
    }
    @Override
    public String toString(){
        return "BookEntity(" +
                "id=" + id +
                ",name='" + name + '\'' +
                ",author='" + author + '\'' +
                ",category=" + category.getName() + '}';
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public BookDetailsEntity getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(BookDetailsEntity bookDetails) {
        this.bookDetails = bookDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }

//    public String getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public int getNumberPage() {
//        return numberOfPage;
//    }
//
//    public void setNumberOfPage(int numberPage) {
//        this.numberOfPage = numberPage;
//    }
//
//    public LocalDate getPublishDate() {
//        return publishDate;
//    }
//
//    public void setPublishDate(LocalDate publishDate) {
//        this.publishDate = publishDate;
//    }
}
