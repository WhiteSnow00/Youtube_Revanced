import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaar
{
    public final afcr a;
    public final Integer b;
    public final Integer c;
    
    public aaar() {
    }
    
    public aaar(final afcr a, final Integer b, final Integer c) {
        if (a != null) {
            this.a = a;
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null shuffleOrder");
    }
    
    public static aaar a(final afcr afcr, final Integer n, final Integer n2) {
        return new aaar(afcr, n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aaar) {
            final aaar aaar = (aaar)o;
            if (adwd.ar((List)this.a, (Object)aaar.a) && this.b.equals(aaar.b) && this.c.equals(aaar.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final Integer b = this.b;
        final Integer c = this.c;
        final StringBuilder sb = new StringBuilder("ShuffleInfo{shuffleOrder=");
        sb.append(string);
        sb.append(", shuffleIndex=");
        sb.append(b);
        sb.append(", loopShuffleFlags=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
