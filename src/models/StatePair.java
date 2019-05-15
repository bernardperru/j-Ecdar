package models;

public class StatePair {
    private final State left, right;

    public StatePair(State state1, State state2) {
        this.left = state1;
        this.right = state2;
    }

    public State getLeft() {
        return left;
    }

    public State getRight() {
        return right;
    }

    public String prettyPrint() {
        return "L=(" + left.getLocation() + ", " + right.getLocation() + ")  Z=" + left.getInvZone();
    }

    @Override
    public String toString() {
        //return "L=" + left + ", R=" + right;
        return "L=(" + left.getLocation() + ", " + right.getLocation() + ")  Z=" + left.getInvZone() + "  " + right.getInvZone();
    }
}
