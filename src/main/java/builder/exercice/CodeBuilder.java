package builder.exercice;

import java.util.ArrayList;

public class CodeBuilder {
    private String className;
    private ArrayList<CodeElement> elements = new ArrayList();

    public CodeBuilder(String className) {
        this.className = className;

    }

    public CodeBuilder addField(String name, String type) {
        CodeElement codeElement = new CodeElement(name, type);
        elements.add(codeElement);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append(String.format("public class %s\n{\n", className));
        for (CodeElement codeElement : elements) {
            sb.append(String.format("  public %s %s\n", codeElement.getType(), codeElement.getName()));
        }
        sb.append("}\n");
        return sb.toString();
    }
}
