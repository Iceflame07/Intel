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
        Candidate candidate = new Candidate();
        candidate.getVoterName();
        assertEquals(voterName, candidate.getVoterName());
    }

    @Test
    public void testThatCandidateIsQualifiedByAge() {
        int votingAge = 18;
        Candidate candidate = new Candidate();
        candidate.getVoterAge();
        assertEquals(votingAge, candidate.getVoterAge());
    }

    @Test
    public void testForVoterEmail(){
        String voterEmail = "";
        Candidate candidate = new Candidate();
        candidate.getVoterEmail();
        assertEquals(voterEmail, candidate.getVoterEmail());
    }

    @Test
    public void testForParties(){
        String Parties = "APC,PDP,LP,SCP";
        Parties parties = new Parties();
        parties.getParties();
        assertEquals(Parties, parties.getParties());

    }
};