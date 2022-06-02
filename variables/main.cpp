#include <iostream>
using namespace std;
int main() {

//    char grade = 'A';
//    string phrase = "Cpp gang";
//    int age = 50;
//    double gpa= 3.60 ;
//    bool isMale = true;

    // A double can store more decimal points than a float data type
//
//    cout<<isMale<< endl;

       string phrase = "Giraffe Academy";

       cout<<phrase.find("Academy")<<endl;
       string animal = phrase.substr(0,7);
       cout<<animal<<endl;
       cout<<phrase.substr(0,7);


    return 0;
}
