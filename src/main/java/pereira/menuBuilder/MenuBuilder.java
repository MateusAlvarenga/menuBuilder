package pereira.menuBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenuBuilder {
    private String title;
    private final List<Choice> choices = new ArrayList<>();

    public MenuBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public MenuBuilder setChoices(Choice... choices) {
        Collections.addAll(this.choices, choices);
        return this;
    }

    public Menu build() {
        if (title == null) {
            throw new IllegalStateException("Menu title cannot be null");
        }
        if (choices.isEmpty()) {
            throw new IllegalStateException("Menu must have at least one choice");
        }
        return new MenuImpl(title, choices);
    }
}