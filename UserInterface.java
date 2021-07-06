import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start(){

        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")){
                break;
            }

            if (command.equals("add")){
                System.out.println("To add: ");
                String add_task = scanner.nextLine();
                todoList.add(add_task);
            } 
            else if (command.equals("list")){
                todoList.print();
            } 
            else if (command.equals("remove")){
                System.out.println("Which one do you want to remove?");
                int num = Integer.valueOf(scanner.nextLine());

                todoList.remove(num);
            }
            else if (command.equals("clear")){
                todoList.clear();
            }
            else if(command.equals("help")){
                System.out.println("List of commands:");
                System.out.println("Add - adds items to list.");
                System.out.println("Remove - removes an item from the list.");
                System.out.println("Clear - clears all the items from the list.");
            }
        }
    }
    
}
