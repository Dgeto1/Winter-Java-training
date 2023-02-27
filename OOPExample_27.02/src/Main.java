public class Main {
    public static void main(String[] args) {
        invokeButtonListener(new Button());
        invokeButtonListener(new CheckBox());
    }

    public static void invokeButtonListener(ClickListener clickListener) {
        clickListener.onClick();
    }
}