



public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy1());
        context.executeStrategy();

        context.setStrategy(new ConcreteStrategy2());
        context.executeStrategy();
        }
    }
