// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgm extends vdj
{
    public final agza a;
    
    private ajgm() {
        final ajgp a = ajgp.a;
        throw null;
    }
    
    public ajgm(final agza a) {
        this.a = a;
    }
    
    public final void b(final String f) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajgp ajgp = (ajgp)a.instance;
        final ajgp a2 = ajgp.a;
        f.getClass();
        ajgp.c |= 0x4;
        ajgp.f = f;
    }
    
    public final ajgo c() {
        return new ajgo((ajgp)this.a.build());
    }
}
