// 
// Decompiled by Procyon v0.6.0
// 

public final class amdq extends vgs
{
    public final ahcr a;
    
    private amdq() {
        final amdu a = amdu.a;
        throw null;
    }
    
    public amdq(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)this.d();
    }
    
    public final void b(final String j) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final amdu amdu = (amdu)a.instance;
        final amdu a2 = amdu.a;
        amdu.c |= 0x80;
        amdu.j = j;
    }
    
    public final void c(final amdv amdv) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final amdu amdu = (amdu)a.instance;
        final amdu a2 = amdu.a;
        amdu.i = amdv.d;
        amdu.c |= 0x40;
    }
    
    public final amds d() {
        return new amds((amdu)this.a.build());
    }
}
