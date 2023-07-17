package com.improve10x.upvotesdownvotes;

public class UpVotesDownVotes {
    public int findVoteCount(int upVotes, int downVotes) {
        int votes = 0;
        votes = upVotes - downVotes;
        return votes;
    }
}
