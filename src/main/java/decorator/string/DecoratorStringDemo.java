package decorator.string;

public class DecoratorStringDemo {
    public static void main(String[] args) {
        MagicString magicString = new MagicString("hello");
        System.out.println(magicString + " a " + magicString.getNumberOfVowels() + " vowels.");
    }
}
