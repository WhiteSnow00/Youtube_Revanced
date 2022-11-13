// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvo extends vfk
{
    private final ahaz a;
    
    private ahvo() {
        final ahvq a = ahvq.a;
        throw null;
    }
    
    public ahvo(final ahaz a) {
        this.a = a;
    }
    
    public final /* bridge */ vfn a(final vfp vfp) {
        return (vfn)this.d();
    }
    
    public final void b(final String e) {
        final ahaz a = this.a;
        a.copyOnWrite();
        final ahvq ahvq = (ahvq)a.instance;
        final ahvq a2 = ahvq.a;
        e.getClass();
        ahvq.c |= 0x2;
        ahvq.e = e;
    }
    
    public final void c(final ahvs ahvs) {
        final ahaz a = this.a;
        a.copyOnWrite();
        final ahvq ahvq = (ahvq)a.instance;
        final ahvq a2 = ahvq.a;
        ahvq.f = ahvs.e;
        ahvq.c |= 0x4;
    }
    
    public final ahvp d() {
        return new ahvp((ahvq)this.a.build());
    }
}
