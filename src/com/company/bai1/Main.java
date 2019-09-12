package com.company.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void addSP(ArrayList<SanPham> arrayListSanPham) {
        Scanner scanner = new Scanner(System.in);
        SanPham sanPham = new SanPham();
        System.out.println("id:");
        sanPham.setId(scanner.nextInt());

        scanner.nextLine();
        System.out.println("name:");
        String name = scanner.nextLine();
        sanPham.setName(name);

        System.out.println("price:");
        float price = scanner.nextFloat();
        sanPham.setPrice(price);

        scanner.nextLine();
        System.out.println("description:");
        String description = scanner.nextLine();
        sanPham.setDescription(description);

        arrayListSanPham.add(sanPham);
    }

    public static void updateSP(ArrayList<SanPham> arrayListSanPham, int id) {
        Scanner sc = new Scanner(System.in);
        SanPham sanPham = new SanPham();
        sanPham.setId(id);
        System.out.println("id: " + sanPham.getId());

        System.out.println("name:");
        String name = sc.nextLine();
        sanPham.setName(name);

        System.out.println("price:");
        float price = sc.nextFloat();
        sanPham.setPrice(price);

        sc.nextLine();
        System.out.println("description:");
        String description = sc.nextLine();
        sanPham.setDescription(description);

        arrayListSanPham.add(sanPham);
    }

    public static void deleteSP(ArrayList<SanPham> arrayListSanPham, int index) {
        arrayListSanPham.remove(index);
    }

    public static void search(ArrayList<SanPham> arrayListSanPham, String name) {
        SanPham sanPham = new SanPham();
        for (int i = 0; i < arrayListSanPham.size(); i++) {
            if (arrayListSanPham.get(i).getName().equals(name)) {
                System.out.print("id: ");
                System.out.print(arrayListSanPham.get(i).getId());
                System.out.print(", name: ");
                System.out.print(arrayListSanPham.get(i).getName());
                System.out.print(", price: ");
                System.out.print(arrayListSanPham.get(i).getPrice());
                System.out.print(", description: ");
                System.out.print(arrayListSanPham.get(i).getDescription());
            } else {
                System.out.println("khong tim thay");
            }
        }
    }

    public static void listSP(ArrayList<SanPham> arrayListSanPham) {
        for (int i = 0; i < arrayListSanPham.size(); i++) {
            System.out.println("");
            System.out.print("id: ");
            System.out.print(arrayListSanPham.get(i).getId());
            System.out.print(", name: ");
            System.out.print(arrayListSanPham.get(i).getName());
            System.out.print(", price: ");
            System.out.print(arrayListSanPham.get(i).getPrice());
            System.out.print(", description: ");
            System.out.print(arrayListSanPham.get(i).getDescription());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> arrayListSanPham = new ArrayList<>();
        SanPham sanPham1 = new SanPham(1, "banh", 1000, "ngon");
        SanPham sanPham2 = new SanPham(2, "keo", 1000, "ngon");
        SanPham sanPham3 = new SanPham(3, "sua", 1000, "ngon");
        arrayListSanPham.add(sanPham1);
        arrayListSanPham.add(sanPham2);
        arrayListSanPham.add(sanPham3);
        listSP(arrayListSanPham);

        System.out.println("\nThem sp:");
        addSP(arrayListSanPham);
        listSP(arrayListSanPham);

        System.out.println("\nSua sp:");
        System.out.println("nhap id sua: ");
        int idSua = scanner.nextInt();
        updateSP(arrayListSanPham, idSua);
        listSP(arrayListSanPham);

        System.out.println("\nXoa sp:");
        System.out.println("nhap index:");
        int index = scanner.nextInt();
        deleteSP(arrayListSanPham, index);
        listSP(arrayListSanPham);

        System.out.println("\ncheck:");
        System.out.println("nhap name:");
        scanner.nextLine();
        String name = scanner.nextLine();
        search(arrayListSanPham, name);
    }
}
