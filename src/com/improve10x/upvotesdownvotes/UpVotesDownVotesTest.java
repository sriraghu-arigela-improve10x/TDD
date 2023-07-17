package com.improve10x.upvotesdownvotes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpVotesDownVotesTest {

    private UpVotesDownVotes upVotesDownVotes;

    @Before
    public void setup(){
        upVotesDownVotes = new UpVotesDownVotes();
    }

    @Test
    public void nothing() {
    }

    /*getVoteCount({ upvotes: 0, downvotes: 0 }) ➞ 0
*/
    @Test
    public void givenZeroVotes_returnZeroVotes() {
        int votes = upVotesDownVotes.findVoteCount(0, 0);
        assertEquals(0, votes);
    }

    //getVoteCount({ upvotes: 13, downvotes: 0 }) ➞ 13
    @Test
    public void givenThirteenVotes_returnZeroVotes() {
        int votes = upVotesDownVotes.findVoteCount(13, 0);
        assertEquals(13, votes);
    }

//    getVoteCount({ upvotes: 2, downvotes: 33 }) ➞ -31
    @Test
    public void givenTwoVotes_returnThirtyThreeVotes() {
        int votes = upVotesDownVotes.findVoteCount(2, 33);
        assertEquals(-31, votes);
    }

//    getVoteCount({ upvotes: 132, downvotes: 132 }) ➞ 0
    @Test
    public void givenOneThirtyTwoVotes_returnOneThirtyTwoVotes() {
        int votes = upVotesDownVotes.findVoteCount(133, 133);
        assertEquals(0, votes);
    }
}
