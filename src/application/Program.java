package application;

import java.util.Scanner;

import entities.Account;

public class Program {
    public static void main(String[] args) {
        int accountNumber;
        String name;
        double value;
        char response;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number : ");
        accountNumber = sc.nextInt();
        System.out.println("Enter account holder : ");
        name = sc.next();

        System.out.println("Is there na initial value ? ");
        response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.println("Enter initial deposit value : ");
            value = sc.nextDouble();

            Account account = new Account(accountNumber, name, value);
            System.out.println("Account data :");
            System.out.println(account);

            System.out.println("Enter a deposit value : ");
            value = sc.nextDouble();
            account.addValueAccount(value);

            System.out.println("Update data : ");
            System.out.println(account);

            System.out.println("Enter a whitdraw value");
            value = sc.nextDouble();
            account.removeValueAccount(value);

            System.out.println("Update data");
            System.out.println(account);

        } else {
            Account account = new Account(accountNumber, name);
            System.out.println("Account data :");
            System.out.println(account);

            System.out.println("Enter a deposit value : ");
            value = sc.nextDouble();
            account.addValueAccount(value);

            System.out.println("Update data : ");
            System.out.println(account);

            System.out.println("Enter a whitdraw value");
            value = sc.nextDouble();
            account.removeValueAccount(value);

            System.out.println("Update data");
            System.out.println(account);
            //teste1
        }

        sc.close();
    }
}