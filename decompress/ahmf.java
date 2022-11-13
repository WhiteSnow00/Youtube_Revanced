// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmf extends vfk
{
    private final ahaz a;
    
    private ahmf() {
        final ahmh a = ahmh.a;
        throw null;
    }
    
    public ahmf(final ahaz a) {
        this.a = a;
    }
    
    public final /* bridge */ vfn a(final vfp vfp) {
        return (vfn)this.c();
    }
    
    public final void b(final Boolean b) {
        final ahaz a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final ahmh ahmh = (ahmh)a.instance;
        final ahmh a2 = ahmh.a;
        ahmh.b |= 0x2;
        ahmh.d = booleanValue;
    }
    
    public final ahmg c() {
        return new ahmg((ahmh)this.a.build());
    }
}
