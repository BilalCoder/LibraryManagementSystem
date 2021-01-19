package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Library {
    public static LinkedList<Book> bookList = new LinkedList<>();
    public static int bookCount;
    Scanner input = new Scanner(System.in);

    public void showMenu() {
        String choice;
        System.out.println("1, add new books");
        System.out.println("2, view all books");
        System.out.println("4, search for a book");
        System.out.println("5, delete books");
        System.out.println("6, the number of books");
        System.out.println("#, return to the main menu");
        System.out.println("@, exit the system");
        while (true) {
            System.out.print("Please enter your selection:");
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    addBook();
                    break;
                case "2":
                    viewAllBooks();
                    break;
                case "4":
                    searchBook();
                    break;
                case "5":
                    delBook();
                    break;
                case "6":
                    getBookCount();
                    break;
                case "@":
                    System.out.println("The system is quitting!");
                    System.exit(0);
                    break;
                case "#":
                    showMenu();
                    break;
                default:
                    System.out.println("illegal selected input, please re-enter - (y / n)!");
                    choice = input.nextLine();
                    if ("y".equals(choice)) {
                        showMenu();
                    } else {
                        System.out.println("System Security quit!");
                        System.exit(0);
                    }
                    break;
            }
        }
    }

    public void addBook() {
        System.out.println("Please enter all the fields required for the book correctly: ");
        System.out.println("Book name : ");
        String name = input.nextLine();
        System.out.println("Author name : ");
        String author = input.nextLine();
        System.out.println("subject name : ");
        String subject = input.nextLine();
        System.out.println("Price : ");
        String price = input.nextLine();
        Book book = new Book(bookCount+1, name, author, subject, Integer.parseInt(price));
        bookList.add(book);
    }

    public void viewAllBooks() {
//        Iterator<Book> itr= bookList.iterator();
//        while(itr.hasNext()){
//            System.out.println();
//        }
        for(Book b : bookList){
            System.out.println(b);
        }
    }

    public void searchBook() {
    }

    public void getBookCount() {
    }

    public void delBook() {
    }


}
