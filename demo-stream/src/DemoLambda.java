import java.time.LocalDate;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambda {

  public static void main(String[] args) {
    // Function f(x) = y
    // y = x + 1
    // ! Function<in, out>
    Function<Integer, Integer> discount10OFF = x -> (int) (x * 0.9); // formula
    System.out.println(discount10OFF.apply(10));

    Function<String, String> cleanName = name -> name.trim().toUpperCase();
    System.out.println(cleanName.apply(" Vincent Lau   "));

    // ! Lambda expression focus on the method implementation only.
    // ! The object created by lambda cannot hold attributes

    // ! Bifunction<in, in, out>
    // Bifunction
    BiFunction<String, String, String> concatOperation =
        (s1, s2) -> s1.concat(s2);
    System.out.println(concatOperation.apply("hello", "world"));

    BiFunction<LocalDate, Integer, LocalDate> prepareDate =
        (eventDate, daysbefore) -> eventDate.minusDays(daysbefore);
    System.out.println(prepareDate.apply(LocalDate.of(2025, 5, 30), 45));

    Predicate<Integer> elderlyFormula = age -> age > 65; // ! Predict
    System.out.println(elderlyFormula.test(66));

    // ! Consumer<in(only)>
    // Consumer
    Consumer<Cat> catConsumer = cat -> {
      cat.eat();
      cat.sleep();
      System.err.println("hello");
    };

    // ! Supplier<out(only)>
    Supplier<Integer> marksixNumber = () -> {
      return new Random().nextInt(49) + 1;
    };
    System.out.println(marksixNumber.get());

    // ! BiConsumer<in, in> (only)
    BiConsumer<Integer, Integer> addition = (a, b) -> {

    };
    addition.accept(3, 7);

    //Unary Operator
    Function<String, String> stringFunction1 = s -> s + "hello";
    System.out.println(stringFunction1.apply("vincent")); // vincenthello

    //! 1 in 1 out (same type)
    UnaryOperator<String> stringFunction2 = s -> s + "hello";
    System.out.println(stringFunction2.apply("lucas"));

    // ! 2 in 1 out (same type)
    BinaryOperator<String> stringFunction3 = (s1, s2) -> s1 + s2; // BiFunction<String, String, String>
    System.out.println(stringFunction3.apply("abc", "def"));
  }

  // ! Shared to other class
  // DemoLambda.generateMarksix()
  public static Integer generateMarksix() {
    return new Random().nextInt(49) + 1;
  }

  public static void eat(Cat cat) {
    cat.eat();
    cat.sleep();
  }
}
