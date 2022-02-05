package Day14;

import java.time.Instant;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// In Regular Expression REGEX, pattern is used for set the initial value
// matcher is used for checking the value with pattern.
// RegEx is used for finding the string match

public class RegularExpression {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools",Pattern.CASE_INSENSITIVE );
        Matcher matcher = pattern.matcher("Welcome to W3Schools");
        boolean match = matcher.find();
        if(match){
            System.out.println("Match Found");
        }
        else
        {
            System.out.println("Match Not Found");
        }
    }
}
