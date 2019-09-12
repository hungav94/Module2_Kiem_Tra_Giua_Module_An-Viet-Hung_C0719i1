package com.company.bai2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void addDB(LinkedList<DanhBa> linkedListDanhBa) {
        Scanner scanner = new Scanner(System.in);
        DanhBa danhBa = new DanhBa();
        System.out.println("firstName: ");
        String firstName = scanner.nextLine();
        danhBa.setFirstName(firstName);

        System.out.println("lastName: ");
        String lastName = scanner.nextLine();
        danhBa.setLastName(lastName);

        System.out.println("phoneNumber: ");
        String phoneNumber = scanner.nextLine();
        danhBa.setPhoneNumber(phoneNumber);

        linkedListDanhBa.add(danhBa);
    }

    public static void updateDB(LinkedList<DanhBa> linkedListDanhBa, String firstName) {
        Scanner scanner = new Scanner(System.in);
        DanhBa danhBa = new DanhBa();

        danhBa.setFirstName(firstName);
        System.out.println("firstName: " + danhBa.getFirstName());

        System.out.println("lastName: ");
        String lastName = scanner.nextLine();
        danhBa.setLastName(lastName);

        System.out.println("phoneNumber: ");
        String phoneNumber = scanner.nextLine();
        danhBa.setPhoneNumber(phoneNumber);

        linkedListDanhBa.add(danhBa);
    }

    public static void deleteDB(LinkedList<DanhBa> linkedListDanhBa, String phoneNumber) {
        for (int i = 0; i < linkedListDanhBa.size(); i++) {
            if (linkedListDanhBa.get(i).getPhoneNumber().equals(phoneNumber)) {
                linkedListDanhBa.remove(i);
            }
        }
    }

    public static void search(LinkedList<DanhBa> linkedListDanhBa, String input) {
        DanhBa danhBa = new DanhBa();
//        int i = 0;
//        boolean checkFirstName = linkedListDanhBa.get(i).getFirstName().equals(input);
//        boolean checkLastName = linkedListDanhBa.get(i).getLastName().equals(input);
//        boolean checkPhoneNumber = linkedListDanhBa.get(i).getPhoneNumber().equals(input);
        for (int i = 0; i < linkedListDanhBa.size(); i++) {
            if (linkedListDanhBa.get(i).getFirstName().equals(input) ||
                    linkedListDanhBa.get(i).getLastName().equals(input) ||
                    linkedListDanhBa.get(i).getPhoneNumber().equals(input)) {
                System.out.print("firstName: ");
                System.out.print(linkedListDanhBa.get(i).getFirstName());
                System.out.print(", lastName: ");
                System.out.print(linkedListDanhBa.get(i).getLastName());
                System.out.print(", phoneNumber: ");
                System.out.print(linkedListDanhBa.get(i).getPhoneNumber());
            } else {
                System.out.println("\nkhong tim thay");
            }
        }
    }

    public static void listDB(LinkedList<DanhBa> linkedListDanhBa) {
        for (int i = 0; i < linkedListDanhBa.size(); i++) {
            System.out.println("");
            System.out.print("firstName: ");
            System.out.print(linkedListDanhBa.get(i).getFirstName());
            System.out.print(", lastName: ");
            System.out.print(linkedListDanhBa.get(i).getLastName());
            System.out.print(", phoneNumber: ");
            System.out.print(linkedListDanhBa.get(i).getPhoneNumber());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<DanhBa> linkedListDanhBa = new LinkedList<>();
        DanhBa danhBa1 = new DanhBa("An Viet", "Hung", "0377654209");
        DanhBa danhBa2 = new DanhBa("Hung Viet", "An", "0377654208");
        DanhBa danhBa3 = new DanhBa("An", "Hung", "0377654207");
        linkedListDanhBa.add(danhBa1);
        linkedListDanhBa.add(danhBa2);
        linkedListDanhBa.add(danhBa3);
        listDB(linkedListDanhBa);

        System.out.println("\nThem DB: ");
        addDB(linkedListDanhBa);
        listDB(linkedListDanhBa);

        System.out.println("\nSua DB:");
        System.out.println("nhap firstName:");
        String firstName = scanner.nextLine();
        updateDB(linkedListDanhBa, firstName);
        listDB(linkedListDanhBa);

        System.out.println("\nXoa DB");
        System.out.println("Nhap sdt:");
        String phoneNumber = scanner.nextLine();
        deleteDB(linkedListDanhBa, phoneNumber);
        listDB(linkedListDanhBa);

        System.out.println("\nSearch DB");
        System.out.println("Nhap input:");
        String input1 = scanner.nextLine();
        search(linkedListDanhBa, input1);
        System.out.println("\nNhap input:");
        String input2 = scanner.nextLine();
        search(linkedListDanhBa, input2);
        System.out.println("\nNhap input:");
        String input3 = scanner.nextLine();
        search(linkedListDanhBa, input3);
    }
}
