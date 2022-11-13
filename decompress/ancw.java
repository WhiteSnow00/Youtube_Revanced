// 
// Decompiled by Procyon v0.6.0
// 

public final class ancw extends vfk
{
    public final ahbb a;
    
    private ancw() {
        final ancz a = ancz.a;
        throw null;
    }
    
    public ancw(final ahbb a) {
        this.a = a;
    }
    
    public final /* bridge */ vfn a(final vfp vfp) {
        return (vfn)new ancy((ancz)((ahaz)this.a).build(), vfp);
    }
    
    public final void b(final String k) {
        final ahbb a = this.a;
        ((ahaz)a).copyOnWrite();
        final ancz ancz = (ancz)a.instance;
        final ancz a2 = ancz.a;
        k.getClass();
        ancz.c |= 0x40;
        ancz.k = k;
    }
    
    public final void c(final String m) {
        final ahbb a = this.a;
        ((ahaz)a).copyOnWrite();
        final ancz ancz = (ancz)a.instance;
        final ancz a2 = ancz.a;
        m.getClass();
        ancz.c |= 0x80;
        ancz.m = m;
    }
    
    public final void d(final String i) {
        final ahbb a = this.a;
        ((ahaz)a).copyOnWrite();
        final ancz ancz = (ancz)a.instance;
        final ancz a2 = ancz.a;
        i.getClass();
        ancz.c |= 0x20;
        ancz.i = i;
    }
    
    public final void e(final ahab e) {
        final ahbb a = this.a;
        ((ahaz)a).copyOnWrite();
        final ancz ancz = (ancz)a.instance;
        final ancz a2 = ancz.a;
        ancz.c |= 0x2;
        ancz.e = e;
    }
    
    public final void f(final Long n) {
        final ahbb a = this.a;
        final long longValue = n;
        ((ahaz)a).copyOnWrite();
        final ancz ancz = (ancz)a.instance;
        final ancz a2 = ancz.a;
        ancz.c |= 0x8;
        ancz.g = longValue;
    }
}
