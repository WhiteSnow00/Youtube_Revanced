import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqbj extends vgs
{
    public final ahcr a;
    
    private aqbj() {
        final aqbn a = aqbn.a;
        throw null;
    }
    
    public aqbj(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)new aqbl((aqbn)this.a.build(), vgx);
    }
    
    public final void b(final Integer n, final anmm anmm) {
        if (anmm == null) {
            return;
        }
        final ahcr a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final aqbn aqbn = (aqbn)a.instance;
        final aqbn a2 = aqbn.a;
        final ahej n2 = aqbn.n;
        if (!n2.b) {
            aqbn.n = n2.a();
        }
        ((Map<Integer, anmm>)aqbn.n).put(Integer.valueOf(intValue), anmm);
    }
}
