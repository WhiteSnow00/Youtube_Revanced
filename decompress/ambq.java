// 
// Decompiled by Procyon v0.6.0
// 

public final class ambq extends vfk
{
    public final ahaz a;
    
    private ambq() {
        final ambu a = ambu.a;
        throw null;
    }
    
    public ambq(final ahaz a) {
        this.a = a;
    }
    
    public final /* bridge */ vfn a(final vfp vfp) {
        return (vfn)this.d();
    }
    
    public final void b(final String j) {
        final ahaz a = this.a;
        a.copyOnWrite();
        final ambu ambu = (ambu)a.instance;
        final ambu a2 = ambu.a;
        ambu.c |= 0x80;
        ambu.j = j;
    }
    
    public final void c(final ambv ambv) {
        final ahaz a = this.a;
        a.copyOnWrite();
        final ambu ambu = (ambu)a.instance;
        final ambu a2 = ambu.a;
        ambu.i = ambv.d;
        ambu.c |= 0x40;
    }
    
    public final ambs d() {
        return new ambs((ambu)this.a.build());
    }
}
