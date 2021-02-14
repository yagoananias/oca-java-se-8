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

//Metodo a ser chamado
void addThree(Number value) {
  System.out.println("Parameter: value = " + value.getNumber());
  value.setNumber(value.getNumber() + 3);
  System.out.println("Leaving the method: value = " value.getNumber());
}

Number value = new Number(1);
System.out.println("Argument: value = " + value.getNumber());
addThree(value);
System.out.println("After method call: value = " + value.getNumber());
