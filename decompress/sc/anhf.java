// 
// Decompiled by Procyon v0.6.0
// 

public final class anhf extends vfk
{
    private final ahaz a;
    
    private anhf() {
        final anhi a = anhi.a;
        throw null;
    }
    
    public anhf(final ahaz a) {
        this.a = a;
    }
    
    public final /* bridge */ vfn a(final vfp vfp) {
        return (vfn)this.d();
    }
    
    public final void b(final anhj anhj) {
        final ahaz a = this.a;
        a.copyOnWrite();
        final anhi anhi = (anhi)a.instance;
        final anhi a2 = anhi.a;
        anhi.f = anhj.d;
        anhi.c |= 0x4;
    }
    
    public final void c(final anhk anhk) {
        final ahaz a = this.a;
        a.copyOnWrite();
        final anhi anhi = (anhi)a.instance;
        final anhi a2 = anhi.a;
        anhi.e = anhk.i;
        anhi.c |= 0x2;
    }
    
    public final anhh d() {
        return new anhh((anhi)this.a.build());
    }
}
