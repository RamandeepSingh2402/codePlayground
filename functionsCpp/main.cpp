#include <iostream>

using namespace std;

// sayHi() function
void Person(string name, int age){
    cout<<"Hello " << name << " you are " <<age << " years old."<<endl;
}

// main function
int main()
{
    Person("Mike", 60);
    Person("Tom", 45);
    Person("Steve", 19);
    return 0;
}
