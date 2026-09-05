public class Main {
    public static void main(String[] args) {
        EditorHistory editor = new EditorHistory();

        editor.makeChange("uno");
        System.out.println("1. " + editor.currentStatus());

        editor.makeChange("uno dos");
        System.out.println("2. " + editor.currentStatus());

        editor.makeChange("uno dos tres");
        System.out.println("3. " + editor.currentStatus());

        editor.undo();
        System.out.println("4. " + editor.currentStatus());

        editor.undo();
        System.out.println("5. " + editor.currentStatus());

        editor.redo();
        System.out.println("6. " + editor.currentStatus());

        editor.makeChange("uno dos adios");
        System.out.println("7. " + editor.currentStatus());

        editor.redo();
        System.out.println("8. " + editor.currentStatus());
    }
}
