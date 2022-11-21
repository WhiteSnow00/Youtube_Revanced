import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aafn
{
    public final String a;
    public final long b;
    public final String[] c;
    public final long d;
    public final long e;
    
    public aafn(final String a, final long b, final String[] c, final long d) {
        a.getClass();
        this.a = a;
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = d;
        this.e = 0L;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof aafn)) {
            return false;
        }
        final aafn aafn = (aafn)o;
        if (aexq.c(this.a, aafn.a) && this.b == aafn.b && this.d == aafn.d && Arrays.equals(this.c, aafn.c)) {
            final long e = aafn.e;
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.d, 0L });
    }
}
