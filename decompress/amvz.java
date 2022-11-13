// 
// Decompiled by Procyon v0.6.0
// 

public final class amvz extends vfk
{
    public final ahaz a;
    
    private amvz() {
        final amwc a = amwc.a;
        throw null;
    }
    
    public amvz(final ahaz a) {
        this.a = a;
    }
    
    public final /* bridge */ vfn a(final vfp vfp) {
        return (vfn)new amwb((amwc)this.a.build(), vfp);
    }
    
    public final void b(final amvy amvy) {
        final ahaz a = this.a;
        a.copyOnWrite();
        final amwc amwc = (amwc)a.instance;
        final amwc a2 = amwc.a;
        amwc.e = amvy.e;
        amwc.c |= 0x2;
    }
    
    public final void c(final Long n) {
        final ahaz a = this.a;
        final long longValue = n;
        a.copyOnWrite();
        final amwc amwc = (amwc)a.instance;
        final amwc a2 = amwc.a;
        amwc.c |= 0x4;
        amwc.f = longValue;
    }
    
    public final void d(final Long n) {
        final ahaz a = this.a;
        final long longValue = n;
        a.copyOnWrite();
        final amwc amwc = (amwc)a.instance;
        final amwc a2 = amwc.a;
        amwc.c |= 0x20;
        amwc.i = longValue;
    }
    
    public final void e(final amuc h) {
        final ahaz a = this.a;
        a.copyOnWrite();
        final amwc amwc = (amwc)a.instance;
        final amwc a2 = amwc.a;
        h.getClass();
        amwc.h = h;
        amwc.c |= 0x10;
    }
    
    public final void f(final ahab g) {
        final ahaz a = this.a;
        a.copyOnWrite();
        final amwc amwc = (amwc)a.instance;
        final amwc a2 = amwc.a;
        amwc.c |= 0x8;
        amwc.g = g;
    }
    
    public final void g(final amub j) {
        final ahaz a = this.a;
        a.copyOnWrite();
        final amwc amwc = (amwc)a.instance;
        final amwc a2 = amwc.a;
        j.getClass();
        amwc.j = j;
        amwc.c |= 0x40;
    }
}
