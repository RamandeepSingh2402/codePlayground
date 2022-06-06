#include <iostream>

using namespace std;

int main() {
    int age = 19;
    int *pAge = &age;
    double gpa = 3.6;
    double *pGpa = &gpa;
    string name = "Mike";
    string *pName = &name;


    cout << pAge << endl;
    cout << "Age: " << &age << endl;
    cout << "Gpa: " << &gpa << endl;
    cout << "Name: " << &name << endl;

    // de-referencing the pointer
    cout << "Printing the de-referenced pointer " <<*pAge<<endl;
    cout << "Printing the pointer " <<&pAge;
    return 0;
}
