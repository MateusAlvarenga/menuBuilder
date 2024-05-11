package pereira.menuBuilder;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class MenuImpl implements Menu {
    private final String title;
    private final List<Choice> choices;

    public MenuImpl(String title, List<Choice> choices) {
        this.title = title;
        this.choices = choices;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<Choice> getChoices() {
        return Collections.unmodifiableList(choices);
    }

    @Override
    public void display() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n" + title);
            int index = 1;
            for (Choice choice : choices) {
                System.out.println(index++ + ". " + choice.getTitle());
            }
            System.out.println("Enter your choice (or '0' to exit): ");

            Scanner scanner = new Scanner(System.in);
            int selection;
            try {
                selection = scanner.nextInt();
                if (selection == 0) {
                    exit = true;
                } else if (selection < 1 || selection > choices.size()) {
                    System.out.println("Invalid choice. Please try again.");
                } else {
                    choices.get(selection - 1).getAction().run();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
