// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkp extends vgs
{
    public final ahcr a;
    
    private ajkp() {
        final ajks a = ajks.a;
        throw null;
    }
    
    public ajkp(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)this.c();
    }
    
    public final void b(final String f) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajks ajks = (ajks)a.instance;
        final ajks a2 = ajks.a;
        f.getClass();
        ajks.c |= 0x4;
        ajks.f = f;
    }
    
    public final ajkr c() {
        return new ajkr((ajks)this.a.build());
    }
}
