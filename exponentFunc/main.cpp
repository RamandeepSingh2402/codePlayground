#include <iostream>

using namespace std;

double power(double baseNum, int powNum){
    double result = 1;
    for(int i = 0; i<powNum; i++){
        result = result*baseNum;
    }
    return result;
}

int main() {
    double baseNum;
    int powNum;
    cout<<"Enter the base number: ";
    cin>> baseNum;

    cout<<"Enter the power: ";
    cin>> powNum;
    cout<< baseNum << " raised to power " << powNum << " = "<<power(baseNum,powNum);


    return 0;
}
