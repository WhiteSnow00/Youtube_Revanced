// 
// Decompiled by Procyon v0.6.0
// 

public final class aajh implements aakr
{
    public final amzj a;
    public final String b;
    public final byte[] c;
    public final Object d;
    public final Object e;
    private final int f;
    
    public aajh(final aajm d, final amzj a, final xab e, final String b, final byte[] c, final int f) {
        this.f = f;
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
    }
    
    public aajh(final iod e, final amzj a, final xab d, final String b, final byte[] c, final int f) {
        this.f = f;
        this.e = e;
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final amze amze, final amvf amvf) {
        if (this.f != 0) {
            final Object e = this.e;
            final amzj a = this.a;
            final Object d = this.d;
            final String b = this.b;
            final byte[] c = this.c;
            aamn.t(a, (xab)d, null, b, amze, false, aacw.a, amvf);
            ((aajm)e).l(b, amze, aacw.a, c);
            return;
        }
        final Object d2 = this.d;
        final amzj a2 = this.a;
        final Object e2 = this.e;
        final String b2 = this.b;
        final byte[] c2 = this.c;
        aamn.t(a2, (xab)e2, null, b2, amze, false, aacw.a, amvf);
        ((aajm)d2).l(b2, amze, aacw.a, c2);
    }
}
