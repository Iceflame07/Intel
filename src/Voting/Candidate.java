package Voting;

public class Candidate extends votingApp {

    private String voterName = "Tinubu, Olu-peters";
    private static int voterAge = 18;
    private String voterEmail = "Tinubu419@gmail.com";

    public String Candidate(String voterName, int voterAge, String voterEmail) {
        this.voterName = voterName;
        this.voterAge = voterAge;
        this.voterEmail = voterEmail;
        return voterName;
    };

    public String getVoterName() {
        return voterName;
    };

    public int getVoterAge() {
        return voterAge;
    }

    public String getVoterEmail() {
        return voterEmail;
    };
}
