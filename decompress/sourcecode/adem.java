import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class adem implements adeo
{
    public final oas a;
    public long b;
    private final atjj c;
    private final int d;
    private final long e;
    
    public adem(final atjj c, final aoom aoom, final oas a) {
        this.c = c;
        this.d = aoom.c;
        this.e = TimeUnit.SECONDS.toMillis(aoom.d);
        this.a = a;
    }
    
    public final int a() {
        return this.d;
    }
    
    public final boolean b() {
        final boolean b = ((adfc)this.c.a()).b();
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
