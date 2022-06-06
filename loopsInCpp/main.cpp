#include <iostream>

using namespace std;

int main() {
    int index = 0;

    //while loop
    while(index<=5){
        cout<<index<<" ";
        index++;
    }

    cout<<endl;

    index = 6;

    //for loop
    for(int i = 0; i<index; i++){
        cout<< i << " ";
    }

    cout<<endl;

    // using for loop for GOOD
    int nums[] = {1,2,5,7,3};
    for(int i = 0; i<5; i++){
        cout<<nums[i]<<" ";
    }

    cout<<endl;

    //using for-each loop as well
    for(int num : nums){
        cout<<num<<" ";
    }
    return 0;
}