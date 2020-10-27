package builder.exercice;

public class CodeBuilderDemo {
    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");
        System.out.println(cb);
    }

    /* Expected output:

    public class Person
    {
      public String name;
      public int age;
    }

     */
}
