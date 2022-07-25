#include <iostream>

using namespace std;

int main() {
    double num1, num2;
    char op;

    cout<< "Enter first number: ";
    cin>>num1;

    cout<< "Enter operator: ";
    cin>>op;

    cout<<"Enter the second number: ";
    cin>>num2;

    double result;
    if(op == '+'){
        result = num1 + num2;
    }
    else if(op == '-'){
        result = num1 - num2;
    }
    else if(op == '/'){
        result = num1 / num2;
    }
    else if(op == '*'){
        result = num1 * num2;
    }
    else{
        cout << "Invalid Operator";
    }
    cout<<"The result of the desired calculation is: "<< result;

    return 0;
}
