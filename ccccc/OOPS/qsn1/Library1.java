package OOPS.qsn1;




class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
        System.out.println(" ");
        System.out.println(" ");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are:"); System.out.println(" ");
        System.out.println(" ");
        for (String book : this.books) {
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book){
            for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!"); System.out.println(" ");
                System.out.println(" ");
                this.books[i] = null;
                return;
            }
           
        }
        System.out.println("This book does not exist");
    }
    void returnBook(String book){
        addBook(book);
    }

}


public class Library1 {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library cen = new Library();
        cen.addBook("Think and grow Rich");
        cen.addBook("Algorithms");
        cen.addBook("C++");
        cen.showAvailableBooks();
        cen.returnBook("C++");
        cen.showAvailableBooks();
    }
}

 