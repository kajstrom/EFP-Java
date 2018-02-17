package fi.kajstrom.EFP.E04;

import fi.kajstrom.EFP.Console;

public class MadLib {
    protected Console console;

    public MadLib(Console console) {
        this.console = console;
    }

    public void start() {
        String noun = askForNoun();
        String verb = askForVerb();
        String adjective = askForAdjective();
        String adverb = askForAdverb();

        String story = makeStory(noun, verb, adjective, adverb);
        console.println(story);
    }

    protected String askForNoun() {
        console.print("Enter a noun: ");
        return console.readLine();
    }

    protected String askForVerb() {
        console.print("Enter a verb: ");
        return console.readLine();
    }

    protected String askForAdjective() {
        console.print("Enter an adjective: ");
        return console.readLine();
    }

    protected String askForAdverb() {
        console.print("Enter an adverb: ");
        return console.readLine();
    }

    protected String makeStory(String noun, String verb, String adjective, String adverb) {
        return String.format("Do you %s your %s %s %s? That's hilarious!",
                verb,
                adjective,
                noun,
                adverb);
    }
}
