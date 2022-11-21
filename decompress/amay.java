// 
// Decompiled by Procyon v0.6.0
// 

public final class amay extends vgs
{
    private final ahcr a;
    
    private amay() {
        final ambb a = ambb.a;
        throw null;
    }
    
    public amay(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)new amba((ambb)this.a.build());
    }
    
    public final void b(final amax amax) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ambb ambb = (ambb)a.instance;
        final ambb a2 = ambb.a;
        ambb.e = amax.c;
        ambb.c |= 0x2;
    }
}
