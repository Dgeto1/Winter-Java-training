public class Range {
    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public boolean contains(int n) {
        return n >= start && n <= end ? true : false;
    }

    public boolean overlaps(Range r) {
        return r.start == start || r.end == end ? true : false;
    }

    public boolean merge(Range r) {
        if(r.start > start && r.end > end) {
            r.end = end;
            return true;
        }
        return false;
    }
}

