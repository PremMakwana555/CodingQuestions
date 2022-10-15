package com.demo.codin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {

        int result = 1;
        //Time[] times = new Time[start.size()];
        List<Time> times = new ArrayList<>();
        for (int i = 0; i < start.size(); i++) {
            times.add(new Time(start.get(i), end.get(i)));
        }
        Collections.sort(times, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                return (o1.time - o2.time);
            }
        });

        int starting = times.get(0).start;
        int ending = times.get(0).end;
        for (int i = 1; i < start.size(); i++) {
            if (times.get(i).start >= ending) {
                result++;

                starting = times.get(i).start;
                ending = times.get(i).end;
            }

        }

        return result;

    }

    static class Time  {

        int start;
        int end;
        int time;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
            time = end - start;
        }


    }
}
