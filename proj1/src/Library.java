
public class Library {
    private Book[] books;
    private int numBooks;
    private int capacity = 4;
    private final int error = -1;

    public Library() {
        books = new Book[capacity];
        numBooks = 0;
    }

    private int find(Book book) {
        int searchIndex = 0;
        boolean bookFound = false;

        // compare book object against objects in books[] iteratively
        //
        while (searchIndex < books.length) {
            if (books[searchIndex].equals(book)) {
                bookFound = true;
                break;
            }
            searchIndex++;
        }

        // check if book was found, return -1 if the book was not found
        if (bookFound == true) {
            return searchIndex;
        } else {
            return error;
        }
    }

    private void grow() {
        // copy contents of full library to new library of size + 4(capacity)
        Book[] newLibrary = new Book[books.length + capacity];
        for (int i = 0; i < books.length; i++) {
            newLibrary[i] = books[i];
        }
        books = newLibrary;
    }

    public void add(Book book) {
        // check if library needs to grow before adding book
        if (numBooks >= books.length) {
            grow();
        }
        // numBooks init val is zero, therefore it can be used as an index
        books[numBooks] = book;
        numBooks++;
    }

    public boolean remove(Book book) {

        int target = find(book);

        // confirm the book exists in the library
        if (target != error) {
            for (int i = target; i < books.length; i++) {

                // overwrite target book and shift array
                books[i] = books[i + 1];

                // handle case of last book getting duplicated when shifting
                if (books[i + 1] == null) {
                    books[i] = null;
                    break;
                }
            }
            // update book count in library
            numBooks--;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkOut(Book book) {
        int target = find(book);
        // check if book exists and is available then return boolean
        if (books[target].isCheckedOut() == false && target != error) {
            books[target].setCheckedOut(true);
            return true;
        } else {
            return false;
        }
    }

    public boolean returns(Book book) {
        int target = find(book);
        // check if book exists and is available then return boolean
        if (books[target].isCheckedOut() == true && target != error) {
            books[target].setCheckedOut(false);
            return true;
        } else {
            return false;
        }

    }

    public void print() {
        int index = 0;
        while (books[index] != null) {

        }
    }

    public void printByDate() {

    }

    public void printByNumber() {

    }

}
