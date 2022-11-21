import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmm
{
    public final String a;
    public final List b;
    
    public agmm() {
    }
    
    public agmm(final String a, final List b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof agmm) {
            final agmm agmm = (agmm)o;
            if (this.a.equals(agmm.a) && this.b.equals(agmm.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String string = this.b.toString();
        final StringBuilder sb = new StringBuilder("HeartBeatResult{userAgent=");
        sb.append(a);
        sb.append(", usedDates=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
