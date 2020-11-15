package strategy.examples.dynamic;

public interface ListStrategy {
     default void start(StringBuilder sb) {}; /* default empty in the case the liost dont have starting syntax (ex: Markdown) */
     void addListItem(StringBuilder sb, String item);
     default void end(StringBuilder sb) {};
}
