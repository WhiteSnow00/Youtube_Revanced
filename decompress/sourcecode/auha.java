import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class auha extends aufe implements Serializable
{
    private static final long serialVersionUID = -2554245107589433218L;
    public final aufg d;
    
    protected auha(final aufg d) {
        this.d = d;
    }
    
    public int a(final long n, final long n2) {
        return aujh.d(this.d(n, n2));
    }
    
    public final aufg f() {
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
