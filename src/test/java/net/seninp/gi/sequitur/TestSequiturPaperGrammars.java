package net.seninp.gi.sequitur;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import net.seninp.gi.GrammarRules;
import net.seninp.util.StackTrace;
import org.junit.Test;

public class TestSequiturPaperGrammars {

  private static final String TEST1_STRING = "a b c d b c";
  private static final String TEST1_R0 = "a R1 d R1";
  private static final String TEST1_R1 = "b c";

  private static final String TEST2_STRING = "a b c d b c a b c d b c";
  private static final String TEST2_R0 = "R1 R1";
  private static final String TEST2_R1 = "a R2 d R2";
  private static final String TEST2_R2 = "b c";

  @Test
  public void test2() {
    try {
      SAXRule r = SequiturFactory.runSequitur(TEST2_STRING);
      GrammarRules rules = r.toGrammarRulesData();

      assertTrue("test r0", TEST2_R0.equals(rules.get(0).getRuleString().trim()));
      assertTrue("test r1", TEST2_R1.equals(rules.get(1).getRuleString().trim()));
      assertTrue("test r1", TEST2_R2.equals(rules.get(2).getRuleString().trim()));
    }
    catch (Exception e) {
      fail("Exception shouldnt be thrown: " + StackTrace.toString(e));
    }
  }

  @Test
  public void test1() {
    try {
      SAXRule r = SequiturFactory.runSequitur(TEST1_STRING);
      GrammarRules rules = r.toGrammarRulesData();

      assertTrue("test r0", TEST1_R0.equals(rules.get(0).getRuleString().trim()));
      assertTrue("test r1", TEST1_R1.equals(rules.get(1).getRuleString().trim()));
    }
    catch (Exception e) {
      fail("Exception shouldnt be thrown: " + StackTrace.toString(e));
    }

  }
}