class Book {
  Author author;
  String title;
  int yearPublish;
  
  Book(Author author, String title, int yearPublish){
    this.author = author;
    this.title = title;
    this.yearPublish = yearPublish;
  }
  
  //TEMPLATE
  /*
   * FIELDS:
   * this.author -- Author
   * this.title -- String
   * 
   * Methods:
   * this.author.equals() -- boolean
   * */
  
  //-> boolean
  // Returns if this book has the same author
  
  boolean bookPublished(Book b) {
    if(this.yearPublish > b.yearPublish) {
      return true;
    }else
      return false; 
  }
  
  boolean sameAuth(Book b) {
    return this.author.equals(b.author);
  }
  
  
}