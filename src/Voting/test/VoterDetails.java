package Voting.test;

public class VoterDetails extends votingAppTest {

    private String voterName = "";
    private static int voterAge = 18;
    private String voterEmail = "";

    public String Voter(String voterName, int voterAge, String voterEmail) {
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
