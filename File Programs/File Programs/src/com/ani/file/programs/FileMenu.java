package com.ani.file.programs;

public class FileMenu {

    private Scanner scanner;

    public void Menu() {
        scanner = new Scanner(System.in);
    }

    private void displayMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append("File Menu")
        .append("\n")
        .append("-------------------")
        .append("\n")
        .append("Select Your Choice")
        .append("\n")
        .append("-------------------")
        .append("\n")
        .append("1. Rename File")
        .append("\n")
        .append("2. Copy File")
        .append("\n")
        .append("3. List Contents")
        .append("\n")
        .append("4. Exit")
        .append("\n")
        .append("\n")
        .append("👉 Enter your Choice : ");

        System.out.println(builder.toString());
    }

    public void performAction() {

        while(true) {
            displayMenu();
            int ch = scanner.nextInt();

            if(ch >= 4 ) {
                System.out.println("\n 🙏 Thanks for using our services");
                break;
            } else {
                if(ch == 1) {
                    System.out.println("\n 👏 You selected Rename File \n");
                } else if(ch == 2) {
                    System.out.println(" \n 👏 You selected Copy File \n ");
                
                } else {
                    System.out.println("\n 👏 You selected List Contents \n");
                }
            }
        }
    
}
