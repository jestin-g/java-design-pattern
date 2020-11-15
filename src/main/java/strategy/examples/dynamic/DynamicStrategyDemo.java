package strategy.examples.dynamic;

import java.util.List;

public class DynamicStrategyDemo {
    public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor(OutputFormat.MARKDOWN);
        textProcessor.appendList(List.of("eau", "terre", "feu"));
        System.out.println(textProcessor);

        textProcessor.clear();
        textProcessor.setOutputFormat(OutputFormat.HTML);
        textProcessor.appendList(List.of("php", "java", "python"));
        System.out.println(textProcessor);
    }
}
