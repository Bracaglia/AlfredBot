import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "I'm good, my name is " + name + ". What's today's date?";
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "Current date is: " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        String alexis = "Alexis";
        String alfred = "Alfred";
        if(conversation.contains(alexis)){
               return "Right away, sir. She certainly isn't sophisticated enough for that.";
            } else if(conversation.contains(alfred)){
               return "At your service. As you wish, naturally.";
            } else {
               return "Right. And with that I shall retire.";
            }
        }
            

    }

    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!


