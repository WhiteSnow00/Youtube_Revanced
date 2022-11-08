import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oen
{
    public final String a;
    public final Map b;
    public final int c;
    public final int d;
    
    public oen(final String a, final Map b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final oej a() {
        final Iterator iterator = this.b.values().iterator();
        long n = 0L;
        long n3;
        long n2 = n3 = n;
        while (iterator.hasNext()) {
            final oej oej = (oej)iterator.next();
            n += oej.b;
            n2 += oej.c;
            n3 += oej.d;
        }
        return oej.a(n, n2, n3);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ThreadPoolStatsSnapshot{threadPoolName='");
        sb.append(this.a);
        sb.append("', startedTaskCount=");
        sb.append(this.c);
        sb.append(", finishedTaskCount=");
        sb.append(this.d);
        sb.append(", taskSchedStats=");
        sb.append(this.b);
        sb.append(", aggregatedSchedStats=");
        sb.append(this.a());
        sb.append('}');
        return sb.toString();
    }
}
