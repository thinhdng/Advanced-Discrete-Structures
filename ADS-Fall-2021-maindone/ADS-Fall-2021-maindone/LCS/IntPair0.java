public class IntPair0 {
    int f, s;

    public IntPair0(int x, int y) {
        this.f = x;
        this.s = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime * (prime + f) + s;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IntPair0 other = (IntPair0) obj;
        if (f != other.f)
            return false;
        if (s != other.s)
            return false;
        return true;
    }
    
}
