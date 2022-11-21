// 
// Decompiled by Procyon v0.6.0
// 

public final class aqar extends vgs
{
    private final ahcr a;
    
    private aqar() {
        final aqau a = aqau.a;
        throw null;
    }
    
    public aqar(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)this.c();
    }
    
    public final void b(final apqo apqo) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final aqau aqau = (aqau)a.instance;
        final aqau a2 = aqau.a;
        aqau.f = apqo.e;
        aqau.c |= 0x4;
    }
    
    public final aqat c() {
        return new aqat((aqau)this.a.build());
    }
}
