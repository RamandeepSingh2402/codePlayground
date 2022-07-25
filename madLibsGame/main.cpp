#include <iostream>
using namespace std;

int main() {
    string color, pluralNoun, love;
    cout<<"Enter a color:";
    getline(cin, color);
    cout<<"Enter a plural noun:";
    getline(cin, pluralNoun);
    cout<<"Enter love's name:";
    getline(cin, love);
    cout << "Roses are " << color <<endl;
    cout<<pluralNoun<<" are blue"<<endl;
    cout<<"I love "<<love<<endl;
    return 0;
}
