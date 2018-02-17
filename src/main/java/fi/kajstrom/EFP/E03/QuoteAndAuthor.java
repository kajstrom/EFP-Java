package fi.kajstrom.EFP.E03;

import fi.kajstrom.EFP.Console;

public class QuoteAndAuthor {

    protected Console console;

    public QuoteAndAuthor(Console console) {
        this.console = console;
    }

    public void start() {
        String quote = askForQuote();
        String author = askForAuthor();

        repeatQuote(quote, author);
    }

    protected String askForQuote() {
        console.print("What is the quote? ");
        return console.readLine();
    }

    protected String askForAuthor() {
        console.print("Who said it? ");
        return console.readLine();
    }

    protected void repeatQuote(String quote, String author) {
        String quoteWithAuthor = author + " says, \"" + quote + "\"";
        console.println(quoteWithAuthor);
    }
}
