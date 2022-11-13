import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjp implements afty
{
    public final adjv a;
    public final String b;
    public final Object c;
    public final asjs d;
    public final asjr e;
    public final asji f;
    
    public adjp(final adjv a, final String b, final Object c, final asjs d, final asjr e, final asji f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final ListenableFuture a() {
        final adjv a = this.a;
        final String b = this.b;
        final Object c = this.c;
        final asjs d = this.d;
        final asjr e = this.e;
        final asji f = this.f;
        final admv b2 = a.g.b(b);
        b2.getClass();
        c.getClass();
        d.getClass();
        e.getClass();
        adlq a2;
        if (d.a((Object)b2) && c.equals(e.a((Object)b2))) {
            a2 = null;
        }
        else {
            a2 = a.g.a(b, new adjm(f, c, 1));
            a.G(b, a2);
        }
        return afwm.m((Object)aezp.k((Object)a.b(b2, a2)));
    }
}
