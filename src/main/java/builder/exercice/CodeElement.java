package builder.exercice;

public class CodeElement {
    private String type;
    private String name;

    public CodeElement() {
    }

    public CodeElement(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "public" + type + " " + name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
