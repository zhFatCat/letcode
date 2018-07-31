package lou.study.letcode.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SummaryRanges {
    List<Interval> ranges = new ArrayList<Interval>();

    public SummaryRanges() {

    }

    public void addNum(int val) {
        Iterator<Interval> it = ranges.iterator();
        boolean finish = false;
        while (it.hasNext()) {
            Interval next = it.next();
            if (next.start <= val && next.end >= val) {
                finish = true;
                if (next.start != next.end) {
                    it.remove();
                    ranges.add(new Interval(next.start, val));
                    ranges.add(new Interval(val, next.end));
                    break;
                }
            }
        }
        if (!finish) {
            ranges.add(new Interval(val, val));
        }

    }

    public List<Interval> getIntervals() {
        return ranges;
    }

    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}

