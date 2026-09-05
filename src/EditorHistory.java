import java.util.Stack;

public class EditorHistory {
    private Stack<String> undoStack = new Stack<>();
    private String currentState = "";

    public void makeChange(String newState) {
        undoStack.push(currentState);
        currentState = newState;

    }

    public void undo() {
        if (undoStack.isEmpty()) return;
        currentState = undoStack.pop();
    }
}
