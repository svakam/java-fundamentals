import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    // pluralize tests
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    // flipping coins tests
    flipNHeads(4);
    flipNHeads(1);
    flipNHeads(6);

    // clock run
    clock();
  }

  // pluralize function
  public static String pluralize(String word, int count) {
    if (count == 0 || count > 1) {
      return word + 's';
    } else if (count == 1) {
      return word;
    } else {
      return word;
    }
  }

  // flipping coins function
  public static void flipNHeads(int flips) {
    int headCount = 0;
    for (int i = 0; i < flips; i++) {
      double random = Math.random();
      if (random < 0.5) {
        System.out.println("tails");
      } else {
        headCount++;
        System.out.println("heads");
      }
    }
    System.out.println("It took " + flips + " " + pluralize("flip", flips) + " to flip " + headCount + " " + pluralize("head", headCount) + " in a row.");
  }

  // clock function
  public static void clock() {
    while (true) {
      LocalDateTime now = LocalDateTime.now();
      int pastSecond = now.getSecond();
      int checkSecond = LocalDateTime.now().getSecond();
      if (pastSecond != checkSecond) {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
      }
    }
  }
}
