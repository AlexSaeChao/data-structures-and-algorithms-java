package codeChallenge.hashmap;


import codechallenge.hashmap.HashMapChallenges;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class HashMapChallengesTest {

  @Test
  public void testFirstRepeatedWordFound() {
    // Arrange
    HashMapChallenges challenges = new HashMapChallenges();
    String input = "Once upon a time, there was a brave princess who...";
    System.out.println("[Test First Repeated Word Found] Input: " + input);

    // Act
    String result = challenges.getFirstRepeatedWord(input);
    System.out.println("[Test First Repeated Word Found] First repeated word: " + result);

    // Assert
    assertEquals("a", result);
  }

  @Test
  public void testNoRepeatedWord() {
    // Arrange
    HashMapChallenges challenges = new HashMapChallenges();
    String input = "Every word is unique in this string.";
    System.out.println("[Test No Repeated Word] Input: " + input);

    // Act
    String result = challenges.getFirstRepeatedWord(input);
    System.out.println("[Test No Repeated Word] First repeated word: " + result);

    // Assert
    assertEquals("", result);
  }

  @Test
  public void testEmptyInput() {
    // Arrange
    HashMapChallenges challenges = new HashMapChallenges();
    String input = "";
    System.out.println("[Test Empty Input] Input: " + input);

    // Act
    String result = challenges.getFirstRepeatedWord(input);
    System.out.println("[Test Empty Input] First repeated word: " + result);

    // Assert
    assertEquals("", result);
  }

  @Test
  public void testMultipleRepeatedWords() {
    // Arrange
    HashMapChallenges challenges = new HashMapChallenges();
    String input = "It was the best of times, it was the worst of times";
    System.out.println("[Test Multiple Repeated Words] Input: " + input);

    // Act
    String result = challenges.getFirstRepeatedWord(input);
    System.out.println("[Test Multiple Repeated Words] First repeated word: " + result);

    // Assert
    assertEquals("it", result);
  }

  @Test
  public void testWithPunctuationAndMixedCase() {
    // Arrange
    HashMapChallenges challenges = new HashMapChallenges();
    String input = "Hello, hello! How are you?";
    System.out.println("[Test With Punctuation and Mixed Case] Input: " + input);

    // Act
    String result = challenges.getFirstRepeatedWord(input);
    System.out.println("[Test With Punctuation and Mixed Case] First repeated word: " + result);

    // Assert
    assertEquals("hello", result);
  }

  @Test
  public void testLongText2() {
    // Arrange
    HashMapChallenges challenges = new HashMapChallenges();
    String input = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
    System.out.println("[Test Long Text 2] Input: " + input);

    // Act
    String result = challenges.getFirstRepeatedWord(input);
    System.out.println("[Test Long Text 2] First repeated word: " + result);

    // Assert
    assertEquals("it", result);
  }

  @Test
  public void testLongText3() {
    // Arrange
    HashMapChallenges challenges = new HashMapChallenges();
    String input = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
    System.out.println("[Test Long Text 3] Input: " + input);

    // Act
    String result = challenges.getFirstRepeatedWord(input);
    System.out.println("[Test Long Text 3] First repeated word: " + result);

    // Assert
    assertEquals("summer", result);
  }


  @Test
  public void testLongText4() {
    // Arrange
    HashMapChallenges hashMapChallenges = new HashMapChallenges();
    String input = "Don't don't worry about a thing, 'cause every little thing gonna be all right.";

    // Act
    System.out.println("[Test Long Text 4] Input: " + input);
    System.out.println("[Test Long Text 3] First repeated word: " + hashMapChallenges.getFirstRepeatedWord(input));

    assertEquals("don't", hashMapChallenges.getFirstRepeatedWord(input));
  }





}
