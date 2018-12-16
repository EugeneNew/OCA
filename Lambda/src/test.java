import java.util.function.Predicate;

public class test {


    public static void main(String[] args) {
        System.out.println(testValue(i -> i == 5));      // A
        //System.out.println(testValue(i -> { i == 5;})); //  B - wrong!  Error:(8, 46) java: not a statement.
        // Если есть оператор, тогда можно в фигурных скобках, например, можно " {return i == 5;}"
        System.out.println(testValue((i) -> i == 5));    //  C
        //System.out.println(testValue((int i) -> i == 5); //  D - wrong!  Error:(10, 56) java: ')' expected
        //System.out.println(testValue((int i) -> {return i == 5;})); // E - wrong!  Error:(11, 38) java: incompatible types: incompatible parameter types in lambda expression
        //По варианту E - ошибка, потому-что интерфейс Predicate ждет на вход объектный тип, а у нас int - примитивный тип
        System.out.println(testValue((i) -> {return i == 5;}));  // F. видимо return из return ничего страшнго, работает
    }

    private static boolean testValue(Predicate<Integer> p) {
         return p.test(5);// на всякий - test - это метод функционального интерфейса Predicate, нажми Ctrl+Q для получения описания
    }
}