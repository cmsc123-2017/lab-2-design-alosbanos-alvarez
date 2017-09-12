class Author {
  String name;
  String gender;
  
  Author(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }
  
  //TEMPLATE
  /*
   * this.name
   * this.gender
   * 
   * 
   * **/
  
  //->boolean
  //Returns true if the name and the gender of the author matches the other
  boolean equals(Author a) {
    return this.name.equals(a.name) && this.gender.equals(a.gender);
  }
  
  
}