public class Book {
    private static long bookInit = 1000;
    private static final String[] ALLBookCode = new String[200];
    private String title;
    private String author;
    private String translator;
    private String publisher;
    private int printYear;
    private static int bookCount;

    public Book(String title, String author, String translator, String publisher,int printYear) {
        bookInit++;
        this.title = title;
        this.author = author;
        this.translator = translator;
        this.publisher = publisher;
        this.printYear = printYear;
        bookCount++;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public static void setBookCount(int bookCount) {
        Book.bookCount = bookCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrintYear() {
        return printYear;
    }

    public void setPrintYear(int printYear) {
        this.printYear = printYear;
    }

    public static Book create(String title, String author, String translator, String publisher,int printYear){

        Book book = new Book(title,author,translator,publisher,printYear);
        String[] authorName = book.author.split(" ");
        String code = bookInit + "/" + Character.toUpperCase(author.charAt(0)) + Character.toUpperCase(authorName[1].charAt(0)) + "/" +
                String.valueOf(book.printYear).charAt(2) + String.valueOf(book.printYear).charAt(3);
        System.out.println("BookCode: " + code);
        ALLBookCode[bookCount-1] = code;
        return book;
    }

    public static int readBook(String bookCode) {
        return searchBook(bookCode);
    }

    public static int searchBook(String bookCode) {
        int result = -1;
        for (int i = 0; i < ALLBookCode.length; i++) {
            if (ALLBookCode[i] == bookCode) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int updateInformationMember(String bookCode) {
        return searchBook(bookCode);
    }

    public static int deleteBook(String bookCode) {
        return searchBook(bookCode);
    }

    public static void showInformationBook(Book[] books) {

        System.out.println("BookCount: " + bookCount);
        for (int index = 0;index<bookCount;index++){
            System.out.println("\t \t" + ALLBookCode[index] + " " + books[index].getTitle() + "  " + books[index].getAuthor() + " " + books[index].getTranslator() + " "
                   + books[index].getPublisher() + " " + books[index].getPrintYear() );
        }
    }



}
