import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ambh extends vgs
{
    public final ahcr a;
    
    private ambh() {
        final ambl a = ambl.a;
        throw null;
    }
    
    public ambh(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)new ambj((ambl)this.a.build(), vgx);
    }
    
    public final void b(final Integer n, final anmm anmm) {
        if (anmm == null) {
            return;
        }
        final ahcr a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ambl ambl = (ambl)a.instance;
        final ambl a2 = ambl.a;
        final ahej l = ambl.l;
        if (!l.b) {
            ambl.l = l.a();
        }
        ((Map<Integer, anmm>)ambl.l).put(Integer.valueOf(intValue), anmm);
    }
}
