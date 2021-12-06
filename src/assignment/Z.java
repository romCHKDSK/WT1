package assignment;

public class Z {
    protected Z() {
        throw new IllegalStateException("Cannot instantiate a static class");
    }
}
