package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book0 = new Book(1, "Let us C", "Yashwant Kanetkar", "Programming", 200);
        Book book2 = new Book(3, "Let us Java", "Harman Singh", "Programming", 1100);
        Book book1 = new Book(2, "DS Algo", "Vaibhav Mishra", "Algorithms", 450);
        Library.bookList.add(book0);
        Library.bookList.add(book1);
        Library.bookList.add(book2);

        System.out.println("Welcome to the Library Management System");
        System.out.println("---------------------------------------------------------------------------------");

        while (true) {
            System.out.println("If you are librarian enter 1, or enter 2 if student: ");
            int who = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the user name and password to login - ");
            System.out.print("User Name : ");
            String name = sc.nextLine();
            System.out.print("Password : ");
            String pwd = sc.nextLine();
            if (name.equals(pwd)) {
                System.out.println("Congratulations " + name + " !!! You are logged in");
                if(who==1){
                    Library lib = new Library();
                    lib.showMenu();
                }
            } else {
                System.out.println("Sorry! wrong credentials entered! Try again");
            }

            //test code:
        /*Book book0 = new Book(1, "Let us C", "Yashwant Kanetkar", "Programming", 200);
        Book book2 = new Book(3, "Let us Java", "Harman Singh", "Programming", 1100);
        Book book1 = new Book(2, "DS Algo", "Vaibhav Mishra", "Algorithms", 450);

        book.add(book0);
        book.add(book1);
        book.add(book2);*/


        }
    }
}
