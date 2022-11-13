// 
// Decompiled by Procyon v0.6.0
// 

public final class asxx extends asht
{
    final ashw[] a;
    
    public asxx(final ashw[] a) {
        this.a = a;
    }
    
    public final void f(final ashy ashy) {
        final ashw[] a = this.a;
        final asxv asxv = new asxv(ashy);
        final asxw[] b = asxv.b;
        final int n = 0;
        int n2;
        for (int i = 0; i < 2; i = n2) {
            n2 = i + 1;
            b[i] = new asxw(asxv, n2, asxv.a);
        }
        asxv.c.lazySet(0);
        asxv.a.d(asxv);
        for (int n3 = n; n3 < 2 && asxv.c.get() == 0; ++n3) {
            a[n3].aP(b[n3]);
        }
    }
}
