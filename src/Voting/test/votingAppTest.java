package Voting.test;

import Voting.Candidate;
import Voting.Parties;
import org.junit.jupiter.api.Test;
import static org.testng.Assert.assertEquals;

public class votingAppTest {


    @Test
    public void testMachingCountIsZero() {
        int machineCount = 0;
        votingAppTest votingApp = new votingAppTest();
        assertEquals(machineCount, 0);
    }

    @Test
    public void testMachingCountIsOne() {
        int machineCount = 1;
        votingAppTest votingApp = new votingAppTest();
        assertEquals(machineCount, 1);
    };

    @Test
    public void testForVoterName(){
        String voterName = "";
        VoterDetails voter = new VoterDetails();
        voter.getVoterName();
        assertEquals(voterName, voter.getVoterName());
    }

    @Test
    public void testThatCandidateIsQualifiedByAge() {
        int votingAge = 18;
        VoterDetails voter = new VoterDetails();
        voter.getVoterAge();
        assertEquals(votingAge, voter.getVoterAge());
    }

    @Test
    public void testForVoterEmail(){
        String voterEmail = "";
        VoterDetails voter = new VoterDetails();
        voter.getVoterEmail();
        assertEquals(voterEmail, voter.getVoterEmail());
    }

    @Test
    public void testForParties(){
        String Parties = "APC,PDP,LP,SCP";
        Parties parties = new Parties();
        parties.getParties();
        assertEquals(Parties, parties.getParties());

    }
};