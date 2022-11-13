// 
// Decompiled by Procyon v0.6.0
// 

public final class kjc implements Comparable
{
    public final String a;
    public final String b;
    public final int c;
    
    public kjc() {
    }
    
    public kjc(final String a, final String b, final int c) {
        if (a == null) {
            throw new NullPointerException("Null regionName");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null regionCode");
    }
    
    @Override
    public final int compareTo(final Object o) {
        return this.a.compareTo(((kjc)o).a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kjc) {
            final kjc kjc = (kjc)o;
            if (this.a.equals(kjc.a) && this.b.equals(kjc.b) && this.c == kjc.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final int c = this.c;
        final StringBuilder sb = new StringBuilder("RegionEntry{regionName=");
        sb.append(a);
        sb.append(", regionCode=");
        sb.append(b);
        sb.append(", callingCode=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
