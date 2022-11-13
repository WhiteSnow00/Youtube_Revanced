import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class auhr extends aufv implements Serializable
{
    private static final long serialVersionUID = -2554245107589433218L;
    public final aufx d;
    
    protected auhr(final aufx d) {
        this.d = d;
    }
    
    public int a(final long n, final long n2) {
        return atoc.g(this.d(n, n2));
    }
    
    public final /* bridge */ int compareTo(final Object o) {
        final long e = ((aufv)o).e();
        final long e2 = this.e();
        int n;
        if (e2 == e) {
            n = 0;
        }
        else {
            if (e2 >= e) {
                return 1;
            }
            n = -1;
        }
        return n;
    }
    
    public final aufx f() {
        return this.d;
    }
    
    public final boolean h() {
        return true;
    }
    
    public final String toString() {
        final String m = this.d.m;
        final StringBuilder sb = new StringBuilder("DurationField[");
        sb.append(m);
        sb.append("]");
        return sb.toString();
    }
}
