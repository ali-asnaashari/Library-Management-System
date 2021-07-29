import java.util.Scanner;

public class Secretary {
    public Member[] members = new Member[200];
    public Book[] books = new Book[200];

    /** Member Method */
    public void createMember(){

        Scanner input = new Scanner(System.in);
        System.out.println("--> Enter Your Information!");
        System.out.println("Name:");
        String name = input.nextLine();
        System.out.println("Age:");
        short age = input.nextShort();
        input.nextLine();
        System.out.println("Gender:");
        char gender = input.next().charAt(0);
        System.out.println("Phone Number:");
        String phone = input.next();

        Member member = Member.create(name, age, gender, phone);
        members[Member.getSize()-1] = member;

    }

    public void displaySpecialMemebr(){
        System.out.println("--> Display Special Member: ");
        Scanner input = new Scanner(System.in);
        System.out.println("membershipNumber: ");
        long membership = input.nextLong();
        int index = Member.readMember(membership);

        if (index != -1){
            System.out.println(
                    members[index].getName() + "\t" + members[index].getAge() + "\t" + members[index].getGender() +
                            "\t" + members[index].getPhoneNumber());
        }else
            System.out.println("Member doesn't exist");
    }

    public void updateMember(){
        System.out.println("--> Update Member Information ");
        Scanner input = new Scanner(System.in);
        System.out.println("membershipNumber: ");
        long membership = input.nextLong();
        int index = Member.readMember(membership);

        if (index != -1){
            System.out.println("-> Enter Your New Information!");
            System.out.println("Name:");
            String name = input.nextLine();
            members[index].setName(name);
            System.out.println("Age:");
            short age = input.nextShort();
            members[index].setAge(age);
            input.nextLine();
            System.out.println("Gender:");
            char gender = input.next().charAt(0);
            members[index].setGender(gender);
            System.out.println("Phone Number:");
            String phone = input.next();
            members[index].setPhoneNumber(phone);
        }else
            System.out.println("Member doesn't exist");
    }

    public void deleteMemebr() {
        System.out.println("--> DeleteMember: ");
        Scanner input = new Scanner(System.in);
        System.out.println("membershipNumber: ");
        long membership = input.nextLong();
        int index = Member.readMember(membership);

        if (index != -1) {
            for (int i = index + 1; i < members.length; i++)
                members[i - 1] = members[i];
            Member.setSize(Member.getSize()-1);
        }
        else
            System.out.println("Member doesn't exist");
    }

    public  void searchForMembership() {
        System.out.println("--> searchForMembership: ");

        Member[] member = new Member[200];
        Scanner input = new Scanner(System.in);

        System.out.println("Name:");
        String name = input.nextLine();

        int num = 0;
        for (Member value : members) {
            if (value.getName().contains(name)) {
                System.out.println("\t" + (num + 1) + ": ");
                value.showPartOfInformation();
                member[num] = value;
                num++;
            }
        }
        if(member[num]!=null) {
            System.out.print("Enter the Number: ");
            int op = input.nextInt();
            input.nextLine();
            System.out.println(member[op - 1].getMembershipNumber());
        }else {
            System.out.println("Can not find member");
        }
    }

    public void displayMember(){
        System.out.println("--> Display All Members: ");
        Member.showInformationMember(members);
    }

    /** Call Book Method */
    public void createBook(){

        Scanner input = new Scanner(System.in);
        System.out.println("--> Enter Book Information!");
        System.out.println("\t \t Book Title: ");
        String title = input.nextLine();
        System.out.println("\t \t Author Name: ");
        String Author = input.nextLine();
        System.out.println("\t \t Translator Name: ");
        String Translator = input.nextLine();
        System.out.println("\t \t Publishers: ");
        String publisher = input.nextLine();
        System.out.println("\t \t printYear: ");
        int printYear = input.nextInt();

        Book book = Book.create(title, Author, Translator, publisher,printYear);
        books[Book.getBookCount()-1] = book;

    }

    public void updateBook(){
        System.out.println("--> Update Book Information ");
        Scanner input = new Scanner(System.in);
        System.out.println("bookCode: ");
        String bookCode = input.nextLine();
        int index = Book.readBook(bookCode);

        if (index != -1){
            System.out.println("-> Enter New Information of Book");
            System.out.println("title:");
            String title = input.nextLine();
            books[index].setTitle(title);
            System.out.println("author:");
            String author = input.nextLine();
            books[index].setAuthor(author);
            System.out.println("translator:");
            String translator = input.nextLine();
            books[index].setTranslator(translator);
            System.out.println("publisher:");
            String publisher = input.nextLine();
            books[index].setPublisher(publisher);
            System.out.println("printYear:");
            int printYear = input.nextInt();
            books[index].setPrintYear(printYear);
        }else
            System.out.println("Book doesn't exist");
    }

    public void deleteBook() {
        System.out.println("--> DeleteBook: ");
        Scanner input = new Scanner(System.in);
        System.out.println("bookCode: ");
        String bookCode = input.nextLine();
        int index = Book.readBook(bookCode);

        if (index != -1) {
            for (int i = index + 1; i < books.length; i++)
                books[i - 1] = books[i];
            Book.setBookCount(Book.getBookCount()-1);
        }
        else
            System.out.println("Book doesn't exist");
    }

    public  void searchForBook() {
        System.out.println("--> searchForMembership: ");

        Member[] member = new Member[200];
        Scanner input = new Scanner(System.in);

        System.out.println("Name:");
        String name = input.nextLine();

        int num = 0;
        for (Member value : members) {
            if (value.getName().contains(name)) {
                System.out.println("\t" + (num + 1) + ": ");
                value.showPartOfInformation();
                member[num] = value;
                num++;
            }
        }
        if(member[num]!=null) {
            System.out.print("Enter the Number: ");
            int op = input.nextInt();
            input.nextLine();
            System.out.println(member[op - 1].getMembershipNumber());
        }else {
            System.out.println("Can not find member");
        }
    }


    public void displayBook(){
        System.out.println("--> Display All Books: ");
        Book.showInformationBook(books);
    }

}
