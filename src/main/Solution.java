package main;

import java.util.Scanner;

public class Solution  {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine().trim();
        if (n != 0) {
            Book[] books = new Book[n];
            for (int i = 0; i < n; i++) {
                String BookName = sc.nextLine().trim();
                String AuthorName = sc.nextLine().trim();
                String ISBN_NO = sc.nextLine().trim();
                books[i] = new Book(BookName, AuthorName, ISBN_NO);
            }
                for (int i = 0; i < books.length; i++) {
                    System.out.println(books[i]);
                }
            }else {
            System.out.println("N/A");
        }
        sc.close();
    }
    }
