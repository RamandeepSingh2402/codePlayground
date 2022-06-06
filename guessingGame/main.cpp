#include <iostream>

using namespace std;

int main() {
    int secretNum = 7;
    int guess;
    int guessCount = 0;
    int guessLimit = 3;
    bool outOfGuesses = false;

    cout << "Try entering the secret number: ";
    cin>> guess;
    guessCount++;

    while(secretNum != guess && !outOfGuesses){
        if(guessCount < guessLimit){
            cout<<"Enter guess: ";
            cin>>guess;
            guessCount++;
        }else{
            outOfGuesses= true;
        }
    }

    cout<<endl;

    if(outOfGuesses) {
        cout << "You Lose!";
    }
    else{
        cout<<"You Win!";
    }
    return 0;
}
