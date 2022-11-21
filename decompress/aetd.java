import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetd
{
    public final Set a;
    public final long b;
    public final afbh c;
    
    public aetd() {
    }
    
    public aetd(final Set a, final long b, final afbh c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static aetd a(final aetd aetd, final aetd aetd2) {
        adme.T(aetd.a.equals(aetd2.a));
        final HashSet set = new HashSet();
        final afag a = afag.a;
        aegu.K(aetd.a, set);
        final long min = Math.min(aetd.b, aetd2.b);
        afbh afbh = aetd.c;
        final boolean h = afbh.h();
        final afbh c = aetd2.c;
        if (h && c.h()) {
            afbh = afbh.k(Math.min((long)afbh.c(), (long)c.c()));
        }
        else if (!afbh.h()) {
            afbh = a;
            if (c.h()) {
                afbh = c;
            }
        }
        return aegu.J(set, min, afbh);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aetd) {
            final aetd aetd = (aetd)o;
            if (this.a.equals(aetd.a) && this.b == aetd.b && this.c.equals(aetd.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return ((hashCode ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final long b = this.b;
        final String string2 = this.c.toString();
        final StringBuilder sb = new StringBuilder("SyncSchedule{constraints=");
        sb.append(string);
        sb.append(", minLatencyBeforeCheckingConstraints=");
        sb.append(b);
        sb.append(", deadlineToIgnoreOptionalConstraints=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
