package fi.kajstrom.EFP.E06;

import fi.kajstrom.EFP.Console;

import java.util.Calendar;

public class RetirementCalculator {
    private Console console;
    private RetirementChecker checker;

    public RetirementCalculator (Console console, RetirementChecker checker) {
        this.console = console;
        this.checker = checker;
    }

    public void start() {
        console.print("What is your current age? ");
        String enteredAge = this.console.readLine();

        console.print("At what age would you like to retire? ");
        String enteredRetirementAge = this.console.readLine();

        Integer age = Integer.parseInt(enteredAge);
        Integer ageToRetire = Integer.parseInt(enteredRetirementAge);

        Integer yearsToRetirement = this.checker.yearsToRetirement(age, ageToRetire);

        if (yearsToRetirement > 0) {
            this.console.println(String.format("You have %s years left until you can retire.", yearsToRetirement));

            Integer currentYear = Calendar.getInstance().get(Calendar.YEAR);
            Integer yearToRetire = checker.yearToRetire(yearsToRetirement, currentYear);

            console.println(String.format("It's %s, so you can retire in %s.", currentYear, yearToRetire));
        } else {
            console.println("You should have retired already!");
        }
    }
}
