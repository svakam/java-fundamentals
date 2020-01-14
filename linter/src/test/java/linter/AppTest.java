/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    // test linter on file with many errors
    @Test public void testLinter() {
        App.linterSemiColon("src/main/resources/gates.js");
    }

    // test on file with no errors
    @Test public void noErrors() {
        App.linterSemiColon("src/main/resources/gatesnoerrors.js");
    }

    // test with one error
    @Test public void oneError() {
        App.linterSemiColon("src/main/resources/gatesoneerror.js");
    }

    // test with few errors
    @Test public void fewErrors() {
        App.linterSemiColon("src/main/resources/gatesfewerrors.js");
    }
}
