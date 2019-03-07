package ch06;

class Jk{
    public static void main(String[] args) {
        Lambda l = (num1, num2) -> {
            System.out.println(num1 + num2);
            return 0;
        };
    }
}
@FunctionalInterface
public interface Lambda {
    Integer run (Integer i, Double d);


}
