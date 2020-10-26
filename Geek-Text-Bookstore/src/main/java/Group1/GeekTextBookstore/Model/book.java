package Group1.GeekTextBookstore.Model;

import java.math.BigDecimal;
//import java.sql.Date;

//import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class book {

  @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String isbn;
   private String book_name;
   private String author;
   private String publisher;
  // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
  // private Date publication_date;
   private String pages;
   private BigDecimal purchase_price;
   private String series;

   public String getBook_name() {
       return book_name;
   }

   public void setBook_name(String book_name) {
       this.book_name = book_name;
   }

   public String getAuthor() {
       return author;
   }

   public void setAuthor(String author) {
       this.author = author;
   }

   public String getPublisher() {
       return publisher;
   }

   public void setPublisher(String publisher) {
       this.publisher = publisher;
   }


   public String getPages() {
       return pages;
   }

   public void setPages(String pages) {
       this.pages = pages;
   }

   public BigDecimal getPurchase_price() {
       return purchase_price;
   }

   public void setPurchase_price(BigDecimal purchase_price) {
       this.purchase_price = purchase_price;
   }

   public String getSeries() {
       return series;
   }

   public void setSeries(String series) {
       this.series = series;
   }

   public Long getId() {
       return id;
   }

   public void setId(Long id) {
       this.id = id;
   }

   public String getIsbn() {
       return isbn;
   }

   public void setIsbn(String isbn) {
       this.isbn = isbn;
   }

   

 
}
