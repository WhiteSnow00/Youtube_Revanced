// 
// Decompiled by Procyon v0.6.0
// 

final class bnq extends bnl
{
    public static final Object c;
    public final Object d;
    private final Object e;
    
    static {
        c = new Object();
    }
    
    public bnq(final azm azm, final Object e, final Object d) {
        super(azm);
        this.e = e;
        this.d = d;
    }
    
    public static bnq s(final azm azm, final Object o, final Object o2) {
        return new bnq(azm, o, o2);
    }
    
    public final int a(final Object o) {
        final azm b = this.b;
        Object o2 = o;
        if (bnq.c.equals(o)) {
            final Object d = this.d;
            o2 = o;
            if (d != null) {
                o2 = d;
            }
        }
        return b.a(o2);
    }
    
    public final azk d(final int n, final azk azk, final boolean b) {
        this.b.d(n, azk, b);
        if (bax.aa(azk.b, this.d) && b) {
            azk.b = bnq.c;
        }
        return azk;
    }
    
    public final azl e(final int n, final azl azl, final long n2) {
        this.b.e(n, azl, n2);
        if (bax.aa(azl.b, this.e)) {
            azl.b = azl.a;
        }
        return azl;
    }
    
    public final Object f(final int n) {
        Object o;
        if (bax.aa(o = this.b.f(n), this.d)) {
            o = bnq.c;
        }
        return o;
    }
    
    public final bnq r(final azm azm) {
        return new bnq(azm, this.e, this.d);
    }
}
