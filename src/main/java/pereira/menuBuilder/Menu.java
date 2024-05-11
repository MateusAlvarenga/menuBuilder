package pereira.menuBuilder;

import java.util.List;

public interface Menu {
    String getTitle();
    List<Choice> getChoices();
    void display();
}