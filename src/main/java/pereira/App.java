package pereira;

import pereira.menuBuilder.*;

public class App {
  public static void main(String[] args) {
    Choice c1 = new ChoiceImpl("Option 1", App::choice1);
    Choice c2 = new ChoiceImpl("Option 2", App::choice2);
    SubMenu submenu = new SubMenu("Sub menu", new MenuBuilder()
            .setTitle("SSSub menu")
            .setChoices(c1,c2)
            .build());

    Menu menu = new MenuBuilder()
            .setTitle("Main Menu")
            .setChoices(c1, c2, submenu)
            .build();

    menu.display();
  }

  public static void choice1(){
    System.out.println("you choiced Choice 1 !");
  }

  public static void choice2(){
    System.out.println("you choiced Choice 2!");
  }
}
