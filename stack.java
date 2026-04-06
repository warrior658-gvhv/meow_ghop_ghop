import java.util.Scanner;

class Stack {
    int arr[];
    int top;
    int size;

    // Constructor
    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push operation
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
            System.out.println(value + " pushed");
        }
    }

    // Pop operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top] + " popped");
            top--;
        }
    }

    // Display operation
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // Get number of elements
    int count() {
        return top + 1;
    }
}

public class TwoStacksMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of stacks: ");
        int size = sc.nextInt();

        Stack s1 = new Stack(size);
        Stack s2 = new Stack(size);

        int choice, stackChoice, value;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Select Stack (1 or 2): ");
                stackChoice = sc.nextInt();
            } else {
                stackChoice = 0;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    if (stackChoice == 1)
                        s1.push(value);
                    else if (stackChoice == 2)
                        s2.push(value);
                    else
                        System.out.println("Invalid stack choice");
                    break;

                case 2:
                    if (stackChoice == 1)
                        s1.pop();
                    else if (stackChoice == 2)
                        s2.pop();
                    else
                        System.out.println("Invalid stack choice");
                    break;

                case 3:
                    if (stackChoice == 1)
                        s1.display();
                    else if (stackChoice == 2)
                        s2.display();
                    else
                        System.out.println("Invalid stack choice");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            // ✅ Check if both stacks have equal number of elements
            if (s1.count() == s2.count()) {
                System.out.println("Both stacks have equal elements: " + s1.count());
            }

        } while (choice != 4);

        sc.close();
    }
}