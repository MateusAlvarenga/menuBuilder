## Menu Builder

Simple package to build interactive CLI applications with easy customization.

## Use as a Jitpack depency:

[![](https://jitpack.io/v/MateusAlvarenga/menuBuilder.svg)](https://jitpack.io/#MateusAlvarenga/menuBuilder)

## Example Usage:

```java
    Choice c1 = new ChoiceImpl("Option 1", App::runnable1);
    Choice c2 = new ChoiceImpl("Option 2", App::runnable2);
    Choice c3 = new ChoiceImpl("Option 1", App::runnable3);
    Choice c4 = new ChoiceImpl("Option 2", App::runnable4);
    SubMenu submenu = new SubMenu("Sub menu", new MenuBuilder()
            .setTitle("Sub menu")
            .setChoices(c3,c4)
            .build());

    Menu menu = new MenuBuilder()
            .setTitle("Main Menu")
            .setChoices(c1, c2, submenu)
            .build();

    menu.display();

```
