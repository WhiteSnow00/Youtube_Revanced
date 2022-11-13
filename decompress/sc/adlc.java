import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adlc implements Runnable
{
    public final String a;
    public final long b;
    public final long c;
    public final double d;
    public final Object e;
    private final int f;
    
    public adlc(final adld e, final String a, final long b, final long c, final double d, final int f) {
        this.f = f;
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public adlc(final jvj e, final String a, final long b, final long c, final double d, final int f) {
        this.f = f;
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void run() {
        if (this.f != 0) {
            final Object e = this.e;
            final String a = this.a;
            final long b = this.b;
            final long c = this.c;
            final double d = this.d;
            final jvj jvj = (jvj)e;
            final glk d2 = jvj.a.d(a, (String)null);
            if (d2 != null) {
                if (c != -1L) {
                    final double n = (double)b;
                    final double n2 = (double)c;
                    Double.isNaN(n);
                    Double.isNaN(n2);
                    d2.j = n / n2;
                }
                d2.k = d;
                jvj.a.j(d2);
            }
            return;
        }
        final Object e2 = this.e;
        final String a2 = this.a;
        final long b2 = this.b;
        final long c2 = this.c;
        final double d3 = this.d;
        final Iterator iterator = ((adld)e2).a.iterator();
        while (iterator.hasNext()) {
            ((adle)iterator.next()).f(a2, b2, c2, d3);
        }
    }
}
