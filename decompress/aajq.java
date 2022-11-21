// 
// Decompiled by Procyon v0.6.0
// 

public final class aajq implements aakr
{
    public final amzj a;
    public final String b;
    public final byte[] c;
    public final aakk d;
    public final int e;
    public final Object f;
    public final Object g;
    private final int h;
    
    public aajq(final aajt f, final amzj a, final xab g, final String b, final byte[] c, final aakk d, final int e, final int h) {
        this.h = h;
        this.f = f;
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public aajq(final ioe g, final amzj a, final xab f, final String b, final byte[] c, final aakk d, final int e, final int h) {
        this.h = h;
        this.g = g;
        this.a = a;
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void a(final amze amze, final amvf amvf) {
        if (this.h != 0) {
            final Object g = this.g;
            final amzj a = this.a;
            final Object f = this.f;
            final String b = this.b;
            final byte[] c = this.c;
            final aakk d = this.d;
            final int e = this.e;
            aamn.t(a, (xab)f, b, null, amze, false, aacw.a, amvf);
            ((ioe)g).l(b, amze, (String)null, aacw.a, c, d, e);
            return;
        }
        final Object f2 = this.f;
        final amzj a2 = this.a;
        final Object g2 = this.g;
        final String b2 = this.b;
        final byte[] c2 = this.c;
        final aakk d2 = this.d;
        final int e2 = this.e;
        aamn.t(a2, (xab)g2, b2, null, amze, false, aacw.a, amvf);
        ((aajt)f2).l(b2, amze, null, aacw.a, c2, d2, e2);
    }
}
