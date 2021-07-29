public class Main {
    public static void main(String[] args) {

        Secretary secretaryOne = new Secretary();

        /** Call Member Method
        System.out.println("--> CreateMember: ");
        for (int item = 0;item < 3;item++)
             secretaryOne.createMember();

        secretaryOne.displayMember();

        secretaryOne.searchForMembership();

        secretaryOne.displaySpecialMemebr();

        secretaryOne.updateMember();

        secretaryOne.deleteMemebr();

        secretaryOne.displayMember();
         */

        /** Call Book Method */
        System.out.println("--> CreateMember: ");
        for (int item = 0;item < 3;item++)
            secretaryOne.createBook();

        secretaryOne.displayBook();

    }
}
