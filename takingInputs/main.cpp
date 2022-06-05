#include <iostream>
#include <cmath>
using namespace std;


int main() {
    string name;
    cout<<"Kindly enter your name:";
    getline(cin,name);
    cout << "Hello " << name << endl;
    cout<<"Kindly enter your age:";
    int age;
    cin>>age;
    cout<<"Hey "<< name << " you are " << age << " years old."<<endl;
    return 0;
}
