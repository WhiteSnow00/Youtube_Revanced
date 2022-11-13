import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class adgo implements adgq
{
    public final oby a;
    public long b;
    private final atke c;
    private final int d;
    private final long e;
    
    public adgo(final atke c, final aoqp aoqp, final oby a) {
        this.c = c;
        this.d = aoqp.c;
        this.e = TimeUnit.SECONDS.toMillis(aoqp.d);
        this.a = a;
    }
    
    public final int a() {
        return this.d;
    }
    
    public final boolean b() {
        final boolean b = ((adhf)this.c.a()).b();
        boolean b2 = false;
        if (!b) {
            final long e = this.e;
            if (e > 0L) {
                if (e + this.b > this.a.d()) {
                    return true;
                }
                b2 = b2;
            }
            else {
                b2 = true;
            }
        }
        return b2;
    }
}
