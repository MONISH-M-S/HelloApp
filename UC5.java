public class HelloApp {
    public static void main(String[] args) {
        String names;

        if (args.length == 0) {
            names = "World";
        } else {
            StringBuilder builder = new StringBuilder();

            for (String name : args) {
                if (builder.length() > 0) {
                    builder.append(", ");
                }
                builder.append(name);
            }

            names = builder.toString();
        }

        System.out.println("Hello, " + names + "!");
    }
}