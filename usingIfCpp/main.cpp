#include <iostream>
#include <cmath>

using  namespace std;

int getMax(int num1, int num2, int num3){
    int result;
    if(num1>=num2 && num1>=num3){
        result = num1;
    } else if(num2>=num1 && num2>=num3){
        result = num2;
    }else{
        result = num3;
    }
    return result;
}

int main() {
    // bool isMale = false;
    // bool isTall = false;
    // if(isMale && isTall){
    // cout<<"You are a tall male";
    // } else if(isMale && !(isTall) ){
    // cout<<"You are a short male";
    // } else if(!isMale && isTall){
    // cout<<"You are tall but not a male";
    //  }else{
    //    cout<<"You are not a male and not tall";
    // }

    //If statements contd
    cout<<getMax(2,5,2);
    return 0;

}
