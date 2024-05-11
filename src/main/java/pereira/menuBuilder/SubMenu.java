package pereira.menuBuilder;

public class SubMenu implements Choice {
    private final Menu menu;
    private final String title;

    public SubMenu(String title, Menu menu) {
        this.menu = menu;
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Runnable getAction() {
        return menu::display;
    }
}

