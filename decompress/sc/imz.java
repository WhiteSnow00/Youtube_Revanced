import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imz implements hza
{
    public final atke a;
    public final atke b;
    private final asid c;
    
    public imz(final asid c, final atke a, final atke b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final ashn a(final vns vns) {
        final grr grr = new grr(this, 14);
        final igr igr = new igr(this, 8);
        final String c = vns.c;
        Object o;
        if ("FElibrary".equals(c)) {
            o = ((afaq)grr).a();
        }
        else {
            final String k = fwc.k(c);
            if (!aezr.f(k)) {
                o = ((aezf)igr).apply((Object)k);
            }
            else {
                o = ashn.t();
            }
        }
        return (ashn)o;
    }
    
    public final ashn b(final Callable callable) {
        return ashn.y(callable).L(this.c).k((ashr)hki.e).i();
    }
}
