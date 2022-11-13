// 
// Decompiled by Procyon v0.6.0
// 

public final class aour extends vfk
{
    private final ahaz a;
    
    private aour() {
        final aouu a = aouu.a;
        throw null;
    }
    
    public aour(final ahaz a) {
        this.a = a;
    }
    
    public final /* bridge */ vfn a(final vfp vfp) {
        return (vfn)this.c();
    }
    
    public final void b(final aouw d) {
        final ahaz a = this.a;
        a.copyOnWrite();
        final aouu aouu = (aouu)a.instance;
        final aouu a2 = aouu.a;
        d.getClass();
        aouu.d = d;
        aouu.b |= 0x2;
    }
    
    public final aout c() {
        return new aout((aouu)this.a.build());
    }
}
