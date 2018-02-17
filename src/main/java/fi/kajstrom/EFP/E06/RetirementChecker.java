package fi.kajstrom.EFP.E06;

public class RetirementChecker {
    public Integer yearsToRetirement(Integer age, Integer ageToRetire) {
        return ageToRetire - age;
    }

    public Integer yearToRetire(Integer yearsToRetirement, Integer currentYear) {
        return currentYear + yearsToRetirement;
    }
}
