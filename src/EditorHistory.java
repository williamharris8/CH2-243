import java.util.Stack;

public class EditorHistory {
    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();
    private String currentState = "";

    public void makeChange(String newState) {
        undoStack.push(currentState);
        currentState = newState;
        redoStack.clear();

    }

    public void undo() {
        if (undoStack.isEmpty()) return;
        redoStack.push(currentState);
        currentState = undoStack.pop();
    }

    public void redo() {
        if (redoStack.isEmpty()) return;
        undoStack.push(currentState);
        currentState = redoStack.pop();
    }

    public String currentStatus() {
        return currentState;
    }
}
