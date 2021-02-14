public class Number {
  int number;
  
  public Number(int number) {
    this.number = number;
  }
  
  int getNumber() {
    return this.number;
  }
  
  void setNumber(int number) {
    this.number = number;
  }
}

void addThree(Number value) {
  System.out.println("Parameter: value = " + value.getNumber());
  value.setNumber(value.getNumber() + 3);
  System.out.println("Leaving the method: value = " value.getNumber());
}
