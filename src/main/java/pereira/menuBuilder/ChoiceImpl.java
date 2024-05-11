package pereira.menuBuilder;

public class ChoiceImpl implements Choice {
    private final String text;
    private final Runnable action;

    public ChoiceImpl(String text, Runnable action) {
        this.text = text;
        this.action = action;
    }

    @Override
    public String getTitle() {
        return text;
    }

    @Override
    public Runnable getAction() {
        return action;
    }
}
