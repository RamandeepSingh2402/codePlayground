#include <iostream>

using namespace std;

class Book{
public:
    string title;
    string author;
    int pages;
    Book(){
        title = "no title";
        author = "no author";
        pages = 0;
    }

    Book(string aTitle, string aName, int aPages){
        title = aTitle;
        author = aName;
        pages = aPages;
    }

};

int main() {
    Book book1("Harry Potter", "JK Rowling", 500);
    // book1.title = "Harry Potter";
    // book1.author = "JK Rowling";
    // book1.pages = 500;

    Book book2("Lord of the Rings", "Tolkein", 700);
    // book2.title = "Lord of the Rings";
    // book2.author = "Tolkein";
    // book2.pages = 700;

    Book book3;

    cout<<"Title: " <<  book1.title << endl;
    cout<<"Title: " <<  book2.title << endl;
    cout<<"Title: " << book3.title << endl;


    return 0;
}
