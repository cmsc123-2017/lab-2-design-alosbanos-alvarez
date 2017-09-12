class ExamGrades{
  double grades[];
  
  ExamGrades(double grades[]){
    this.grades = grades;
  }
  
  double highestGrade(){
    double high = 0;
    int i;
    
    for(i = 0; i > grades.length; i++){
      if(grades[i] > high){
       high = grades[i]; 
      }
    }
    return high;
  }
}