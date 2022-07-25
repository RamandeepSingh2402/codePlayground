#include <iostream>
#include <cmath>

using namespace std;
int main() {

    // char grade = 'A';
    // string phrase = "Cpp gang";
    // int age = 50;
    // double gpa= 3.60 ;
    // bool isMale = true;

    // A double can store more decimal points than a float data type

    // cout<<isMale<< endl;

    // string phrase = "Giraffe Academy";

    // cout<<phrase.find("Academy")<<endl;
    // string animal = phrase.substr(0,7);
    // cout<<animal<<endl;
    // cout<<phrase.substr(0,7);

    int wNum = 5;
    double dNum = 5.5;

    wNum+=80;

    // addition
    cout<< 10+2 << endl;

    //subtraction
    cout<< 10 -2 <<endl;

    //multiplication
    cout<<10*2<<endl;

    //division
    cout<<10/2<<endl;

    //modulus operator
    cout<<10%2<<endl;

    //mixed operations:
    cout<< 4*5 + 10 << endl;

    //incrementing the value stored in the variable
    wNum++;
    cout<<wNum<<endl;

    //adding decimal and the whole number
    cout<<wNum+dNum<<endl;


    // started using the MATH functions

    // using the power function
    cout<<pow(2,3)<<endl;

    //using the sqrt function
    cout<<sqrt(3)<<endl;

    //using the round function
    cout<<round(2.4)<<endl;

    //using the ceil function
    cout<<ceil(2.1)<<endl;

    //using the floor function
    cout<<floor(2.9)<<endl;

    //using the fmax() function
    cout<<fmax(2.04,2.01)<<endl;

    //using the fmin() function
    cout<<fmin(2.01,2.00)<<endl;

    return 0;
}
