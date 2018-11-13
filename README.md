# Semantic Integration Technical Test

Here is my solution for the Semantic Integration software developer techinal test along with implemented unit tests for each.

### Margin Calculator

> In business, the "margin" is calculated as the percentage difference between "revenue" and "cost of goods sold" (COGS), for example if costs are £400, and revenue is £500, then the margin is 20% (i.e. £100 is 20% of £500). 

> Implement the following:
```java
import java.math.BigDecimal;

public interface RevenueCalculator {

  BigDecimal calculateRevenue(
    BigDecimal marginPercentage,
    BigDecimal costOfGoods
  );
  
}
```

### Word Counter

> Write a simple service to read a document (assume a string of plain text, sample attached) and count the occurrences of each word (exclude punctuation).

> Implement the following:
```java
public interface WordCountService {

  Map<String, Integer> countWords(final String text);
  
}
```
