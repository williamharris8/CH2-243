PHASE 1 - Similar to using MS Word. If we are trying to backtrack with an undo button, we want the last input at the top of the stack. FIFO would be more useful in the instance of a to do list.

PHASE 2 - Handling this using return will exit the method early before reaching the pop line. Without it will throw EmptyStackException and crash.

PHASE 3 - redoStack is holding what is undid if it's wanted back. If you undo something and then type something new, what is in the redo stack no longer belongs anymore. If that wasnt cleared pressing redo would swap the text you just typed for the old version.