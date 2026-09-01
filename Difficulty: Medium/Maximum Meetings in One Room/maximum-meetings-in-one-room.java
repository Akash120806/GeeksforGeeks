import java.util.*;

class meeting {
    int start;
    int end;
    int pos;

    meeting(int start, int end, int pos) {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

class meetingComparator implements Comparator<meeting> {

    public int compare(meeting o1, meeting o2) {

        if (o1.end < o2.end)
            return -1;

        else if (o1.end > o2.end)
            return 1;

        else if (o1.pos < o2.pos)
            return -1;

        return 1;
    }
}

class Solution {
    public ArrayList<Integer> maxMeetings(int start[], int end[]) {

        int n = start.length;

        ArrayList<meeting> meet = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            meet.add(new meeting(start[i], end[i], i + 1));
        }

        meetingComparator mc = new meetingComparator();

        Collections.sort(meet, mc);

        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(meet.get(0).pos);

        int limit = meet.get(0).end;

        for (int i = 1; i < n; i++) {

            if (meet.get(i).start > limit) {
                limit = meet.get(i).end;
                answer.add(meet.get(i).pos);
            }
        }

        Collections.sort(answer);

        return answer;
    }
}