package edu.cnm.deepdive;

public class DeclaringAndInitializingOfVariables {

  public static void main(String[] args) {
    //declaring and initializing in two lines.
    int myNumber;//set to 0 by default. Declaration.
    myNumber = 5;//Initialization.
    System.out.println("myNumber = " + myNumber);

    //declaring and initializing in one line.
    double myDouble = 7.50;
    System.out.println("myDouble = " + myDouble);

    //also legal but not the best practice.
    float myFloat1, myFloat2, myFloat3;
    float myFloat4; float myFloat5;
    float myFloat6 = 5f, myFloat7 = 10f, myFloat8;
    boolean b1, b2;

    //double d1, double d2; does not compile.
    //int i3; i4; does not compile.

    //identifiers always begin with a letter, an underscore of a dollar sign. Java keywords are not
    //allowed. Remember also that Java is a case sensitive language.

    float okFloat;
    double $Double;
    double _Double;

    // illegal examples
    // double 3Dpoint;
    // double my@street. No signs accepted, except of $ and _
    //double *$Coffee. Same as above.
    // float double. No keywords!
    float Double; //is accepted because case sensitive.
  }

}
