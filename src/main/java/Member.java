import java.util.Scanner;

public class Member {
    private static long membershipNumber = 1000;
    private static final long[] ALLMembershipNumber = new long[200];
    private String name;
    private short age;
    private char gender;
    private String phoneNumber;
    private static int size;


    public Member(String name, short age, char gender, String phoneNumber) {
        membershipNumber++;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        size++;
    }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        Member.size = size;
    }

    public static long[] getALLMembershipNumber() {
        return ALLMembershipNumber;
    }

    public long getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(long membershipNumber) {
        Member.membershipNumber = membershipNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    Scanner input = new Scanner(System.in);

    public static Member create(String name,short age,char gender,String phoneNumber) {

        Member member = new Member(name,age,gender,phoneNumber);
        System.out.println("membershipNumber: " + member.getMembershipNumber());
        ALLMembershipNumber[size-1] = member.getMembershipNumber();
        return member;
    }

    public static int readMember(long membershipNumber) {
        return searchMember(membershipNumber);
    }

    public static void showInformationMember(Member[] members) {

        System.out.println("MemebrSize: " + size);
        for (int index = 0;index<size;index++){
            System.out.println(ALLMembershipNumber[index] + " " + members[index].getName() + "  " + members[index].getAge() + " " + members[index].getGender());
        }
    }

    public void showPartOfInformation() {
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        if (this.getGender() == 'f' || this.getGender() == 'F') {
            System.out.println("Gender: Female");
        } else if (this.getGender() == 'm' || this.getGender() == 'M') {
            System.out.println("Gender: Male");
        } else {
            System.out.println("Not Entered!");
        }
        System.out.println("PhoneNumber: " + this.getPhoneNumber());
    }

    public static int updateInformationMember(long membershipNumber) {
        return searchMember(membershipNumber);
    }

    public static int searchMember(long membershipNumber) {
        int result = -1;
        for (int i = 0; i < ALLMembershipNumber.length; i++) {
            if (ALLMembershipNumber[i] == membershipNumber) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int deleteMember(long membershipNumber) {
        return searchMember(membershipNumber);
    }


}
